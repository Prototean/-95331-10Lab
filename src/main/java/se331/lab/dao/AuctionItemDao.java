package se331.lab.dao;

import se331.lab.entity.AuctionItem;

import java.util.List;

public interface AuctionItemDao {
    List<AuctionItem> getAuctionItems();
    List<AuctionItem> getAuctionItems(String description);
    List<AuctionItem> getAuctionItems(String description, String type);
    List<AuctionItem> getAuctionItemsSuccessfulBidLessThan(Double value);
}
