

class Library:
    def __init__(self):
        self.books = []

    def add_book(self, title):
        self.books.append(title)
        print(f"Book '{title}' added to library.")

    def view_books(self):
        if not self.books:
            print("No books in the library.")
        else:
            print("Books in library:")
            for book in self.books:
                print(f"- {book}")

    def remove_book(self, title):
        if title in self.books:
            self.books.remove(title)
            print(f"Book '{title}' removed from library.")
        else:
            print(f"Book '{title}' not found.")

print(" login updated")
print("main modification")
library = Library()
library.add_book("Python Programming")
library.add_book("Data Structures")
library.view_books()
library.remove_book("Python Programming")
library.view_books()

