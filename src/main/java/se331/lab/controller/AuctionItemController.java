package se331.lab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se331.lab.entity.AuctionItem;
import se331.lab.service.AuctionItemService;
import se331.lab.util.LabMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuctionItemController {
    final AuctionItemService auctionItemService;

    @GetMapping("auctionItems")
    public ResponseEntity<?> getAuctionItems(
            @RequestParam(value = "description", required = false) String description) {
        List<AuctionItem> output;
        if (description == null) {
            output = auctionItemService.getAuctionItems();
        } else {
            output = auctionItemService.getAuctionItems(description);
        }
        return ResponseEntity.ok(LabMapper.INSTANCE.getAuctionItemDTO(output));
    }

    @GetMapping("auctionItems/successfulBidLessThan")
    public ResponseEntity<?> getAuctionItemsSuccessfulBidLessThan(
            @RequestParam("value") Double value) {
        List<AuctionItem> output = auctionItemService.getAuctionItemsSuccessfulBidLessThan(value);
        return ResponseEntity.ok(LabMapper.INSTANCE.getAuctionItemDTO(output));
    }
}
