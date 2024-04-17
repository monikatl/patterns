package adapter.library;

import adapter.library.api.LibraryAPI;
import adapter.library.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

  private final User user;
  private final LibraryAPIv2 api;

  public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
    this.api = libraryAPIv2;
    this.user = user;
  }

  @Override
  public boolean isAviable(String bookTitle) {
    return api.numberOfAviableCopies(bookTitle) > 0;
  }

  @Override
  public LocalDate dueDate(String bookTitle, String pesel) {
    return api.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
  }

  @Override
  public boolean reserve(String bookTitle, String pesel) {
    return api.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
  }
}
