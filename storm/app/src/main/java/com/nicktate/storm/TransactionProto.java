// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/proto/transaction.proto

package com.nicktate.storm;

public final class TransactionProto {
  private TransactionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TransactionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.nicktate.Transaction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string orderNumber = 1;</code>
     */
    java.lang.String getOrderNumber();
    /**
     * <code>optional string orderNumber = 1;</code>
     */
    com.google.protobuf.ByteString
        getOrderNumberBytes();

    /**
     * <code>optional uint64 total = 2;</code>
     */
    long getTotal();
  }
  /**
   * Protobuf type {@code com.nicktate.Transaction}
   */
  public  static final class Transaction extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.nicktate.Transaction)
      TransactionOrBuilder {
    // Use Transaction.newBuilder() to construct.
    private Transaction(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private Transaction() {
      orderNumber_ = "";
      total_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Transaction(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();

              orderNumber_ = bs;
              break;
            }
            case 16: {

              total_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nicktate.storm.TransactionProto.internal_static_com_nicktate_Transaction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nicktate.storm.TransactionProto.internal_static_com_nicktate_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nicktate.storm.TransactionProto.Transaction.class, com.nicktate.storm.TransactionProto.Transaction.Builder.class);
    }

    public static final com.google.protobuf.Parser<Transaction> PARSER =
        new com.google.protobuf.AbstractParser<Transaction>() {
      public Transaction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Transaction(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Transaction> getParserForType() {
      return PARSER;
    }

    public static final int ORDERNUMBER_FIELD_NUMBER = 1;
    private java.lang.Object orderNumber_;
    /**
     * <code>optional string orderNumber = 1;</code>
     */
    public java.lang.String getOrderNumber() {
      java.lang.Object ref = orderNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          orderNumber_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string orderNumber = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderNumberBytes() {
      java.lang.Object ref = orderNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOTAL_FIELD_NUMBER = 2;
    private long total_;
    /**
     * <code>optional uint64 total = 2;</code>
     */
    public long getTotal() {
      return total_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (!getOrderNumberBytes().isEmpty()) {
        output.writeBytes(1, getOrderNumberBytes());
      }
      if (total_ != 0L) {
        output.writeUInt64(2, total_);
      }
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!getOrderNumberBytes().isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getOrderNumberBytes());
      }
      if (total_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, total_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.nicktate.storm.TransactionProto.Transaction parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.nicktate.storm.TransactionProto.Transaction prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.nicktate.Transaction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.nicktate.Transaction)
        com.nicktate.storm.TransactionProto.TransactionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.nicktate.storm.TransactionProto.internal_static_com_nicktate_Transaction_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.nicktate.storm.TransactionProto.internal_static_com_nicktate_Transaction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.nicktate.storm.TransactionProto.Transaction.class, com.nicktate.storm.TransactionProto.Transaction.Builder.class);
      }

      // Construct using com.nicktate.storm.TransactionProto.Transaction.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        orderNumber_ = "";

        total_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.nicktate.storm.TransactionProto.internal_static_com_nicktate_Transaction_descriptor;
      }

      public com.nicktate.storm.TransactionProto.Transaction getDefaultInstanceForType() {
        return com.nicktate.storm.TransactionProto.Transaction.getDefaultInstance();
      }

      public com.nicktate.storm.TransactionProto.Transaction build() {
        com.nicktate.storm.TransactionProto.Transaction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.nicktate.storm.TransactionProto.Transaction buildPartial() {
        com.nicktate.storm.TransactionProto.Transaction result = new com.nicktate.storm.TransactionProto.Transaction(this);
        result.orderNumber_ = orderNumber_;
        result.total_ = total_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.nicktate.storm.TransactionProto.Transaction) {
          return mergeFrom((com.nicktate.storm.TransactionProto.Transaction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.nicktate.storm.TransactionProto.Transaction other) {
        if (other == com.nicktate.storm.TransactionProto.Transaction.getDefaultInstance()) return this;
        if (!other.getOrderNumber().isEmpty()) {
          orderNumber_ = other.orderNumber_;
          onChanged();
        }
        if (other.getTotal() != 0L) {
          setTotal(other.getTotal());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.nicktate.storm.TransactionProto.Transaction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.nicktate.storm.TransactionProto.Transaction) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object orderNumber_ = "";
      /**
       * <code>optional string orderNumber = 1;</code>
       */
      public java.lang.String getOrderNumber() {
        java.lang.Object ref = orderNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            orderNumber_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string orderNumber = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOrderNumberBytes() {
        java.lang.Object ref = orderNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          orderNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string orderNumber = 1;</code>
       */
      public Builder setOrderNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        orderNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string orderNumber = 1;</code>
       */
      public Builder clearOrderNumber() {
        
        orderNumber_ = getDefaultInstance().getOrderNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional string orderNumber = 1;</code>
       */
      public Builder setOrderNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        orderNumber_ = value;
        onChanged();
        return this;
      }

      private long total_ ;
      /**
       * <code>optional uint64 total = 2;</code>
       */
      public long getTotal() {
        return total_;
      }
      /**
       * <code>optional uint64 total = 2;</code>
       */
      public Builder setTotal(long value) {
        
        total_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 total = 2;</code>
       */
      public Builder clearTotal() {
        
        total_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.nicktate.Transaction)
    }

    // @@protoc_insertion_point(class_scope:com.nicktate.Transaction)
    private static final com.nicktate.storm.TransactionProto.Transaction defaultInstance;static {
      defaultInstance = new com.nicktate.storm.TransactionProto.Transaction();
    }

    public static com.nicktate.storm.TransactionProto.Transaction getDefaultInstance() {
      return defaultInstance;
    }

    public com.nicktate.storm.TransactionProto.Transaction getDefaultInstanceForType() {
      return defaultInstance;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_nicktate_Transaction_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_nicktate_Transaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036models/proto/transaction.proto\022\014com.ni" +
      "cktate\"1\n\013Transaction\022\023\n\013orderNumber\030\001 \001" +
      "(\t\022\r\n\005total\030\002 \001(\004B&\n\022com.nicktate.stormB" +
      "\020TransactionProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_nicktate_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_nicktate_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_nicktate_Transaction_descriptor,
        new java.lang.String[] { "OrderNumber", "Total", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
