package domain;

import javax.inject.Named;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@Singleton
public class AccountService {
	private static final Logger logger = LoggerFactory
			.getLogger(AccountService.class);

	public Account create(Account account) {
		logger.info("create {}", account);
		return account;
	}
}
