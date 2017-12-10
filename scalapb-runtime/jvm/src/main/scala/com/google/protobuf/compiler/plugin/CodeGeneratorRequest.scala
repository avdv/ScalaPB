// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin
import scala.collection.JavaConverters._

/** An encoded CodeGeneratorRequest is written to the plugin's stdin.
  *
  * @param fileToGenerate
  *   The .proto files that were explicitly listed on the command-line.  The
  *   code generator should generate code only for these files.  Each file's
  *   descriptor will be included in proto_file, below.
  * @param parameter
  *   The generator parameter passed on the command-line.
  * @param protoFile
  *   FileDescriptorProtos for all files in files_to_generate and everything
  *   they import.  The files will appear in topological order, so each file
  *   appears before any file that imports it.
  *  
  *   protoc guarantees that all proto_files will be written after
  *   the fields above, even though this is not technically guaranteed by the
  *   protobuf wire format.  This theoretically could allow a plugin to stream
  *   in the FileDescriptorProtos and handle them one by one rather than read
  *   the entire set into memory at once.  However, as of this writing, this
  *   is not similarly optimized on protoc's end -- it will store all fields in
  *   memory at once before sending them to the plugin.
  *  
  *   Type names of fields and extensions in the FileDescriptorProto are always
  *   fully qualified.
  * @param compilerVersion
  *   The version number of protocol compiler.
  */
