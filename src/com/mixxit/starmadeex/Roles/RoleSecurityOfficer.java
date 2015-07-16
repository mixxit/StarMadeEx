package com.mixxit.starmadeex.Roles;

import com.mixxit.starmadeex.BaseRole;
import com.mixxit.starmadeex.Enums.RoleType;

public class RoleSecurityOfficer extends BaseRole {

	public RoleSecurityOfficer()
	{
		setRoleName("Security Officer");
		setRoleType(RoleType.SECURITYOFFICER);		
	}
}
