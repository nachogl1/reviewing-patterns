package com.nachogl1.reviewingpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist("ArtisName", "ArtistBio", "www.artis.com", new byte[]{});
        Book book = new Book("www.book.com", new byte[]{}, "TitleBook", "SnippetOfBook");

        Resource artistResource = new ArtistResource(artist);
        Resource bookResource = new BookResource(book);

        //By using this pattern, we can create different view types for different resources with no much code

        ViewStyle detailedForArtist = new DetailedView(artistResource);
        ViewStyle popUpViewForBook = new PopUpView(bookResource);
//        ViewStyle popUpViewForArtist = new PopUpView(artistResource);
//        ViewStyle detailedForBook = new DetailedView(bookResource);

        detailedForArtist.show();
        popUpViewForBook.show();
    }
}
