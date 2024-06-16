import unittest
from DCP1204 import greatestCommonFactorI


# Test the code
class TestGreatestCommonFactor(unittest.TestCase):
    
    def test_greatestCommonFactorI(self):
        self.assertEqual(greatestCommonFactorI([48, 18, 30, 42]), 6)
        self.assertEqual(greatestCommonFactorI([101, 10, 15]), 1)
        self.assertEqual(greatestCommonFactorI([54, 24, 12]), 6)
        self.assertEqual(greatestCommonFactorI([48, 0]), 48)
        self.assertEqual(greatestCommonFactorI([0]), 0)
        self.assertEqual(greatestCommonFactorI([]), None)
        self.assertEqual(greatestCommonFactorI([18, 18, 18]), 18)

if __name__ == '__main__':
    unittest.main()
# Doesn't seem to work, will investigate later