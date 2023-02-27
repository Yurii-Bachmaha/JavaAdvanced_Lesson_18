package task01.domain;

import java.util.Objects;

public class Participant {
	private Integer id;
	private String name;
	private String email;
	private String primarySkill;
	private Level level;

	public Participant(Integer id, String name, String email, String primarySkill, Level level) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.primarySkill = primarySkill;
		this.level = level;
	}

	public Participant() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, level, name, primarySkill);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participant other = (Participant) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && level == other.level
				&& Objects.equals(name, other.name) && Objects.equals(primarySkill, other.primarySkill);
	}

	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", email=" + email + ", primarySkill=" + primarySkill
				+ ", level=" + level.toString() + "]";
	}

}