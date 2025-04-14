package com.example.movieapp.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Movie> __insertionAdapterOfMovie;

  private final EntityDeletionOrUpdateAdapter<Movie> __deletionAdapterOfMovie;

  private final EntityDeletionOrUpdateAdapter<Movie> __updateAdapterOfMovie;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MovieDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `movies` (`id`,`title`,`studio`,`genres`,`directors`,`writers`,`actors`,`year`,`length`,`shortDescription`,`mpaRating`,`criticsRating`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Movie entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getStudio() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getStudio());
        }
        if (entity.getGenres() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getGenres());
        }
        if (entity.getDirectors() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDirectors());
        }
        if (entity.getWriters() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getWriters());
        }
        if (entity.getActors() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getActors());
        }
        statement.bindLong(8, entity.getYear());
        statement.bindLong(9, entity.getLength());
        if (entity.getShortDescription() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getShortDescription());
        }
        if (entity.getMpaRating() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMpaRating());
        }
        statement.bindDouble(12, entity.getCriticsRating());
      }
    };
    this.__deletionAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `movies` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Movie entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `movies` SET `id` = ?,`title` = ?,`studio` = ?,`genres` = ?,`directors` = ?,`writers` = ?,`actors` = ?,`year` = ?,`length` = ?,`shortDescription` = ?,`mpaRating` = ?,`criticsRating` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Movie entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getStudio() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getStudio());
        }
        if (entity.getGenres() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getGenres());
        }
        if (entity.getDirectors() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDirectors());
        }
        if (entity.getWriters() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getWriters());
        }
        if (entity.getActors() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getActors());
        }
        statement.bindLong(8, entity.getYear());
        statement.bindLong(9, entity.getLength());
        if (entity.getShortDescription() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getShortDescription());
        }
        if (entity.getMpaRating() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMpaRating());
        }
        statement.bindDouble(12, entity.getCriticsRating());
        statement.bindLong(13, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM movies";
        return _query;
      }
    };
  }

  @Override
  public Object insertMovie(final Movie movie, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovie.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<Movie> movies, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovie.insert(movies);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteMovie(final Movie movie, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMovie.handle(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateMovie(final Movie movie, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMovie.handle(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllMovies(final Continuation<? super List<Movie>> $completion) {
    final String _sql = "SELECT * FROM movies ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Movie>>() {
      @Override
      @NonNull
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfStudio = CursorUtil.getColumnIndexOrThrow(_cursor, "studio");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfDirectors = CursorUtil.getColumnIndexOrThrow(_cursor, "directors");
          final int _cursorIndexOfWriters = CursorUtil.getColumnIndexOrThrow(_cursor, "writers");
          final int _cursorIndexOfActors = CursorUtil.getColumnIndexOrThrow(_cursor, "actors");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfLength = CursorUtil.getColumnIndexOrThrow(_cursor, "length");
          final int _cursorIndexOfShortDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "shortDescription");
          final int _cursorIndexOfMpaRating = CursorUtil.getColumnIndexOrThrow(_cursor, "mpaRating");
          final int _cursorIndexOfCriticsRating = CursorUtil.getColumnIndexOrThrow(_cursor, "criticsRating");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpStudio;
            if (_cursor.isNull(_cursorIndexOfStudio)) {
              _tmpStudio = null;
            } else {
              _tmpStudio = _cursor.getString(_cursorIndexOfStudio);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final String _tmpDirectors;
            if (_cursor.isNull(_cursorIndexOfDirectors)) {
              _tmpDirectors = null;
            } else {
              _tmpDirectors = _cursor.getString(_cursorIndexOfDirectors);
            }
            final String _tmpWriters;
            if (_cursor.isNull(_cursorIndexOfWriters)) {
              _tmpWriters = null;
            } else {
              _tmpWriters = _cursor.getString(_cursorIndexOfWriters);
            }
            final String _tmpActors;
            if (_cursor.isNull(_cursorIndexOfActors)) {
              _tmpActors = null;
            } else {
              _tmpActors = _cursor.getString(_cursorIndexOfActors);
            }
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final int _tmpLength;
            _tmpLength = _cursor.getInt(_cursorIndexOfLength);
            final String _tmpShortDescription;
            if (_cursor.isNull(_cursorIndexOfShortDescription)) {
              _tmpShortDescription = null;
            } else {
              _tmpShortDescription = _cursor.getString(_cursorIndexOfShortDescription);
            }
            final String _tmpMpaRating;
            if (_cursor.isNull(_cursorIndexOfMpaRating)) {
              _tmpMpaRating = null;
            } else {
              _tmpMpaRating = _cursor.getString(_cursorIndexOfMpaRating);
            }
            final double _tmpCriticsRating;
            _tmpCriticsRating = _cursor.getDouble(_cursorIndexOfCriticsRating);
            _item = new Movie(_tmpId,_tmpTitle,_tmpStudio,_tmpGenres,_tmpDirectors,_tmpWriters,_tmpActors,_tmpYear,_tmpLength,_tmpShortDescription,_tmpMpaRating,_tmpCriticsRating);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getMovieById(final int id, final Continuation<? super Movie> $completion) {
    final String _sql = "SELECT * FROM movies WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Movie>() {
      @Override
      @Nullable
      public Movie call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfStudio = CursorUtil.getColumnIndexOrThrow(_cursor, "studio");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfDirectors = CursorUtil.getColumnIndexOrThrow(_cursor, "directors");
          final int _cursorIndexOfWriters = CursorUtil.getColumnIndexOrThrow(_cursor, "writers");
          final int _cursorIndexOfActors = CursorUtil.getColumnIndexOrThrow(_cursor, "actors");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfLength = CursorUtil.getColumnIndexOrThrow(_cursor, "length");
          final int _cursorIndexOfShortDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "shortDescription");
          final int _cursorIndexOfMpaRating = CursorUtil.getColumnIndexOrThrow(_cursor, "mpaRating");
          final int _cursorIndexOfCriticsRating = CursorUtil.getColumnIndexOrThrow(_cursor, "criticsRating");
          final Movie _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpStudio;
            if (_cursor.isNull(_cursorIndexOfStudio)) {
              _tmpStudio = null;
            } else {
              _tmpStudio = _cursor.getString(_cursorIndexOfStudio);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final String _tmpDirectors;
            if (_cursor.isNull(_cursorIndexOfDirectors)) {
              _tmpDirectors = null;
            } else {
              _tmpDirectors = _cursor.getString(_cursorIndexOfDirectors);
            }
            final String _tmpWriters;
            if (_cursor.isNull(_cursorIndexOfWriters)) {
              _tmpWriters = null;
            } else {
              _tmpWriters = _cursor.getString(_cursorIndexOfWriters);
            }
            final String _tmpActors;
            if (_cursor.isNull(_cursorIndexOfActors)) {
              _tmpActors = null;
            } else {
              _tmpActors = _cursor.getString(_cursorIndexOfActors);
            }
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final int _tmpLength;
            _tmpLength = _cursor.getInt(_cursorIndexOfLength);
            final String _tmpShortDescription;
            if (_cursor.isNull(_cursorIndexOfShortDescription)) {
              _tmpShortDescription = null;
            } else {
              _tmpShortDescription = _cursor.getString(_cursorIndexOfShortDescription);
            }
            final String _tmpMpaRating;
            if (_cursor.isNull(_cursorIndexOfMpaRating)) {
              _tmpMpaRating = null;
            } else {
              _tmpMpaRating = _cursor.getString(_cursorIndexOfMpaRating);
            }
            final double _tmpCriticsRating;
            _tmpCriticsRating = _cursor.getDouble(_cursorIndexOfCriticsRating);
            _result = new Movie(_tmpId,_tmpTitle,_tmpStudio,_tmpGenres,_tmpDirectors,_tmpWriters,_tmpActors,_tmpYear,_tmpLength,_tmpShortDescription,_tmpMpaRating,_tmpCriticsRating);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object searchMovies(final String query,
      final Continuation<? super List<Movie>> $completion) {
    final String _sql = "SELECT * FROM movies WHERE title LIKE ? OR studio LIKE ? OR genres LIKE ? OR directors LIKE ? OR actors LIKE ? ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 4;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 5;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Movie>>() {
      @Override
      @NonNull
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfStudio = CursorUtil.getColumnIndexOrThrow(_cursor, "studio");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfDirectors = CursorUtil.getColumnIndexOrThrow(_cursor, "directors");
          final int _cursorIndexOfWriters = CursorUtil.getColumnIndexOrThrow(_cursor, "writers");
          final int _cursorIndexOfActors = CursorUtil.getColumnIndexOrThrow(_cursor, "actors");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfLength = CursorUtil.getColumnIndexOrThrow(_cursor, "length");
          final int _cursorIndexOfShortDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "shortDescription");
          final int _cursorIndexOfMpaRating = CursorUtil.getColumnIndexOrThrow(_cursor, "mpaRating");
          final int _cursorIndexOfCriticsRating = CursorUtil.getColumnIndexOrThrow(_cursor, "criticsRating");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpStudio;
            if (_cursor.isNull(_cursorIndexOfStudio)) {
              _tmpStudio = null;
            } else {
              _tmpStudio = _cursor.getString(_cursorIndexOfStudio);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final String _tmpDirectors;
            if (_cursor.isNull(_cursorIndexOfDirectors)) {
              _tmpDirectors = null;
            } else {
              _tmpDirectors = _cursor.getString(_cursorIndexOfDirectors);
            }
            final String _tmpWriters;
            if (_cursor.isNull(_cursorIndexOfWriters)) {
              _tmpWriters = null;
            } else {
              _tmpWriters = _cursor.getString(_cursorIndexOfWriters);
            }
            final String _tmpActors;
            if (_cursor.isNull(_cursorIndexOfActors)) {
              _tmpActors = null;
            } else {
              _tmpActors = _cursor.getString(_cursorIndexOfActors);
            }
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final int _tmpLength;
            _tmpLength = _cursor.getInt(_cursorIndexOfLength);
            final String _tmpShortDescription;
            if (_cursor.isNull(_cursorIndexOfShortDescription)) {
              _tmpShortDescription = null;
            } else {
              _tmpShortDescription = _cursor.getString(_cursorIndexOfShortDescription);
            }
            final String _tmpMpaRating;
            if (_cursor.isNull(_cursorIndexOfMpaRating)) {
              _tmpMpaRating = null;
            } else {
              _tmpMpaRating = _cursor.getString(_cursorIndexOfMpaRating);
            }
            final double _tmpCriticsRating;
            _tmpCriticsRating = _cursor.getDouble(_cursorIndexOfCriticsRating);
            _item = new Movie(_tmpId,_tmpTitle,_tmpStudio,_tmpGenres,_tmpDirectors,_tmpWriters,_tmpActors,_tmpYear,_tmpLength,_tmpShortDescription,_tmpMpaRating,_tmpCriticsRating);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
