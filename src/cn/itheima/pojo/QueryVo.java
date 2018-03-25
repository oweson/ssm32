package cn.itheima.pojo;

import java.util.List;

public class QueryVo {
	private Items items;
	//批量的进行删除；
	
	private Integer[] ids;
	//批量的进行修改；
	private List<Items> itemsList;
 
	public List<Items> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<Items> itemsList) {
		this.itemsList = itemsList;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}
	

}
