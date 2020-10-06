package github.hongbeomi.randomcat.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lgithub/hongbeomi/randomcat/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "imagesPagingDataSource", "Lgithub/hongbeomi/randomcat/domain/ImagesPagingDataSource;", "(Lgithub/hongbeomi/randomcat/domain/ImagesPagingDataSource;)V", "imageList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lgithub/hongbeomi/randomcat/model/Cat;", "getImageList", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<github.hongbeomi.randomcat.model.Cat>> imageList = null;
    private final github.hongbeomi.randomcat.domain.ImagesPagingDataSource imagesPagingDataSource = null;
    public static final int PAGING_PAGE_SIZE = 10;
    public static final github.hongbeomi.randomcat.ui.main.MainViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<github.hongbeomi.randomcat.model.Cat>> getImageList() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    github.hongbeomi.randomcat.domain.ImagesPagingDataSource imagesPagingDataSource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lgithub/hongbeomi/randomcat/ui/main/MainViewModel$Companion;", "", "()V", "PAGING_PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}