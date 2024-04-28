package com.example.assignemt05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val foodName = arrayOf(
        "FoodPanda",
        "Mango",
        "Banana",
        "Strawberry",
        "Jackfruit",
        "lychee",
        "Pizza",
        "Malabar plum",
        "Watermelon"
    )

    val foodDts = arrayOf(
        "Food Delivery Service",
        "Savor the sweetness of summer with our juicy mango fruit delight",
        "Experience a burst of natural sweetness with our ripe, creamy bananas",
        "Treat yourself to a burst of freshness with our luscious",
        "Savor the tropical goodness of our ripe, fragrant jackfruit",
        "Experience the exotic sweetness of our succulent lychees",
        "Satisfy your cravings with a slice of cheesy perfection",
        "Savor the unique sweetness of Malabar plums",
        "Quench your thirst with a juicy slice of summer"
    )
    val foodIm = arrayOf(
        R.drawable.foo,
        R.drawable.mango,
        R.drawable.benana,
        R.drawable.stravory,
        R.drawable.kathal,
        R.drawable.litchi,
        R.drawable.pizza,
        R.drawable.jem,
        R.drawable.tormuz
    )

    val longdts = arrayOf(
        "Step into the world of culinary delights with Foodpanda, your gateway to a gastronomic adventure like no other. Picture this: youve had a long day at work, your stomach grumbling in protest as you navigate through the hustle and bustle of daily life. But fear not, for Foodpanda is here to rescue you from mundane meals and lackluster options .With Foodpanda, the possibilities are as endless as your appetite. From the sizzling streets of Bangkok to the charming cafes of Paris, embark on a global journey without leaving the comfort of your own home. Craving authentic Italian pasta? How about some spicy Szechuan stir-fry? Or perhaps a decadent slice of New York cheesecake to satisfy your sweet tooth? Whatever your heart desires, Foodpanda has you covered. Navigating through the Foodpanda app is a breeze, with its intuitive interface and user-friendly design. Simply enter your location, browse through a plethora of restaurants, and feast your eyes on a tantalizing array of dishes. With just a few taps, your order is placed, and the countdown to culinary bliss begins. But Foodpanda is more than just a food delivery service—it's a culinary concierge, catering to your every whim and fancy. Whether you're hosting a lavish dinner party or enjoying a cozy night in, Foodpanda's diverse selection of restaurants ensures that there's something for everyone, no matter the occasion. And let's not forget about convenience. With Foodpanda's lightning-fast delivery service, your cravings are satisfied in record time. Say goodbye to long lines and tedious meal prep, and hello to effortless dining at its finest. But Foodpanda isn't just about food—it's about bringing people together through the universal language of cuisine. Whether you're sharing a meal with loved ones or indulging in a solo feast, Foodpanda transforms ordinary moments into extraordinary experiences. So why wait? Join the millions of satisfied customers who have made Foodpanda their go-to destination for all things delicious. Whether you're craving comfort food classics or daring culinary creations, Foodpanda delivers, quite literally, with every bite.",
        "Dive into the tropical paradise with our succulent mangoes! Bursting with sweet, juicy flavor and a heavenly aroma, each bite is like a sun-kissed vacation for your taste buds. Whether enjoyed on its own, blended into a smoothie, or added to your favorite dishes, our mangoes are a deliciously versatile treat that brings a taste of sunshine to any occasion. Indulge in the natural goodness of this beloved fruit, and let its vibrant sweetness brighten your day",
        "Experience nature's perfect snack with our ripe, creamy bananas! Packed with potassium and natural sweetness, each bite is a satisfying burst of energy. Whether enjoyed on-the-go, sliced over cereal, or blended into a creamy smoothie, our bananas are a versatile and nutritious addition to any meal. From their convenient peel-and-eat packaging to their tropical flavor, these bananas are a timeless favorite that appeals to all ages. So grab a bunch and taste the goodness of this beloved fruit today!",
        "Tantalize your taste buds with our vibrant and juicy strawberries! Bursting with flavor and vibrant hues, each bite is a delightful symphony of sweetness and tartness. Whether enjoyed fresh as a standalone treat, paired with cream for a classic indulgence, or infused into desserts for an extra burst of flavor, our strawberries are a versatile delight that adds a touch of elegance to any dish. Picked at the peak of ripeness and delivered fresh to your door, these strawberries are a delicious reminder of summer's bounty, ready to brighten your day with their irresistible charm.",
        "Discover the tropical treasure of our luscious jackfruit! With its unique flavor profile and intoxicating aroma, each bite is a journey to paradise. Bursting with sweet and tangy notes, our jackfruit is a culinary marvel, perfect for enjoying on its own or incorporating into a variety of dishes. From savory curries to refreshing smoothies, its versatility knows no bounds. As you indulge in its tender, golden flesh, you'll be transported to sun-drenched orchards and balmy breezes, savoring the taste of summer all year round. So take a bite and experience the exotic allure of our exquisite jackfruit!",
        "Elevate your taste experience with our succulent lychees! Bursting with exotic sweetness and a tantalizing floral aroma, each lychee is a delicate treasure waiting to be savored. With its translucent flesh and juicy texture, this tropical fruit offers a refreshing escape from the ordinary. Whether enjoyed as a refreshing snack on a hot day or as a luxurious addition to cocktails and desserts, our lychees are a versatile delight that adds a touch of elegance to any occasion. So peel back the luscious skin, revel in the juicy goodness within, and let the enchanting flavor of our lychees transport you to paradise.",
        "Experience the ultimate comfort food with our mouthwatering pizzas! Crafted with care and bursting with flavor, each slice is a tantalizing blend of gooey cheese, savory sauce, and a medley of mouthwatering toppings. From classic pepperoni to gourmet combinations, our pizzas cater to every craving and palate. Whether you're sharing with friends at a gathering or treating yourself to a cozy night in, our pizzas are guaranteed to satisfy your hunger and delight your senses. So indulge in the perfect balance of crispy crust, melty cheese, and savory goodness, and let our pizzas elevate your dining experience to new heights of deliciousness!",
        "Embark on a culinary adventure with our exquisite Malabar plums! Also known as Malabar tamarinds or kokum, these tropical gems boast a unique blend of tangy and tart flavors, coupled with a subtle sweetness that lingers on the palate. Indigenous to the lush Malabar Coast of India, these plums are prized for their vibrant color, refreshing taste, and versatile culinary applications. From traditional Indian cuisine to contemporary fusion dishes, Malabar plums add a burst of flavor and a touch of sophistication to any recipe. Whether used to create refreshing beverages, tangy sauces, or indulgent desserts, their distinctively sour-sweet taste profile lends itself beautifully to a myriad of culinary creations. Rich in antioxidants and boasting potential health benefits, including aiding digestion and promoting overall wellness, Malabar plums are not just a culinary delight but also a nutritional powerhouse. With their vibrant hues and irresistible tang, these plums are sure to captivate your taste buds and transport you to the sun-drenched shores of the Malabar Coast.",
        "Quench your thirst and invigorate your senses with our succulent watermelons! Bursting with vibrant colors and refreshing juiciness, each bite is a celebration of summer's bounty. With its crisp, hydrating flesh and naturally sweet flavor, watermelon is the ultimate antidote to scorching days and sultry nights. Whether enjoyed chilled and sliced for a refreshing snack, blended into thirst-quenching smoothies, or incorporated into vibrant salads and desserts, our watermelons are a versatile addition to any culinary repertoire. Packed with essential vitamins, minerals, and antioxidants, they not only tantalize the taste buds but also nourish the body from within. From backyard barbecues to beachside picnics, watermelons are a staple of summertime gatherings, bringing joy and vitality to every occasion. So indulge in the simple pleasure of biting into a slice of juicy watermelon and let its delicious essence transport you to sun-drenched fields and carefree moments of bliss."
    )
    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAdapter = MyAdapter(this, foodName, foodDts, foodIm)

        listView.adapter = myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this,
                "Clicked At ${parent.getItemAtPosition(position)}",
                android.widget.Toast.LENGTH_SHORT
            ).show()
            var intent = Intent(this, FdetailsActivity::class.java)
            intent.putExtra("name",foodName[position])
            intent.putExtra("image",foodIm[position])
            intent.putExtra("desc",longdts[position])
            startActivity(intent)
        }
    }
}