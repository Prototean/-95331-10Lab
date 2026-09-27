package se331.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.entity.AuctionItem;

public interface AuctionItemRepository extends JpaRepository<AuctionItem, Long> {
}
