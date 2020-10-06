package github.hongbeomi.randomcat.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lgithub/hongbeomi/randomcat/ui/main/MainAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lgithub/hongbeomi/randomcat/model/Cat;", "Lgithub/hongbeomi/randomcat/ui/main/MainAdapter$MainViewHolder;", "onClick", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "MainViewHolder", "app_debug"})
public final class MainAdapter extends androidx.paging.PagingDataAdapter<github.hongbeomi.randomcat.model.Cat, github.hongbeomi.randomcat.ui.main.MainAdapter.MainViewHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onClick = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    github.hongbeomi.randomcat.ui.main.MainAdapter.MainViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public github.hongbeomi.randomcat.ui.main.MainAdapter.MainViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lgithub/hongbeomi/randomcat/ui/main/MainAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lgithub/hongbeomi/randomcat/databinding/ItemMainBinding;", "(Lgithub/hongbeomi/randomcat/ui/main/MainAdapter;Lgithub/hongbeomi/randomcat/databinding/ItemMainBinding;)V", "bind", "", "cat", "Lgithub/hongbeomi/randomcat/model/Cat;", "app_debug"})
    public final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final github.hongbeomi.randomcat.databinding.ItemMainBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        github.hongbeomi.randomcat.model.Cat cat) {
        }
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull()
        github.hongbeomi.randomcat.databinding.ItemMainBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lgithub/hongbeomi/randomcat/ui/main/MainAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lgithub/hongbeomi/randomcat/model/Cat;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<github.hongbeomi.randomcat.model.Cat> {
        public static final github.hongbeomi.randomcat.ui.main.MainAdapter.DiffCallback INSTANCE = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        github.hongbeomi.randomcat.model.Cat oldItem, @org.jetbrains.annotations.NotNull()
        github.hongbeomi.randomcat.model.Cat newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        github.hongbeomi.randomcat.model.Cat oldItem, @org.jetbrains.annotations.NotNull()
        github.hongbeomi.randomcat.model.Cat newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}