package question1;
// Subject Interface
interface Auctioneer {
    void registerBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders();
}