@SerialVersionUID(0L)
final case class CodeGeneratorRequest(
    fileToGenerate: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty,
    parameter: scala.Option[String] = None,
    protoFile: _root_.scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto] = _root_.scala.collection.Seq.empty,
    compilerVersion: scala.Option[com.google.protobuf.compiler.plugin.Version] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[CodeGeneratorRequest] with scalapb.lenses.Updatable[CodeGeneratorRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      fileToGenerate.foreach(fileToGenerate => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, fileToGenerate))
      if (parameter.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, parameter.get) }
      protoFile.foreach(protoFile => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(protoFile.serializedSize) + protoFile.serializedSize)
      if (compilerVersion.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(compilerVersion.get.serializedSize) + compilerVersion.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      fileToGenerate.foreach { __v =>
        _output__.writeString(1, __v)
      };
      parameter.foreach { __v =>
        _output__.writeString(2, __v)
      };
      compilerVersion.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      protoFile.foreach { __v =>
        _output__.writeTag(15, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorRequest = {
      val __fileToGenerate = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.fileToGenerate)
      var __parameter = this.parameter
      val __protoFile = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.FileDescriptorProto] ++= this.protoFile)
      var __compilerVersion = this.compilerVersion
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fileToGenerate += _input__.readString()
          case 18 =>
            __parameter = Some(_input__.readString())
          case 122 =>
            __protoFile += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.FileDescriptorProto.defaultInstance)
          case 26 =>
            __compilerVersion = Some(_root_.scalapb.LiteParser.readMessage(_input__, __compilerVersion.getOrElse(com.google.protobuf.compiler.plugin.Version.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
          fileToGenerate = __fileToGenerate.result(),
          parameter = __parameter,
          protoFile = __protoFile.result(),
          compilerVersion = __compilerVersion
      )
    }
    def clearFileToGenerate = copy(fileToGenerate = _root_.scala.collection.Seq.empty)
    def addFileToGenerate(__vs: String*): CodeGeneratorRequest = addAllFileToGenerate(__vs)
    def addAllFileToGenerate(__vs: TraversableOnce[String]): CodeGeneratorRequest = copy(fileToGenerate = fileToGenerate ++ __vs)
    def withFileToGenerate(__v: _root_.scala.collection.Seq[String]): CodeGeneratorRequest = copy(fileToGenerate = __v)
    def getParameter: String = parameter.getOrElse("")
    def clearParameter: CodeGeneratorRequest = copy(parameter = None)
    def withParameter(__v: String): CodeGeneratorRequest = copy(parameter = Some(__v))
    def clearProtoFile = copy(protoFile = _root_.scala.collection.Seq.empty)
    def addProtoFile(__vs: com.google.protobuf.descriptor.FileDescriptorProto*): CodeGeneratorRequest = addAllProtoFile(__vs)
    def addAllProtoFile(__vs: TraversableOnce[com.google.protobuf.descriptor.FileDescriptorProto]): CodeGeneratorRequest = copy(protoFile = protoFile ++ __vs)
    def withProtoFile(__v: _root_.scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]): CodeGeneratorRequest = copy(protoFile = __v)
    def getCompilerVersion: com.google.protobuf.compiler.plugin.Version = compilerVersion.getOrElse(com.google.protobuf.compiler.plugin.Version.defaultInstance)
    def clearCompilerVersion: CodeGeneratorRequest = copy(compilerVersion = None)
    def withCompilerVersion(__v: com.google.protobuf.compiler.plugin.Version): CodeGeneratorRequest = copy(compilerVersion = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => fileToGenerate
        case 2 => parameter.orNull
        case 15 => protoFile
        case 3 => compilerVersion.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(fileToGenerate.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 2 => parameter.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 15 => _root_.scalapb.descriptors.PRepeated(protoFile.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 3 => compilerVersion.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.compiler.plugin.CodeGeneratorRequest
}

object CodeGeneratorRequest extends scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorRequest] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorRequest, com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorRequest] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorRequest, com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.compiler.plugin.CodeGeneratorRequest): com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest = {
    val javaPbOut = com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest.newBuilder
    javaPbOut.addAllFileToGenerate(scalaPbSource.fileToGenerate.asJava)
    scalaPbSource.parameter.foreach(javaPbOut.setParameter)
    javaPbOut.addAllProtoFile(scalaPbSource.protoFile.map(com.google.protobuf.descriptor.FileDescriptorProto.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    scalaPbSource.compilerVersion.map(com.google.protobuf.compiler.plugin.Version.toJavaProto).foreach(javaPbOut.setCompilerVersion)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest): com.google.protobuf.compiler.plugin.CodeGeneratorRequest = com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
    fileToGenerate = javaPbSource.getFileToGenerateList.asScala.map(_root_.scala.Predef.identity)(_root_.scala.collection.breakOut),
    parameter = if (javaPbSource.hasParameter) Some(javaPbSource.getParameter) else None,
    protoFile = javaPbSource.getProtoFileList.asScala.map(com.google.protobuf.descriptor.FileDescriptorProto.fromJavaProto)(_root_.scala.collection.breakOut),
    compilerVersion = if (javaPbSource.hasCompilerVersion) Some(com.google.protobuf.compiler.plugin.Version.fromJavaProto(javaPbSource.getCompilerVersion)) else None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.compiler.plugin.CodeGeneratorRequest = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[com.google.protobuf.compiler.plugin.Version]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.compiler.plugin.CodeGeneratorRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(15).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[com.google.protobuf.compiler.plugin.Version]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PluginProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PluginProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 15 => __out = com.google.protobuf.descriptor.FileDescriptorProto
      case 3 => __out = com.google.protobuf.compiler.plugin.Version
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.compiler.plugin.CodeGeneratorRequest(
  )
  implicit class CodeGeneratorRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorRequest](_l) {
    def fileToGenerate: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.fileToGenerate)((c_, f_) => c_.copy(fileToGenerate = f_))
    def parameter: _root_.scalapb.lenses.Lens[UpperPB, String] = field(_.getParameter)((c_, f_) => c_.copy(parameter = Some(f_)))
    def optionalParameter: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[String]] = field(_.parameter)((c_, f_) => c_.copy(parameter = f_))
    def protoFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.descriptor.FileDescriptorProto]] = field(_.protoFile)((c_, f_) => c_.copy(protoFile = f_))
    def compilerVersion: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.Version] = field(_.getCompilerVersion)((c_, f_) => c_.copy(compilerVersion = Some(f_)))
    def optionalCompilerVersion: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.compiler.plugin.Version]] = field(_.compilerVersion)((c_, f_) => c_.copy(compilerVersion = f_))
  }
  final val FILE_TO_GENERATE_FIELD_NUMBER = 1
  final val PARAMETER_FIELD_NUMBER = 2
  final val PROTO_FILE_FIELD_NUMBER = 15
  final val COMPILER_VERSION_FIELD_NUMBER = 3
}
