
public class xz
{
	public static void main(String[] args)
	{
		ConcreteStrategyA strategy=new ConcreteStrategyA();
		strategy.algorithm();
	}
}
class Context
{
	private Strategy strategy;
	void setStrategy(Strategy strategy)
	{
		this.strategy=strategy;
	}
	void invokeStrategy()
	{
		strategy.algorithm();
	}
}

interface Strategy
{
	void algorithm();
}
class ConcreteStrategyA implements Strategy
{
	public void algorithm()
	{
		System.out.println("1");
	}
}
class ConcreteStrategyB implements Strategy
{
	public void algorithm()
	{
		
	}
}
class ConcreteStrategyC implements Strategy
{
	public void algorithm()
	{
		
	}
}