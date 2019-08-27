package multiCartTest;

import org.testng.annotations.BeforeMethod;

import multiCartUtility.Hooks;

public class BlackKajalTest extends Hooks {


@BeforeMethod
public void launchWith() {
	launchwith("Chrome", "https://www.demo.iscripts.com/multicart/demo/index.php");
}


}