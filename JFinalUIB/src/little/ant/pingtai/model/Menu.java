package little.ant.pingtai.model;

import com.jfinal.plugin.activerecord.Model;

public class Menu extends Model<Menu> {

	private static final long serialVersionUID = 6761767368352810428L;
	
	public static final Menu dao = new Menu();
	
	/**
	 * 根据菜单获取对应的功能，可能为空
	 * @return
	 */
	public Operator getOperator(){
		return Operator.dao.findById(get("operatorids"));
	}
	
}
