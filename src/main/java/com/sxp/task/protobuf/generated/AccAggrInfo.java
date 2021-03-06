// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/AccAggr.proto

package com.sxp.task.protobuf.generated;

public final class AccAggrInfo {
  private AccAggrInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AccAggrOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AccAggr)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 ID = 1;</code>
     */
    boolean hasID();
    /**
     * <code>required int64 ID = 1;</code>
     */
    long getID();

    /**
     * <code>required int64 AccTypeID = 2;</code>
     */
    boolean hasAccTypeID();
    /**
     * <code>required int64 AccTypeID = 2;</code>
     */
    long getAccTypeID();

    /**
     * <code>required int64 VehicleID = 3;</code>
     */
    boolean hasVehicleID();
    /**
     * <code>required int64 VehicleID = 3;</code>
     */
    long getVehicleID();

    /**
     * <code>required int64 StartTime = 4;</code>
     */
    boolean hasStartTime();
    /**
     * <code>required int64 StartTime = 4;</code>
     */
    long getStartTime();

    /**
     * <code>required int64 EndTime = 5;</code>
     */
    boolean hasEndTime();
    /**
     * <code>required int64 EndTime = 5;</code>
     */
    long getEndTime();

    /**
     * <code>required int32 Count = 6;</code>
     */
    boolean hasCount();
    /**
     * <code>required int32 Count = 6;</code>
     */
    int getCount();
  }
  /**
   * Protobuf type {@code AccAggr}
   */
  public static final class AccAggr extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AccAggr)
      AccAggrOrBuilder {
    // Use AccAggr.newBuilder() to construct.
    private AccAggr(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AccAggr(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AccAggr defaultInstance;
    public static AccAggr getDefaultInstance() {
      return defaultInstance;
    }

    public AccAggr getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AccAggr(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              iD_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              accTypeID_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              vehicleID_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              startTime_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              endTime_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              count_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AccAggrInfo.internal_static_AccAggr_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AccAggrInfo.internal_static_AccAggr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AccAggrInfo.AccAggr.class, AccAggrInfo.AccAggr.Builder.class);
    }

    public static com.google.protobuf.Parser<AccAggr> PARSER =
        new com.google.protobuf.AbstractParser<AccAggr>() {
      public AccAggr parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AccAggr(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AccAggr> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long iD_;
    /**
     * <code>required int64 ID = 1;</code>
     */
    public boolean hasID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 ID = 1;</code>
     */
    public long getID() {
      return iD_;
    }

    public static final int ACCTYPEID_FIELD_NUMBER = 2;
    private long accTypeID_;
    /**
     * <code>required int64 AccTypeID = 2;</code>
     */
    public boolean hasAccTypeID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 AccTypeID = 2;</code>
     */
    public long getAccTypeID() {
      return accTypeID_;
    }

    public static final int VEHICLEID_FIELD_NUMBER = 3;
    private long vehicleID_;
    /**
     * <code>required int64 VehicleID = 3;</code>
     */
    public boolean hasVehicleID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 VehicleID = 3;</code>
     */
    public long getVehicleID() {
      return vehicleID_;
    }

    public static final int STARTTIME_FIELD_NUMBER = 4;
    private long startTime_;
    /**
     * <code>required int64 StartTime = 4;</code>
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int64 StartTime = 4;</code>
     */
    public long getStartTime() {
      return startTime_;
    }

    public static final int ENDTIME_FIELD_NUMBER = 5;
    private long endTime_;
    /**
     * <code>required int64 EndTime = 5;</code>
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int64 EndTime = 5;</code>
     */
    public long getEndTime() {
      return endTime_;
    }

    public static final int COUNT_FIELD_NUMBER = 6;
    private int count_;
    /**
     * <code>required int32 Count = 6;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 Count = 6;</code>
     */
    public int getCount() {
      return count_;
    }

    private void initFields() {
      iD_ = 0L;
      accTypeID_ = 0L;
      vehicleID_ = 0L;
      startTime_ = 0L;
      endTime_ = 0L;
      count_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAccTypeID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVehicleID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStartTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, iD_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, accTypeID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, vehicleID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, startTime_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, endTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, count_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, iD_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, accTypeID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, vehicleID_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, startTime_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, endTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, count_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static AccAggrInfo.AccAggr parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AccAggrInfo.AccAggr parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AccAggrInfo.AccAggr parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AccAggrInfo.AccAggr parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AccAggrInfo.AccAggr parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static AccAggrInfo.AccAggr parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static AccAggrInfo.AccAggr parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static AccAggrInfo.AccAggr parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static AccAggrInfo.AccAggr parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static AccAggrInfo.AccAggr parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(AccAggrInfo.AccAggr prototype) {
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
     * Protobuf type {@code AccAggr}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AccAggr)
        AccAggrInfo.AccAggrOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AccAggrInfo.internal_static_AccAggr_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AccAggrInfo.internal_static_AccAggr_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AccAggrInfo.AccAggr.class, AccAggrInfo.AccAggr.Builder.class);
      }

      // Construct using AccAggrInfo.AccAggr.newBuilder()
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
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        iD_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        accTypeID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        vehicleID_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        startTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        endTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AccAggrInfo.internal_static_AccAggr_descriptor;
      }

      public AccAggrInfo.AccAggr getDefaultInstanceForType() {
        return AccAggrInfo.AccAggr.getDefaultInstance();
      }

      public AccAggrInfo.AccAggr build() {
        AccAggrInfo.AccAggr result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public AccAggrInfo.AccAggr buildPartial() {
        AccAggrInfo.AccAggr result = new AccAggrInfo.AccAggr(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.iD_ = iD_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.accTypeID_ = accTypeID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.vehicleID_ = vehicleID_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.startTime_ = startTime_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.endTime_ = endTime_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.count_ = count_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AccAggrInfo.AccAggr) {
          return mergeFrom((AccAggrInfo.AccAggr)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AccAggrInfo.AccAggr other) {
        if (other == AccAggrInfo.AccAggr.getDefaultInstance()) return this;
        if (other.hasID()) {
          setID(other.getID());
        }
        if (other.hasAccTypeID()) {
          setAccTypeID(other.getAccTypeID());
        }
        if (other.hasVehicleID()) {
          setVehicleID(other.getVehicleID());
        }
        if (other.hasStartTime()) {
          setStartTime(other.getStartTime());
        }
        if (other.hasEndTime()) {
          setEndTime(other.getEndTime());
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasID()) {
          
          return false;
        }
        if (!hasAccTypeID()) {
          
          return false;
        }
        if (!hasVehicleID()) {
          
          return false;
        }
        if (!hasStartTime()) {
          
          return false;
        }
        if (!hasEndTime()) {
          
          return false;
        }
        if (!hasCount()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        AccAggrInfo.AccAggr parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AccAggrInfo.AccAggr) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long iD_ ;
      /**
       * <code>required int64 ID = 1;</code>
       */
      public boolean hasID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 ID = 1;</code>
       */
      public long getID() {
        return iD_;
      }
      /**
       * <code>required int64 ID = 1;</code>
       */
      public Builder setID(long value) {
        bitField0_ |= 0x00000001;
        iD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 ID = 1;</code>
       */
      public Builder clearID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        iD_ = 0L;
        onChanged();
        return this;
      }

      private long accTypeID_ ;
      /**
       * <code>required int64 AccTypeID = 2;</code>
       */
      public boolean hasAccTypeID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 AccTypeID = 2;</code>
       */
      public long getAccTypeID() {
        return accTypeID_;
      }
      /**
       * <code>required int64 AccTypeID = 2;</code>
       */
      public Builder setAccTypeID(long value) {
        bitField0_ |= 0x00000002;
        accTypeID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 AccTypeID = 2;</code>
       */
      public Builder clearAccTypeID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        accTypeID_ = 0L;
        onChanged();
        return this;
      }

      private long vehicleID_ ;
      /**
       * <code>required int64 VehicleID = 3;</code>
       */
      public boolean hasVehicleID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 VehicleID = 3;</code>
       */
      public long getVehicleID() {
        return vehicleID_;
      }
      /**
       * <code>required int64 VehicleID = 3;</code>
       */
      public Builder setVehicleID(long value) {
        bitField0_ |= 0x00000004;
        vehicleID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 VehicleID = 3;</code>
       */
      public Builder clearVehicleID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        vehicleID_ = 0L;
        onChanged();
        return this;
      }

      private long startTime_ ;
      /**
       * <code>required int64 StartTime = 4;</code>
       */
      public boolean hasStartTime() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int64 StartTime = 4;</code>
       */
      public long getStartTime() {
        return startTime_;
      }
      /**
       * <code>required int64 StartTime = 4;</code>
       */
      public Builder setStartTime(long value) {
        bitField0_ |= 0x00000008;
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 StartTime = 4;</code>
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        startTime_ = 0L;
        onChanged();
        return this;
      }

      private long endTime_ ;
      /**
       * <code>required int64 EndTime = 5;</code>
       */
      public boolean hasEndTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int64 EndTime = 5;</code>
       */
      public long getEndTime() {
        return endTime_;
      }
      /**
       * <code>required int64 EndTime = 5;</code>
       */
      public Builder setEndTime(long value) {
        bitField0_ |= 0x00000010;
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 EndTime = 5;</code>
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        endTime_ = 0L;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>required int32 Count = 6;</code>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 Count = 6;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>required int32 Count = 6;</code>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000020;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 Count = 6;</code>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000020);
        count_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AccAggr)
    }

    static {
      defaultInstance = new AccAggr(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AccAggr)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AccAggr_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AccAggr_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034src/main/proto/AccAggr.proto\"n\n\007AccAgg" +
      "r\022\n\n\002ID\030\001 \002(\003\022\021\n\tAccTypeID\030\002 \002(\003\022\021\n\tVehi" +
      "cleID\030\003 \002(\003\022\021\n\tStartTime\030\004 \002(\003\022\017\n\007EndTim" +
      "e\030\005 \002(\003\022\r\n\005Count\030\006 \002(\005B0\n!com.hsae.task" +
      ".protobuf.generatedB\013AccAggrInfo"
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
    internal_static_AccAggr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AccAggr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AccAggr_descriptor,
        new java.lang.String[] { "ID", "AccTypeID", "VehicleID", "StartTime", "EndTime", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
