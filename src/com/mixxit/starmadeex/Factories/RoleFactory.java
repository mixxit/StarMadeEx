package com.mixxit.starmadeex.Factories;

import java.util.ArrayList;
import java.util.Collections;

import com.mixxit.starmadeex.BaseRole;
import com.mixxit.starmadeex.Enums.RoleType;
import com.mixxit.starmadeex.Roles.RoleAssistant;
import com.mixxit.starmadeex.Roles.RoleAssistantTraitor;
import com.mixxit.starmadeex.Roles.RoleBartender;
import com.mixxit.starmadeex.Roles.RoleBotanist;
import com.mixxit.starmadeex.Roles.RoleCaptain;
import com.mixxit.starmadeex.Roles.RoleCargoTechnician;
import com.mixxit.starmadeex.Roles.RoleChaplain;
import com.mixxit.starmadeex.Roles.RoleChef;
import com.mixxit.starmadeex.Roles.RoleChiefEngineer;
import com.mixxit.starmadeex.Roles.RoleChiefMedicalOfficer;
import com.mixxit.starmadeex.Roles.RoleClown;
import com.mixxit.starmadeex.Roles.RoleDetective;
import com.mixxit.starmadeex.Roles.RoleHeadOfPersonnel;
import com.mixxit.starmadeex.Roles.RoleHeadOfSecurity;
import com.mixxit.starmadeex.Roles.RoleJanitor;
import com.mixxit.starmadeex.Roles.RoleLawyer;
import com.mixxit.starmadeex.Roles.RoleMedicalDoctor;
import com.mixxit.starmadeex.Roles.RoleMime;
import com.mixxit.starmadeex.Roles.RoleMiner;
import com.mixxit.starmadeex.Roles.RolePilot;
import com.mixxit.starmadeex.Roles.RoleQuarterMaster;
import com.mixxit.starmadeex.Roles.RoleResearchDirector;
import com.mixxit.starmadeex.Roles.RoleScientist;
import com.mixxit.starmadeex.Roles.RoleSecurityOfficer;
import com.mixxit.starmadeex.Roles.RoleStationEngineer;
import com.mixxit.starmadeex.Roles.RoleWarden;

public class RoleFactory {
	
	public static BaseRole CreateRole(RoleType roletype)
	{
		BaseRole role = null;
		
		switch(roletype)
		{
			case ASSISTANT:
				role = new RoleAssistant();
				break;
			case ASSISTANTTRAITOR:
				role = new RoleAssistantTraitor();
				break;
			case BARTENDER:
				role = new RoleBartender();
				break;
			case BOTANIST:
				role = new RoleBotanist();
				break;
			case CAPTAIN:
				role = new RoleCaptain();
				break;
			case CARGOTECHNICIAN:
				role = new RoleCargoTechnician();
				break;
			case CHAPLAIN:
				role = new RoleChaplain();
				break;
			case CHEF:
				role = new RoleChef();
				break;
			case CHIEFENGINEER:
				role = new RoleChiefEngineer();
				break;
			case CHIEFMEDICALOFFICER:
				role = new RoleChiefMedicalOfficer();
				break;
			case CLOWN:
				role = new RoleClown();
				break;
			case DETECTIVE:
				role = new RoleDetective();
				break;
			case HEADOFPERSONNEL:
				role = new RoleHeadOfPersonnel();
				break;
			case HEADOFSECURITY:
				role = new RoleHeadOfSecurity();
				break;
			case JANITOR:
				role = new RoleJanitor();
				break;
			case LAWYER:
				role = new RoleLawyer();
				break;
			case MEDICALDOCTOR:
				role = new RoleMedicalDoctor();
				break;
			case MIME:
				role = new RoleMime();
				break;
			case MINER:
				role = new RoleMiner();
				break;
			case PILOT:
				role = new RolePilot();
				break;
			case QUARTERMASTER:
				role = new RoleQuarterMaster();
				break;
			case RESEARCHDIRECTOR:
				role = new RoleResearchDirector();
				break;
			case SCIENTIST:
				role = new RoleScientist();
				break;
			case SECURITYOFFICER:
				role = new RoleSecurityOfficer();
				break;
			case STATIONENGINEER:
				role = new RoleStationEngineer();
				break;
			case WARDEN:
				role = new RoleWarden();
				break;
			default:
				break;
		
		}
		
		return role;
	}

	public static RoleType GetRandomRoleType() {
		RoleType[] roletypes = RoleType.values();
		return roletypes[(int)(Math.random()*roletypes.length)];
		
	}
}
