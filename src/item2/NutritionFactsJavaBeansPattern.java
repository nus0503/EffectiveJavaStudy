package item2;
// 자바빈즈 패턴 - 일관성이 깨지고, 불변으로 만들 수 없다.
public class NutritionFactsJavaBeansPattern {
    private int servingSize = -1; // 필쉬 기본값 없음
    private int servings = -1; //필수; 기본값 없음
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFactsJavaBeansPattern() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        NutritionFactsJavaBeansPattern cocaCola = new NutritionFactsJavaBeansPattern(); // 객체 생성이 간단해진다. 필수 필드의 값을 넣어야 할 때 자바빈즈 패턴을 쓸 경우 필수값을 누락하면서 객체를 생성할 수 있기 때문에 일관성이 무너질 수 있다.
        cocaCola.setServingSize(200);
        cocaCola.setServings(1);
        cocaCola.setCalories(100);
        cocaCola.setSodium(11);
        cocaCola.setCarbohydrate(22);

    }
}
