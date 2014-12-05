package bu.spring.cha06.controller;

public class Page {
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	private int category;
	private int page;
	@Override
	public String toString() {
		return "Page [category=" + category + ", page=" + page + "]";
	}
	
	
}
