class Deck
  attr_reader :cards
  def initialize(n)
    # @cards = standard_deck * (__________(1)__________) + standard_deck.take(__________(2)__________)
    @cards = standard_deck * (n/52) + standard_deck.take(n%52)
    # @cards.__________(3)__________ #=> [[12, "diamonds"], [8, "hearts"], [12, "clubs"], ...]
    @cards.shuffle! #=> [[12, "diamonds"], [8, "hearts"], [12, "clubs"], ...]
  end

  def standard_deck
    @rank = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
    @suit = ["clubs", "diamonds", "hearts", "spades"]
    # @deck = @rank.__________(4)__________(@suit)
    @deck = @rank.product(@suit)
    # @deck.__________(5)__________ #=> [[12, "diamonds"], [8, "hearts"], [12, "clubs"], ...]
    @deck.shuffle! #=> [[12, "diamonds"], [8, "hearts"], [12, "clubs"], ...]
  end
  # private __________(6)__________
  private :standard_deck

  def deal(n)
    # if n > __________(7)__________
    if n > @cards.size
      puts 'Not enough cards in deck!'
    else
      # @cards.__________(8)__________
      @cards.shift(n)
    end
  end

  # def arrange_cards(m __________(9)__________)
  def arrange_cards(m='suit')
    if m == 'rank'
      # @cards.__________(10)__________
      @cards.sort_by!{|x|x[0]} # or sort_by{&:first}
    elsif m == 'suit'
      # @cards.__________(11)__________
      @cards.sort_by!{|x|[x[1],x[0]]}
    else
      puts 'Please enter rank or suit!'
    end
  end

end

class Player
  attr_reader :name, :hand, :points
  def initialize(name, deck)
    @name = name
    @my_deck = deck
    @hand = @my_deck.deal(2)
    @points = count_points
  end

  def count_points
    # @hand.map{__________(12)__________}.inject(__________(13)__________)
    @hand.map{|x,y|x=10 if x>10;x}.inject(:+)
  end
  private :count_points

  def draw
    # new_card = @my_deck.__________(14)__________
    new_card = @my_deck.deal(1)
    # @hand.__________(15)__________(new_card) # using push and insert are incorrect
    @hand.concat(new_card) # using push and insert are incorrect
    @points = count_points
  end

  def display_hand
    puts "#{@hand.size} cards in hand:"
    # @hand.__________(16)__________ do |x|
    @hand.each do |x|
      puts "The #{x[0]} of #{x[1]}" #=> Example: The 2 of clubs
    end
    puts "The total points are #{@points}."
  end

  def reveal_hand
    # @points += 10 if @points <= __________(17)__________ && @hand.__________(18)__________{ |x, y| x == 1 } # switch Aces
    @points += 10 if @points <= 11 && @hand.any?{ |x, y| x == 1} # switch Aces
    puts "Your final points are #{@points}."
    puts 'You hit the blackjack! :)' if @points == 21
    puts 'You busted! :(' if @points > 21
    put_hand_back_onto_deck
  end

  def put_hand_back_onto_deck
    # @my_deck.cards.__________(19)__________(@hand)
    @my_deck.cards.unshift(@hand)
    @hand = []
  end
  private :put_hand_back_onto_deck

end

deck = Deck.new(52)
# Comment out the line below if you do not wish to arrange the cards and rather get random draw form the deck.
deck.arrange_cards
player = Player.new('Alice', deck)

player.display_hand
puts ''

player.draw
player.draw
player.draw
player.draw

player.display_hand
puts ''

player.reveal_hand
