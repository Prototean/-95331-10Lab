package se331.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se331.lab.dao.AuctionItemDao;
import se331.lab.entity.AuctionItem;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuctionItemServiceImpl implements AuctionItemService {
    final AuctionItemDao auctionItemDao;

    @Override
    public List<AuctionItem> getAuctionItems() {
        return auctionItemDao.getAuctionItems();
    }

    @Override
    public List<AuctionItem> getAuctionItems(String description) {
        return auctionItemDao.getAuctionItems(description);
    }

    @Override
    public List<AuctionItem> getAuctionItems(String description, String type) {
        return auctionItemDao.getAuctionItems(description, type);
    }

    @Override
    public List<AuctionItem> getAuctionItemsSuccessfulBidLessThan(Double value) {
        return auctionItemDao.getAuctionItemsSuccessfulBidLessThan(value);
    }
}
