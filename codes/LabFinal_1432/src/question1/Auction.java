package question1;
import java.util.*;

class Auction implements Auctioneer {
    private List<Bidder> bidders = new ArrayList<>();
    private String product;
    private double currentBid;
    private int highestBidderId;

    public Auction(String product, double startingBid) {
        this.product = product;
        this.currentBid = startingBid;
    }

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.update(product, currentBid, highestBidderId);
        }
    }

    public void newBid(int bidderId, double bidAmount) {
        if (bidAmount > currentBid) {
            System.out.println("New highest bid: $" + bidAmount + " by bidder #" + bidderId);
            currentBid = bidAmount;
            highestBidderId = bidderId;
            notifyBidders();
        } else {
            System.out.println("Bid of $" + bidAmount + " is too low. Current bid is $" + currentBid);
        }
    }
}

