public class BookAppl {

	public static void main(String[] args) {
	Book mockingbird = new Book("Harper Lee", "To Kill a Mockingbird", 9781428113701l, 30, 15);
	System.out.println(mockingbird.getAuthor());
	mockingbird.display();
	}

}
