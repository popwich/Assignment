package wk5_proj;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
public class Company {

	private String companyName;

	private Set<Customer> customers;

	private Address address;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Company) {
			final Company other = (Company) obj;
			if (ObjectUtils.equals(companyName, other.companyName) == false)
				return false;
			return true;
		}
		return false;
	}

	@Embedded
	public Address getAddress() {
		return this.address;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	@ManyToMany
	public Set<Customer> getCustomers() {
		return this.customers;
	}


	@Override
	public int hashCode() {
		final HashCodeBuilder builder = new HashCodeBuilder();
		if (companyName != null)
			builder.append(companyName);
		return builder.toHashCode();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCompanyName(String value) {
		this.companyName = value;
	}

	public void setCustomers(Set<Customer> customerss) {
		this.customers = customerss;
	}


	@Override
	public String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(companyName);
		return builder.toString();
	}

}
