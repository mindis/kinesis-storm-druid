#!/bin/bash


if [ ! -f /protobuf ]; then
  echo "Protobuf not installed...fetching from internet"
  git clone git@github.com:google/protobuf.git
  echo "Installing protobuf..."
  cd protobuf && ./autogen.sh && ./configure && make && make install && cd ..
fi

PROTOS=./models/*.proto

for proto in $PROTOS
do
  echo 'Compiling...' $proto

  desc=${proto##*/}
  desc=${desc%.*}
  desc=./models/$desc.desc

  ./protobuf/src/protoc --descriptor_set_out=$desc --include_imports $proto
done

