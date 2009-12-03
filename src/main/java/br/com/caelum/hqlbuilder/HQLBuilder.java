package br.com.caelum.hqlbuilder;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

public class HQLBuilder {

	public static <T> T from(final Class<T> type) {
		return type.cast(Enhancer.create(type, new FixedValue() {
			public Object loadObject() throws Exception {
				return "from " + type.getSimpleName();
			}
		}));
	}

}
