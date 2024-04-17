package adapter.library;

import adapter.library.api.LibraryAPI;
import adapter.library.api.LibraryAPIImpl;
import adapter.library.api.LibraryAPIv2;
import adapter.library.api.LibraryAPIv2Impl;

public class Main {

  public static void main(String[] args) {


//    LibraryAPI api = new LibraryAPIImpl();
//
//    User user = new User("Monika","Baszczyk","32131212");
//
//    BookConnector connector = new BookConnector(user,api);
//
//    connector.checkAviability("Harry Potter i Zakon Feniksa");

    User user = new User("Monika","Baszczyk","32131212");

    LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

    APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

    BookConnector connector = new BookConnector(user,apiAdapter);

    connector.checkAviability("Wspomnienia");
  }

}
