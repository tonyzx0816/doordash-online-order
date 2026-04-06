package com.laioffer.onlineorder.service;

import com.laioffer.onlineorder.entity.MenuItemEntity;
import com.laioffer.onlineorder.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
   private final MenuItemRepository menuItemRepository;

   public MenuItemService(MenuItemRepository menuItemRepository) {
       this.menuItemRepository = menuItemRepository;
   }

   // MenuItem is for the use of internal or for restaurantService,
   // so it doesn't need to convert to Dto, provide more flexibility
   public List<MenuItemEntity> getMenuItemsByRestaurantId(long restaurantId){
       return menuItemRepository.getByRestaurantId(restaurantId);
   }

   public MenuItemEntity getMenuItemById(long id){
       return menuItemRepository.findById(id).get();
   }
}
