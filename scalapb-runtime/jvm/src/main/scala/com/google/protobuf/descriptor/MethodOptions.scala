// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor
import scala.collection.JavaConverters._

/** @param deprecated
  *   Is this method deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the method, or it will be completely ignored; in the very least,
  *   this is a formalization for deprecating methods.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class MethodOptions(
    deprecated: scala.Option[Boolean] = None,
    idempotencyLevel: scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel] = None,
    uninterpretedOption: _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.collection.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet()
    ) extends scalapb.GeneratedMessage with scalapb.Message[MethodOptions] with scalapb.lenses.Updatable[MethodOptions] with _root_.scalapb.ExtendableMessage[MethodOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (deprecated.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(33, deprecated.get) }
      if (idempotencyLevel.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(34, idempotencyLevel.get.value) }
      uninterpretedOption.foreach(uninterpretedOption => __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(uninterpretedOption.serializedSize) + uninterpretedOption.serializedSize)
      __size += unknownFields.serializedSize
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
      deprecated.foreach { __v =>
        _output__.writeBool(33, __v)
      };
      idempotencyLevel.foreach { __v =>
        _output__.writeEnum(34, __v.value)
      };
      uninterpretedOption.foreach { __v =>
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.MethodOptions = {
      var __deprecated = this.deprecated
      var __idempotencyLevel = this.idempotencyLevel
      val __uninterpretedOption = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      val _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 264 =>
            __deprecated = Some(_input__.readBool())
          case 272 =>
            __idempotencyLevel = Some(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(_input__.readEnum()))
          case 7994 =>
            __uninterpretedOption += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.MethodOptions(
          deprecated = __deprecated,
          idempotencyLevel = __idempotencyLevel,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = _unknownFields__.result()
      )
    }
    def getDeprecated: Boolean = deprecated.getOrElse(false)
    def clearDeprecated: MethodOptions = copy(deprecated = None)
    def withDeprecated(__v: Boolean): MethodOptions = copy(deprecated = Some(__v))
    def getIdempotencyLevel: com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel = idempotencyLevel.getOrElse(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN)
    def clearIdempotencyLevel: MethodOptions = copy(idempotencyLevel = None)
    def withIdempotencyLevel(__v: com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel): MethodOptions = copy(idempotencyLevel = Some(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.collection.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): MethodOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: TraversableOnce[com.google.protobuf.descriptor.UninterpretedOption]): MethodOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]): MethodOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 33 => deprecated.orNull
        case 34 => idempotencyLevel.map(_.javaValueDescriptor).orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 33 => deprecated.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 34 => idempotencyLevel.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.MethodOptions
}

object MethodOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodOptions] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodOptions, com.google.protobuf.DescriptorProtos.MethodOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.MethodOptions] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.MethodOptions, com.google.protobuf.DescriptorProtos.MethodOptions] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.MethodOptions): com.google.protobuf.DescriptorProtos.MethodOptions = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.MethodOptions.newBuilder
    scalaPbSource.deprecated.foreach(javaPbOut.setDeprecated)
    scalaPbSource.idempotencyLevel.map(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.toJavaValue).foreach(javaPbOut.setIdempotencyLevel)
    javaPbOut.addAllUninterpretedOption(scalaPbSource.uninterpretedOption.map(com.google.protobuf.descriptor.UninterpretedOption.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.MethodOptions): com.google.protobuf.descriptor.MethodOptions = com.google.protobuf.descriptor.MethodOptions(
    deprecated = if (javaPbSource.hasDeprecated) Some(javaPbSource.getDeprecated.booleanValue) else None,
    idempotencyLevel = if (javaPbSource.hasIdempotencyLevel) Some(com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromJavaValue(javaPbSource.getIdempotencyLevel)) else None,
    uninterpretedOption = javaPbSource.getUninterpretedOptionList.asScala.map(com.google.protobuf.descriptor.UninterpretedOption.fromJavaProto)(_root_.scala.collection.breakOut)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.MethodOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.MethodOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[Boolean]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(__e.getNumber)),
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.MethodOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.MethodOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(33).get).flatMap(_.as[scala.Option[Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(34).get).flatMap(_.as[scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(16)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(16)
  def messageCompanionForFieldNumber(__number: Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 34 => com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel
    }
  }
  lazy val defaultInstance = com.google.protobuf.descriptor.MethodOptions(
  )
  sealed trait IdempotencyLevel extends _root_.scalapb.GeneratedEnum {
    type EnumType = IdempotencyLevel
    def isIdempotencyUnknown: Boolean = false
    def isNoSideEffects: Boolean = false
    def isIdempotent: Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[IdempotencyLevel] = com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel
  }
  
  object IdempotencyLevel extends _root_.scalapb.GeneratedEnumCompanion[IdempotencyLevel] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[IdempotencyLevel] = this
    @SerialVersionUID(0L)
    case object IDEMPOTENCY_UNKNOWN extends IdempotencyLevel {
      val value = 0
      val index = 0
      val name = "IDEMPOTENCY_UNKNOWN"
      override def isIdempotencyUnknown: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object NO_SIDE_EFFECTS extends IdempotencyLevel {
      val value = 1
      val index = 1
      val name = "NO_SIDE_EFFECTS"
      override def isNoSideEffects: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object IDEMPOTENT extends IdempotencyLevel {
      val value = 2
      val index = 2
      val name = "IDEMPOTENT"
      override def isIdempotent: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends IdempotencyLevel with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT)
    def fromValue(value: Int): IdempotencyLevel = value match {
      case 0 => IDEMPOTENCY_UNKNOWN
      case 1 => NO_SIDE_EFFECTS
      case 2 => IDEMPOTENT
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.MethodOptions.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.MethodOptions.scalaDescriptor.enums(0)
    def fromJavaValue(pbJavaSource: com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel): IdempotencyLevel = fromValue(pbJavaSource.getNumber)
    def toJavaValue(pbScalaSource: IdempotencyLevel): com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel = com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(pbScalaSource.value)
  }
  implicit class MethodOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.MethodOptions](_l) {
    def deprecated: _root_.scalapb.lenses.Lens[UpperPB, Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Some(f_)))
    def optionalDeprecated: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def idempotencyLevel: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel] = field(_.getIdempotencyLevel)((c_, f_) => c_.copy(idempotencyLevel = Some(f_)))
    def optionalIdempotencyLevel: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel]] = field(_.idempotencyLevel)((c_, f_) => c_.copy(idempotencyLevel = f_))
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val DEPRECATED_FIELD_NUMBER = 33
  final val IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
}
