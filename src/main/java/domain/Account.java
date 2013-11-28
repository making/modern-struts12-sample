package domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;

	private String email;
}
