package com.example.movieapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/movieapp/ui/EditMovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "actorsEditText", "Lcom/google/android/material/textfield/TextInputEditText;", "cancelButton", "Lcom/google/android/material/button/MaterialButton;", "descriptionEditText", "directorsEditText", "genresEditText", "lengthEditText", "movieId", "", "mpaRatingEditText", "ratingBar", "Landroid/widget/RatingBar;", "saveButton", "screenTitle", "Landroid/widget/TextView;", "studioEditText", "titleEditText", "viewModel", "Lcom/example/movieapp/ui/MovieViewModel;", "writersEditText", "yearEditText", "loadMovie", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveMovie", "validateInput", "", "Companion", "app_debug"})
public final class EditMovieActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.movieapp.ui.MovieViewModel viewModel;
    private int movieId = -1;
    private android.widget.TextView screenTitle;
    private com.google.android.material.textfield.TextInputEditText titleEditText;
    private com.google.android.material.textfield.TextInputEditText studioEditText;
    private com.google.android.material.textfield.TextInputEditText genresEditText;
    private com.google.android.material.textfield.TextInputEditText directorsEditText;
    private com.google.android.material.textfield.TextInputEditText writersEditText;
    private com.google.android.material.textfield.TextInputEditText actorsEditText;
    private com.google.android.material.textfield.TextInputEditText yearEditText;
    private com.google.android.material.textfield.TextInputEditText lengthEditText;
    private com.google.android.material.textfield.TextInputEditText descriptionEditText;
    private com.google.android.material.textfield.TextInputEditText mpaRatingEditText;
    private android.widget.RatingBar ratingBar;
    private com.google.android.material.button.MaterialButton saveButton;
    private com.google.android.material.button.MaterialButton cancelButton;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MOVIE_ID = "extra_movie_id";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.movieapp.ui.EditMovieActivity.Companion Companion = null;
    
    public EditMovieActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean validateInput() {
        return false;
    }
    
    private final void loadMovie() {
    }
    
    private final void saveMovie() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/movieapp/ui/EditMovieActivity$Companion;", "", "()V", "EXTRA_MOVIE_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}