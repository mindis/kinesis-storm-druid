#!/bin/bash

PROTOS=./models/*.proto

for proto in $PROTOS
do
  echo 'Compiling...' $proto

  desc=${proto##*/}
  desc=${desc%.*}
  desc=./models/$desc.desc

  ./protobuf/src/protoc --descriptor_set_out=$desc --include_imports $proto
done

