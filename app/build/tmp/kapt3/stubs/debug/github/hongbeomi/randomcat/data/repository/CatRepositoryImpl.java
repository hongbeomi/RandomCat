package github.hongbeomi.randomcat.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lgithub/hongbeomi/randomcat/data/repository/CatRepositoryImpl;", "Lgithub/hongbeomi/randomcat/data/repository/CatRepository;", "remoteDataSource", "Lgithub/hongbeomi/randomcat/data/remote/CatRemoteDataSource;", "(Lgithub/hongbeomi/randomcat/data/remote/CatRemoteDataSource;)V", "getImages", "", "Lgithub/hongbeomi/randomcat/model/Cat;", "limit", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CatRepositoryImpl implements github.hongbeomi.randomcat.data.repository.CatRepository {
    private final github.hongbeomi.randomcat.data.remote.CatRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImages(int limit, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<github.hongbeomi.randomcat.model.Cat>> p2) {
        return null;
    }
    
    public CatRepositoryImpl(@org.jetbrains.annotations.NotNull()
    github.hongbeomi.randomcat.data.remote.CatRemoteDataSource remoteDataSource) {
        super();
    }
}