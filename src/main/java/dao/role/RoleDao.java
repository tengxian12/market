package dao.role;

import java.sql.Connection;
import java.util.List;

import pojo.Role;

public interface RoleDao {

	//获取角色列表
		public List<Role> getRoleList(Connection connection)throws Exception;
	
}
