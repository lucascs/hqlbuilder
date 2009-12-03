package br.com.caelum.hqlbuilder;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HQLBuilderTest {

	static class Client {
	}
	static class User {
	}

	@Test
	public void proxyToStringReturnsCorrespondingHQL() throws Exception {
		String hql = HQLBuilder.from(Client.class).toString();
		assertThat(hql, is("from Client"));
	}
	@Test
	public void otherProxyToStringReturnsCorrespondingHQL() throws Exception {
		String hql = HQLBuilder.from(User.class).toString();
		assertThat(hql, is("from User"));
	}
}
