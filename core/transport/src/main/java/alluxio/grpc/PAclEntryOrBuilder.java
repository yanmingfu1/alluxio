// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface PAclEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.PAclEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.file.PAclEntryType type = 1;</code>
   */
  boolean hasType();
  /**
   * <code>optional .alluxio.grpc.file.PAclEntryType type = 1;</code>
   */
  alluxio.grpc.PAclEntryType getType();

  /**
   * <code>optional string subject = 2;</code>
   */
  boolean hasSubject();
  /**
   * <code>optional string subject = 2;</code>
   */
  java.lang.String getSubject();
  /**
   * <code>optional string subject = 2;</code>
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>repeated .alluxio.grpc.file.PAclAction actions = 3;</code>
   */
  java.util.List<alluxio.grpc.PAclAction> getActionsList();
  /**
   * <code>repeated .alluxio.grpc.file.PAclAction actions = 3;</code>
   */
  int getActionsCount();
  /**
   * <code>repeated .alluxio.grpc.file.PAclAction actions = 3;</code>
   */
  alluxio.grpc.PAclAction getActions(int index);

  /**
   * <code>optional bool isDefault = 4;</code>
   */
  boolean hasIsDefault();
  /**
   * <code>optional bool isDefault = 4;</code>
   */
  boolean getIsDefault();
}