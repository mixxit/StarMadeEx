package com.mixxit.starmadeex;

import com.mixxit.starmadeex.Enums.RoleType;
import com.mixxit.starmadeex.Interfaces.IRole;

public class BaseRole implements IRole {
	private String rolename = "Unknown";
	private RoleType roletype = RoleType.UNKNOWN;

	public BaseRole()
	{
				
	}
	
	@Override
	public String getRoleName() {
		return this.rolename;
	}

	@Override
	public void setRoleName(String rolename) {
		this.rolename = rolename;
	}

	@Override
	public RoleType getRoleType() {
		return this.roletype;
	}

	@Override
	public void setRoleType(RoleType roletype) {
		this.roletype = roletype;
	}
}
