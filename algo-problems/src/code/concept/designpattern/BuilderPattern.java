package code.concept.designpattern;

public class BuilderPattern {

	String firstName;
	String lastName;
	String address;
	String email;
	String city;
	String country;
	String gender;
	String suffix;

	public BuilderPattern(String firstName, String lastName, String address, String email, String city, String country,
			String gender, String suffix) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.suffix = suffix;
	}

	public static class BuilderPatternBuilder {

		String privfirstName;
		String privlastName;
		String privaddress;
		String privemail;
		String privcity;
		String privcountry;
		String privgender;
		String privsuffix;

		public BuilderPatternBuilder(String privfirstName, String privlastName, String privaddress) {
			this.privfirstName = privfirstName;
			this.privlastName = privlastName;
			this.privaddress = privaddress;
		}

		public BuilderPatternBuilder email(String privemail) {
			this.privemail = privemail;
			return this;
		}

		public BuilderPatternBuilder city(String privcity) {
			this.privcity = privcity;
			return this;
		}

		public BuilderPatternBuilder country(String privcountry) {
			this.privcountry = privcountry;
			return this;
		}

		public BuilderPatternBuilder gender(String privgender) {
			this.privgender = privgender;
			return this;
		}

		public BuilderPatternBuilder suffix(String privsuffix) {
			this.privsuffix = privsuffix;
			return this;
		}

		public BuilderPattern create() {
			return new BuilderPattern(this.privfirstName, this.privlastName, 
					this.privaddress, this.privemail,
					this.privcity, this.privcountry, this.privgender, this.privsuffix);
		}
	}

}
