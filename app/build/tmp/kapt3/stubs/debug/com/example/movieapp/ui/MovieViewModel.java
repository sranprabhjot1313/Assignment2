package com.example.movieapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/movieapp/ui/MovieViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_movies", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/movieapp/data/Movie;", "movies", "Landroidx/lifecycle/LiveData;", "getMovies", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/movieapp/data/MovieRepository;", "deleteMovie", "", "movie", "getMovieById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "loadMovies", "searchMovies", "query", "", "update", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.movieapp.data.MovieRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.movieapp.data.Movie>> _movies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.movieapp.data.Movie>> movies = null;
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.movieapp.data.Movie>> getMovies() {
        return null;
    }
    
    private final void loadMovies() {
    }
    
    public final void searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void deleteMovie(@org.jetbrains.annotations.NotNull()
    com.example.movieapp.data.Movie movie) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movieapp.data.Movie> $completion) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.movieapp.data.Movie movie) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.example.movieapp.data.Movie movie) {
    }
}