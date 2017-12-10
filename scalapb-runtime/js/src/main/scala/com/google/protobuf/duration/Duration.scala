// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.duration

/** A Duration represents a signed, fixed-length span of time represented
  * as a count of seconds and fractions of seconds at nanosecond
  * resolution. It is independent of any calendar and concepts like "day"
  * or "month". It is related to Timestamp in that the difference between
  * two Timestamp values is a Duration and it can be added or subtracted
  * from a Timestamp. Range is approximately +-10,000 years.
  *
  * # Examples
  *
  * Example 1: Compute Duration from two Timestamps in pseudo code.
  *
  *     Timestamp start = ...;
  *     Timestamp end = ...;
  *     Duration duration = ...;
  *
  *     duration.seconds = end.seconds - start.seconds;
  *     duration.nanos = end.nanos - start.nanos;
  *
  *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
  *       duration.seconds += 1;
  *       duration.nanos -= 1000000000;
  *     } else if (durations.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
  *       duration.seconds -= 1;
  *       duration.nanos += 1000000000;
  *     }
  *
  * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
  *
  *     Timestamp start = ...;
  *     Duration duration = ...;
  *     Timestamp end = ...;
  *
  *     end.seconds = start.seconds + duration.seconds;
  *     end.nanos = start.nanos + duration.nanos;
  *
  *     if (end.nanos &lt; 0) {
  *       end.seconds -= 1;
  *       end.nanos += 1000000000;
  *     } else if (end.nanos &gt;= 1000000000) {
  *       end.seconds += 1;
  *       end.nanos -= 1000000000;
  *     }
  *
  * Example 3: Compute Duration from datetime.timedelta in Python.
  *
  *     td = datetime.timedelta(days=3, minutes=10)
  *     duration = Duration()
  *     duration.FromTimedelta(td)
  *
  * # JSON Mapping
  *
  * In JSON format, the Duration type is encoded as a string rather than an
  * object, where the string ends in the suffix "s" (indicating seconds) and
  * is preceded by the number of seconds, with nanoseconds expressed as
  * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
  * encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should
  * be expressed in JSON format as "3.000000001s", and 3 seconds and 1
  * microsecond should be expressed in JSON format as "3.000001s".
  *
  * @param seconds
  *   Signed seconds of the span of time. Must be from -315,576,000,000
  *   to +315,576,000,000 inclusive. Note: these bounds are computed from:
  *   60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
  * @param nanos
  *   Signed fractions of a second at nanosecond resolution of the span
  *   of time. Durations less than one second are represented with a 0
  *   `seconds` field and a positive or negative `nanos` field. For durations
  *   of one second or more, a non-zero value for the `nanos` field must be
  *   of the same sign as the `seconds` field. Must be from -999,999,999
  *   to +999,999,999 inclusive.
  */
@SerialVersionUID(0L)
final case class Duration(
    seconds: Long = 0L,
    nanos: Int = 0
    ) extends scalapb.GeneratedMessage with scalapb.Message[Duration] with scalapb.lenses.Updatable[Duration] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (seconds != 0L) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(1, seconds) }
      if (nanos != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, nanos) }
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
      {
        val __v = seconds
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
      {
        val __v = nanos
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.duration.Duration = {
      var __seconds = this.seconds
      var __nanos = this.nanos
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __seconds = _input__.readInt64()
          case 16 =>
            __nanos = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.duration.Duration(
          seconds = __seconds,
          nanos = __nanos
      )
    }
    def withSeconds(__v: Long): Duration = copy(seconds = __v)
    def withNanos(__v: Int): Duration = copy(nanos = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = seconds
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = nanos
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(seconds)
        case 2 => _root_.scalapb.descriptors.PInt(nanos)
      }
    }
    def toProtoString: String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.duration.Duration
}

object Duration extends scalapb.GeneratedMessageCompanion[com.google.protobuf.duration.Duration] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.duration.Duration] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.duration.Duration = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.duration.Duration(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.duration.Duration] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.duration.Duration(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DurationProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DurationProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.duration.Duration(
  )
  implicit class DurationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.duration.Duration](_l) {
    def seconds: _root_.scalapb.lenses.Lens[UpperPB, Long] = field(_.seconds)((c_, f_) => c_.copy(seconds = f_))
    def nanos: _root_.scalapb.lenses.Lens[UpperPB, Int] = field(_.nanos)((c_, f_) => c_.copy(nanos = f_))
  }
  final val SECONDS_FIELD_NUMBER = 1
  final val NANOS_FIELD_NUMBER = 2
}
