package se331.lab.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import se331.lab.entity.AuctionItem;
import se331.lab.repository.AuctionItemRepository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuctionItemDaoImpl implements AuctionItemDao {
    final AuctionItemRepository auctionItemRepository;

    @Override
    public List<AuctionItem> getAuctionItems() {
        return auctionItemRepository.findAll();
    }

    @Override
    public List<AuctionItem> getAuctionItems(String description) {
        return auctionItemRepository.findByDescriptionContainingIgnoreCase(description);
    }

    @Override
    public List<AuctionItem> getAuctionItemsSuccessfulBidLessThan(Double value) {
        return auctionItemRepository.findBySuccessfulBidAmountLessThan(value);
    }
}
