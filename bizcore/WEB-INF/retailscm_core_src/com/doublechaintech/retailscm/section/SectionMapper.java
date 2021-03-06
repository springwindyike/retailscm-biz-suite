
package com.doublechaintech.retailscm.section;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.math.BigDecimal;
import com.doublechaintech.retailscm.BaseRowMapper;

public class SectionMapper extends BaseRowMapper<Section>{
	
	protected Section internalMapRow(ResultSet rs, int rowNumber) throws SQLException{
		Section section = getSection();		
		 		
 		setId(section, rs, rowNumber); 		
 		setTitle(section, rs, rowNumber); 		
 		setBrief(section, rs, rowNumber); 		
 		setIcon(section, rs, rowNumber); 		
 		setViewGroup(section, rs, rowNumber); 		
 		setLinkToUrl(section, rs, rowNumber); 		
 		setPage(section, rs, rowNumber); 		
 		setVersion(section, rs, rowNumber);

		return section;
	}
	
	protected Section getSection(){
		return new Section();
	}		
		
	protected void setId(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String id = rs.getString(SectionTable.COLUMN_ID);
		
		if(id == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setId(id);
	}
		
	protected void setTitle(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String title = rs.getString(SectionTable.COLUMN_TITLE);
		
		if(title == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setTitle(title);
	}
		
	protected void setBrief(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String brief = rs.getString(SectionTable.COLUMN_BRIEF);
		
		if(brief == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setBrief(brief);
	}
		
	protected void setIcon(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String icon = rs.getString(SectionTable.COLUMN_ICON);
		
		if(icon == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setIcon(icon);
	}
		
	protected void setViewGroup(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String viewGroup = rs.getString(SectionTable.COLUMN_VIEW_GROUP);
		
		if(viewGroup == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setViewGroup(viewGroup);
	}
		
	protected void setLinkToUrl(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String linkToUrl = rs.getString(SectionTable.COLUMN_LINK_TO_URL);
		
		if(linkToUrl == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setLinkToUrl(linkToUrl);
	}
		
	protected void setPage(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		String page = rs.getString(SectionTable.COLUMN_PAGE);
		
		if(page == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setPage(page);
	}
		
	protected void setVersion(Section section, ResultSet rs, int rowNumber) throws SQLException{
	
		//there will be issue when the type is double/int/long
		
		Integer version = rs.getInt(SectionTable.COLUMN_VERSION);
		
		if(version == null){
			//do nothing when nothing found in database
			return;
		}
		
		section.setVersion(version);
	}
		
		

}


