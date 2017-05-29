# CommonNounExtractor

Logic: I have used Standford PosTagger for tagging ReviewText. Then extracted the occurance of JJ/JJR/JJS with NN/NNS i.e. adjective with common noun and only NN/NNS i.e. only common noun in tagged data.
			
1. tagger Folder: 
	contains the pre-trained models used to do POS tagging.
2. lib Folder: 
	contains the jackson parser for parsing json file. Also contains Stanford PosTagger to perform POS tagging.
3. output Folder: 
	contains the output generated which contains adjective and common noun combination.
			

The project contain all the jars files required to run the project. It also contains generated output from the reviews.

Please pass two arguments while running the Main class: 
1. args[0] = path of json file i.e. "Path_to_Json\\Cell_Phones_and_Accessories_5_1000reviews.json"
2. args[1] = Path of trained tagger i.e. "Path_to_tagger\\bidirectional-distsim-wsj-0-18.tagger"

Steps to run the project
1. Download, Extract and Import project in Eclipse.
2. Right Click on imported project Run As -> Run Configurations->Arguments Tab
3. Copy path of json file
4. Copy path of trained tagger 
5. Click Run
