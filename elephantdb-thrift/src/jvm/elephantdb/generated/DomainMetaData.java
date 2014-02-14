/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainMetaData implements org.apache.thrift.TBase<DomainMetaData, DomainMetaData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainMetaData");

  private static final org.apache.thrift.protocol.TField REMOTE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("remote_version", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOCAL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("local_version", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SHARD_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("shard_set", org.apache.thrift.protocol.TType.SET, (short)3);
  private static final org.apache.thrift.protocol.TField DOMAIN_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("domain_spec", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DomainMetaDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DomainMetaDataTupleSchemeFactory());
  }

  private long remote_version; // required
  private long local_version; // required
  private Set<Long> shard_set; // required
  private DomainSpec domain_spec; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REMOTE_VERSION((short)1, "remote_version"),
    LOCAL_VERSION((short)2, "local_version"),
    SHARD_SET((short)3, "shard_set"),
    DOMAIN_SPEC((short)4, "domain_spec");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REMOTE_VERSION
          return REMOTE_VERSION;
        case 2: // LOCAL_VERSION
          return LOCAL_VERSION;
        case 3: // SHARD_SET
          return SHARD_SET;
        case 4: // DOMAIN_SPEC
          return DOMAIN_SPEC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REMOTE_VERSION_ISSET_ID = 0;
  private static final int __LOCAL_VERSION_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REMOTE_VERSION, new org.apache.thrift.meta_data.FieldMetaData("remote_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOCAL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("local_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SHARD_SET, new org.apache.thrift.meta_data.FieldMetaData("shard_set", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.DOMAIN_SPEC, new org.apache.thrift.meta_data.FieldMetaData("domain_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DomainSpec.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainMetaData.class, metaDataMap);
  }

  public DomainMetaData() {
  }

  public DomainMetaData(
    long remote_version,
    long local_version,
    Set<Long> shard_set,
    DomainSpec domain_spec)
  {
    this();
    this.remote_version = remote_version;
    set_remote_version_isSet(true);
    this.local_version = local_version;
    set_local_version_isSet(true);
    this.shard_set = shard_set;
    this.domain_spec = domain_spec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainMetaData(DomainMetaData other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.remote_version = other.remote_version;
    this.local_version = other.local_version;
    if (other.is_set_shard_set()) {
      Set<Long> __this__shard_set = new HashSet<Long>();
      for (Long other_element : other.shard_set) {
        __this__shard_set.add(other_element);
      }
      this.shard_set = __this__shard_set;
    }
    if (other.is_set_domain_spec()) {
      this.domain_spec = new DomainSpec(other.domain_spec);
    }
  }

  public DomainMetaData deepCopy() {
    return new DomainMetaData(this);
  }

  @Override
  public void clear() {
    set_remote_version_isSet(false);
    this.remote_version = 0;
    set_local_version_isSet(false);
    this.local_version = 0;
    this.shard_set = null;
    this.domain_spec = null;
  }

  public long get_remote_version() {
    return this.remote_version;
  }

  public void set_remote_version(long remote_version) {
    this.remote_version = remote_version;
    set_remote_version_isSet(true);
  }

  public void unset_remote_version() {
    __isset_bit_vector.clear(__REMOTE_VERSION_ISSET_ID);
  }

  /** Returns true if field remote_version is set (has been assigned a value) and false otherwise */
  public boolean is_set_remote_version() {
    return __isset_bit_vector.get(__REMOTE_VERSION_ISSET_ID);
  }

  public void set_remote_version_isSet(boolean value) {
    __isset_bit_vector.set(__REMOTE_VERSION_ISSET_ID, value);
  }

  public long get_local_version() {
    return this.local_version;
  }

  public void set_local_version(long local_version) {
    this.local_version = local_version;
    set_local_version_isSet(true);
  }

  public void unset_local_version() {
    __isset_bit_vector.clear(__LOCAL_VERSION_ISSET_ID);
  }

  /** Returns true if field local_version is set (has been assigned a value) and false otherwise */
  public boolean is_set_local_version() {
    return __isset_bit_vector.get(__LOCAL_VERSION_ISSET_ID);
  }

  public void set_local_version_isSet(boolean value) {
    __isset_bit_vector.set(__LOCAL_VERSION_ISSET_ID, value);
  }

  public int get_shard_set_size() {
    return (this.shard_set == null) ? 0 : this.shard_set.size();
  }

  public java.util.Iterator<Long> get_shard_set_iterator() {
    return (this.shard_set == null) ? null : this.shard_set.iterator();
  }

  public void add_to_shard_set(long elem) {
    if (this.shard_set == null) {
      this.shard_set = new HashSet<Long>();
    }
    this.shard_set.add(elem);
  }

  public Set<Long> get_shard_set() {
    return this.shard_set;
  }

  public void set_shard_set(Set<Long> shard_set) {
    this.shard_set = shard_set;
  }

  public void unset_shard_set() {
    this.shard_set = null;
  }

  /** Returns true if field shard_set is set (has been assigned a value) and false otherwise */
  public boolean is_set_shard_set() {
    return this.shard_set != null;
  }

  public void set_shard_set_isSet(boolean value) {
    if (!value) {
      this.shard_set = null;
    }
  }

  public DomainSpec get_domain_spec() {
    return this.domain_spec;
  }

  public void set_domain_spec(DomainSpec domain_spec) {
    this.domain_spec = domain_spec;
  }

  public void unset_domain_spec() {
    this.domain_spec = null;
  }

  /** Returns true if field domain_spec is set (has been assigned a value) and false otherwise */
  public boolean is_set_domain_spec() {
    return this.domain_spec != null;
  }

  public void set_domain_spec_isSet(boolean value) {
    if (!value) {
      this.domain_spec = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REMOTE_VERSION:
      if (value == null) {
        unset_remote_version();
      } else {
        set_remote_version((Long)value);
      }
      break;

    case LOCAL_VERSION:
      if (value == null) {
        unset_local_version();
      } else {
        set_local_version((Long)value);
      }
      break;

    case SHARD_SET:
      if (value == null) {
        unset_shard_set();
      } else {
        set_shard_set((Set<Long>)value);
      }
      break;

    case DOMAIN_SPEC:
      if (value == null) {
        unset_domain_spec();
      } else {
        set_domain_spec((DomainSpec)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REMOTE_VERSION:
      return Long.valueOf(get_remote_version());

    case LOCAL_VERSION:
      return Long.valueOf(get_local_version());

    case SHARD_SET:
      return get_shard_set();

    case DOMAIN_SPEC:
      return get_domain_spec();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REMOTE_VERSION:
      return is_set_remote_version();
    case LOCAL_VERSION:
      return is_set_local_version();
    case SHARD_SET:
      return is_set_shard_set();
    case DOMAIN_SPEC:
      return is_set_domain_spec();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainMetaData)
      return this.equals((DomainMetaData)that);
    return false;
  }

  public boolean equals(DomainMetaData that) {
    if (that == null)
      return false;

    boolean this_present_remote_version = true;
    boolean that_present_remote_version = true;
    if (this_present_remote_version || that_present_remote_version) {
      if (!(this_present_remote_version && that_present_remote_version))
        return false;
      if (this.remote_version != that.remote_version)
        return false;
    }

    boolean this_present_local_version = true;
    boolean that_present_local_version = true;
    if (this_present_local_version || that_present_local_version) {
      if (!(this_present_local_version && that_present_local_version))
        return false;
      if (this.local_version != that.local_version)
        return false;
    }

    boolean this_present_shard_set = true && this.is_set_shard_set();
    boolean that_present_shard_set = true && that.is_set_shard_set();
    if (this_present_shard_set || that_present_shard_set) {
      if (!(this_present_shard_set && that_present_shard_set))
        return false;
      if (!this.shard_set.equals(that.shard_set))
        return false;
    }

    boolean this_present_domain_spec = true && this.is_set_domain_spec();
    boolean that_present_domain_spec = true && that.is_set_domain_spec();
    if (this_present_domain_spec || that_present_domain_spec) {
      if (!(this_present_domain_spec && that_present_domain_spec))
        return false;
      if (!this.domain_spec.equals(that.domain_spec))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_remote_version = true;
    builder.append(present_remote_version);
    if (present_remote_version)
      builder.append(remote_version);

    boolean present_local_version = true;
    builder.append(present_local_version);
    if (present_local_version)
      builder.append(local_version);

    boolean present_shard_set = true && (is_set_shard_set());
    builder.append(present_shard_set);
    if (present_shard_set)
      builder.append(shard_set);

    boolean present_domain_spec = true && (is_set_domain_spec());
    builder.append(present_domain_spec);
    if (present_domain_spec)
      builder.append(domain_spec);

    return builder.toHashCode();
  }

  public int compareTo(DomainMetaData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DomainMetaData typedOther = (DomainMetaData)other;

    lastComparison = Boolean.valueOf(is_set_remote_version()).compareTo(typedOther.is_set_remote_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_remote_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remote_version, typedOther.remote_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_local_version()).compareTo(typedOther.is_set_local_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_local_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.local_version, typedOther.local_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_shard_set()).compareTo(typedOther.is_set_shard_set());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_shard_set()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shard_set, typedOther.shard_set);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_domain_spec()).compareTo(typedOther.is_set_domain_spec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_domain_spec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain_spec, typedOther.domain_spec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DomainMetaData(");
    boolean first = true;

    sb.append("remote_version:");
    sb.append(this.remote_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("local_version:");
    sb.append(this.local_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("shard_set:");
    if (this.shard_set == null) {
      sb.append("null");
    } else {
      sb.append(this.shard_set);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("domain_spec:");
    if (this.domain_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.domain_spec);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_remote_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'remote_version' is unset! Struct:" + toString());
    }

    if (!is_set_local_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'local_version' is unset! Struct:" + toString());
    }

    if (!is_set_shard_set()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'shard_set' is unset! Struct:" + toString());
    }

    if (!is_set_domain_spec()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'domain_spec' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DomainMetaDataStandardSchemeFactory implements SchemeFactory {
    public DomainMetaDataStandardScheme getScheme() {
      return new DomainMetaDataStandardScheme();
    }
  }

  private static class DomainMetaDataStandardScheme extends StandardScheme<DomainMetaData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainMetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REMOTE_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.remote_version = iprot.readI64();
              struct.set_remote_version_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCAL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.local_version = iprot.readI64();
              struct.set_local_version_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHARD_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set10 = iprot.readSetBegin();
                struct.shard_set = new HashSet<Long>(2*_set10.size);
                for (int _i11 = 0; _i11 < _set10.size; ++_i11)
                {
                  long _elem12; // required
                  _elem12 = iprot.readI64();
                  struct.shard_set.add(_elem12);
                }
                iprot.readSetEnd();
              }
              struct.set_shard_set_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DOMAIN_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.domain_spec = new DomainSpec();
              struct.domain_spec.read(iprot);
              struct.set_domain_spec_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainMetaData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REMOTE_VERSION_FIELD_DESC);
      oprot.writeI64(struct.remote_version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOCAL_VERSION_FIELD_DESC);
      oprot.writeI64(struct.local_version);
      oprot.writeFieldEnd();
      if (struct.shard_set != null) {
        oprot.writeFieldBegin(SHARD_SET_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.shard_set.size()));
          for (long _iter13 : struct.shard_set)
          {
            oprot.writeI64(_iter13);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.domain_spec != null) {
        oprot.writeFieldBegin(DOMAIN_SPEC_FIELD_DESC);
        struct.domain_spec.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainMetaDataTupleSchemeFactory implements SchemeFactory {
    public DomainMetaDataTupleScheme getScheme() {
      return new DomainMetaDataTupleScheme();
    }
  }

  private static class DomainMetaDataTupleScheme extends TupleScheme<DomainMetaData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainMetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.remote_version);
      oprot.writeI64(struct.local_version);
      {
        oprot.writeI32(struct.shard_set.size());
        for (long _iter14 : struct.shard_set)
        {
          oprot.writeI64(_iter14);
        }
      }
      struct.domain_spec.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainMetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.remote_version = iprot.readI64();
      struct.set_remote_version_isSet(true);
      struct.local_version = iprot.readI64();
      struct.set_local_version_isSet(true);
      {
        org.apache.thrift.protocol.TSet _set15 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.shard_set = new HashSet<Long>(2*_set15.size);
        for (int _i16 = 0; _i16 < _set15.size; ++_i16)
        {
          long _elem17; // required
          _elem17 = iprot.readI64();
          struct.shard_set.add(_elem17);
        }
      }
      struct.set_shard_set_isSet(true);
      struct.domain_spec = new DomainSpec();
      struct.domain_spec.read(iprot);
      struct.set_domain_spec_isSet(true);
    }
  }

}
