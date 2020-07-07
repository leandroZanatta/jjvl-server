package br.com.jjvl.entregas.util;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import com.google.gson.reflect.TypeToken;;

public class ModelMapperUtil {

	private ModelMapperUtil() {

	}

	private static ModelMapper modelMapper = new ModelMapper();

	static {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	public static <T, K> T map(K from, Class<T> to) {
		return modelMapper.map(from, to);
	}

	public static <T, K> List<T> list(Iterable<K> from, Class<T> to) {

		Type targetListType = TypeToken.getParameterized(List.class, to).getType();

		return modelMapper.map(from, targetListType);
	}
}
