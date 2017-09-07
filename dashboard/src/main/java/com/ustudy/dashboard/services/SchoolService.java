package com.ustudy.dashboard.services;

import java.util.List;

import com.ustudy.dashboard.model.OrgBrife;
import com.ustudy.dashboard.model.School;

/**
 * @author jared
 *
 */

public interface SchoolService {

	
	/**
	 * @param id  --- retrieve item list from id
	 * @return
	 */
	public List<School> getList(int id);
	
	/**
	 * @param data --- to be stored into database
	 * @return  --- index in the datababse
	 */
	public int createItem(School data);
	
	public int deleteItem(int id);
	
	public School displayItem(int id);
	
	public int updateItem(School data, int id);
	
	public int delItemSet(String ids);
	
	public List<OrgBrife> getOrgBrifeList(int id);
	
<<<<<<< HEAD
	public List<School> getList(int id) {
		List<School> schs = null;
		String sqlSch = "select * from school where id > ? limit 10000";
		try {
			schs = jdbcT.query(sqlSch, new RowMapper<School>() {
				
				@Override
				public School mapRow(ResultSet rs, int rowNum) throws SQLException {
					logger.debug("Firstly column -> " + rs.getString(1));
					School item = new School(rs.getString("id"), rs.getString("school_id"), 
						rs.getString("school_name"), rs.getString("school_type"),
						rs.getString("province"), rs.getString("city"), rs.getString("district"));
					return item;
				}
			}, id);
			for (School sch: schs) {
				logger.debug(sch.toString());
				
				List<String> gNames = null;
				String sqlGra = "select distinct grade_name from course where school_id = ?;";
				gNames = jdbcT.query(sqlGra, new RowMapper<String>() {
					@Override
					public String mapRow(ResultSet rs, int rowNum) throws SQLException {
						return rs.getString("grade_name");
						
					}
				}, sch.getSchoolId());
				
				List<Grade> grades = new ArrayList<Grade>();
				for (String gn : gNames) {
					List<Subject> cs = null;
					String sqlCs = "select distinct course_name from course where school_id = ? and grade_name = ?;";
					cs = jdbcT.query(sqlCs, new RowMapper<Subject>() {
						@Override
						public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
							Subject item = new Subject(rs.getString("course_name"));
							return item;
						}
					}, sch.getSchoolId(), gn);
					grades.add(new Grade(gn, cs));
				}
				sch.setGrades(grades);
			}
			
	    } catch (DataAccessException e) {
			logger.warn("SchoolService.getList() from id " + id + " failed with spring DAO exceptions");
			logger.warn(e.getMessage());
		} 
		return schs;
	}
}
=======
}
>>>>>>> upstream/0.1.0
