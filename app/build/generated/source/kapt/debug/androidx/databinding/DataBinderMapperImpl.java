package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new github.hongbeomi.randomcat.DataBinderMapperImpl());
  }
}
