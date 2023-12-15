package tacos.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import tacos.TacoOrder;
//import tacos.User;

@Repository
public interface OrderRepository
         extends CrudRepository<TacoOrder, Long> {

//  List<TacoOrder> findByUserOrderByPlacedAtDesc(
//           Pageable pageable);

  /*
  List<Order> findByUserOrderByPlacedAtDesc(User user);
   */

}
