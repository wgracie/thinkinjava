//package containers;
//
//import java.awt.List;
//import java.util.AbstractMap;
//import java.util.ArrayList;
//
//public class SlowMap<K, V> extends AbstractMap<K, V> {
//	private List<K> keys = new ArrayList<K>();
//	private List<V> values = new ArrayList<V>();
//	public V put(K key, V value) {
//		V oldValue = get(key);
//		if(!keys.contains(key)) {
//			keys.add(key);
//			values.add(value);
//		} else {
//			values.set(keys.indexOf(key)), value);
//		}
//	}
//	
//
//}
