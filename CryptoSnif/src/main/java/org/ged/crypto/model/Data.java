
package org.ged.crypto.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "0XBTC",
    "1ST",
    "1WO",
    "AAC",
    "ABCC",
    "ABT",
    "ABYSS",
    "ACCN",
    "ACE",
    "ADA",
    "ADB",
    "ADH",
    "ADI",
    "ADL",
    "ADT",
    "ADX",
    "AE",
    "AEN",
    "AERGO",
    "AGI",
    "AGVC",
    "AID",
    "AIDOC",
    "AIT",
    "AIX",
    "ALIS",
    "ALX",
    "AMB",
    "AMLT",
    "AMM",
    "AMN",
    "AMO",
    "ANKR",
    "ANT",
    "AOA",
    "APIS",
    "APPC",
    "ARAW",
    "ARBT",
    "ARCT",
    "ARN",
    "ART",
    "ARY",
    "AST",
    "ASTO",
    "ATL",
    "ATM",
    "ATMI",
    "ATS",
    "AUC",
    "AVH",
    "AVT",
    "AWC",
    "AXPR",
    "B2B",
    "BAAS",
    "BANCA",
    "BAT",
    "BAX",
    "BBC",
    "BBO",
    "BCAP",
    "BCDN",
    "BCDT",
    "BCH",
    "BCPT",
    "BDG",
    "BEAT",
    "BEE",
    "BELA",
    "BERRY",
    "BETHER",
    "BETR",
    "BEZ",
    "BFT",
    "BGG",
    "BIO",
    "BITX",
    "BIX",
    "BKX",
    "BLNM",
    "BLOC",
    "BLT",
    "BLZ",
    "BMC",
    "BMH",
    "BMX",
    "BNK",
    "BNN",
    "BNT",
    "BNTY",
    "BOB",
    "BOE",
    "BOLT",
    "BOLTT",
    "BON",
    "BOT",
    "BOUTS",
    "BOX",
    "BPT",
    "BPX",
    "BQ",
    "BQTX",
    "BRAT",
    "BRD",
    "BSTN",
    "BSV",
    "BTC",
    "BTCL",
    "BTCM",
    "BTCRED",
    "BTM",
    "BTMX",
    "BTO",
    "BTRN",
    "BTU",
    "BUBO",
    "BUD",
    "BWT",
    "BZ",
    "BZKY",
    "BZNT",
    "C20",
    "CAG",
    "CAN",
    "CANDY",
    "CAPP",
    "CAR",
    "CARAT",
    "CARD",
    "CBC",
    "CBT",
    "CCCX",
    "CCL",
    "CCO",
    "CCRB",
    "CCT",
    "CDT",
    "CDX",
    "CEDEX",
    "CEEK",
    "CEL",
    "CELR",
    "CEN",
    "CENNZ",
    "CET",
    "CHAT",
    "CHP",
    "CHSB",
    "CHT",
    "CHX",
    "CJT",
    "CL",
    "CLN",
    "CMCT",
    "CMS",
    "CMT",
    "CND",
    "CNN",
    "CNX",
    "COB",
    "COFI",
    "COIN",
    "CONI",
    "COSM",
    "COT",
    "COU",
    "COV",
    "COVA",
    "CPAY",
    "CPCH",
    "CPT",
    "CPY",
    "CRB",
    "CRDS",
    "CRED",
    "CREDO",
    "CRO",
    "CRPT",
    "CRYC",
    "CSEN",
    "CSM",
    "CSNO",
    "CSP",
    "CTXC",
    "CUBE",
    "CV",
    "CVC",
    "CVT",
    "CXO",
    "DACC",
    "DADI",
    "DAG",
    "DAGT",
    "DAI",
    "DAN",
    "DAOC",
    "DAPS",
    "DASH",
    "DAT",
    "DATA",
    "DATX",
    "DAV",
    "DAX",
    "DAY",
    "DBET",
    "DCN",
    "DDD",
    "DEB",
    "DEC",
    "DENT",
    "DFXT",
    "DGD",
    "DGTX",
    "DGX",
    "DICE",
    "DIG",
    "DIO",
    "DLT",
    "DML",
    "DMT",
    "DNA",
    "DNT",
    "DOCK",
    "DOGE",
    "DOOH",
    "DOV",
    "DOW",
    "DPY",
    "DRG",
    "DRGN",
    "DROP",
    "DRPU",
    "DRT",
    "DTH",
    "DTR",
    "DTRC",
    "DTX",
    "DXT",
    "EARTH",
    "EBC",
    "EBTC",
    "ECASH",
    "ECHT",
    "ECOM",
    "ECTE",
    "EDG",
    "EDN",
    "EDO",
    "EDU",
    "EGCC",
    "EGT",
    "EKO",
    "EKT",
    "ELEC",
    "ELF",
    "ELI",
    "ELITE",
    "ELIX",
    "ELTCOIN",
    "ELY",
    "EMPH",
    "ENGT",
    "ENJ",
    "ENTER",
    "EOSDAC",
    "EQUAL",
    "ERC20",
    "ERIS",
    "ERO",
    "ESS",
    "EST",
    "ESZ",
    "ETBS",
    "ETC",
    "ETG",
    "ETGP",
    "ETH",
    "ETHM",
    "ETHOS",
    "ETK",
    "ETN",
    "EURS",
    "EVC",
    "EVE",
    "EVED",
    "EVR",
    "EVX",
    "EXC",
    "EXMR",
    "EXRN",
    "EXY",
    "FACE",
    "FAIRG",
    "FAT",
    "FDX",
    "FDZ",
    "FET",
    "FLIK",
    "FLIXX",
    "FLOT",
    "FLUZ",
    "FND",
    "FNTB",
    "FOAM",
    "FOTA",
    "FOXT",
    "FREC",
    "FREE",
    "FSN",
    "FT",
    "FTM",
    "FTT",
    "FTX",
    "FUEL",
    "FUN",
    "FUNDZ",
    "FXT",
    "FYP",
    "GAMB",
    "GARD",
    "GEM",
    "GENE",
    "GENS",
    "GETX",
    "GNO",
    "GNT",
    "GNX",
    "GOOD",
    "GRID",
    "GRMD",
    "GRX",
    "GSC",
    "GST",
    "GTC",
    "GTO",
    "GUESS",
    "GUP",
    "GUSD",
    "GVE",
    "GVT",
    "HAND",
    "HB",
    "HBT",
    "HBZ",
    "HEDG",
    "HER",
    "HERO",
    "HGT",
    "HIT",
    "HKN",
    "HMC",
    "HMQ",
    "HORSE",
    "HPB",
    "HPT",
    "HQT",
    "HQX",
    "HSC",
    "HST",
    "HT",
    "HUR",
    "HVN",
    "HYDRO",
    "HYT",
    "ICHX",
    "ICN",
    "ICON",
    "IDEX",
    "IDH",
    "IDT",
    "IDXM",
    "IETH",
    "IFT",
    "IG",
    "IHF",
    "IHT",
    "IMT",
    "IND",
    "ING",
    "INS",
    "INSTAR",
    "INT",
    "INVC",
    "INX",
    "INXT",
    "IOST",
    "IOTX",
    "IPC",
    "IPSX",
    "IQN",
    "ISR",
    "ITC",
    "ITL",
    "ITT",
    "IVY",
    "IXT",
    "J8T",
    "JC",
    "JET",
    "JNT",
    "JOINT",
    "JSE",
    "KAN",
    "KBC",
    "KCASH",
    "KCS",
    "KEY",
    "KICK",
    "KIN",
    "KIND",
    "KNC",
    "KRL",
    "KUE",
    "KWH",
    "LA",
    "LALA",
    "LAMB",
    "LATX",
    "LCS",
    "LDC",
    "LEDU",
    "LEND",
    "LEV",
    "LGO",
    "LIF",
    "LIFE",
    "LIKE",
    "LINA",
    "LINK",
    "LION",
    "LNC",
    "LND",
    "LOCI",
    "LOCK",
    "LOOM",
    "LPT",
    "LQDN",
    "LRC",
    "LST",
    "LTC",
    "LTO",
    "LUC",
    "LUN",
    "LYM",
    "M2O",
    "MANA",
    "MATIC",
    "MBTX",
    "MCO",
    "MDA",
    "MDCL",
    "MDS",
    "MEDX",
    "MEE",
    "MENLO",
    "META",
    "METAL",
    "METM",
    "MFG",
    "MFT",
    "MGO",
    "MIC",
    "MITH",
    "MITX",
    "MIXI",
    "MKR",
    "MLN",
    "MNC",
    "MNE",
    "MNTP",
    "MOAC",
    "MOF",
    "MOLK",
    "MOT",
    "MRK",
    "MRPH",
    "MTC",
    "MTH",
    "MTKN",
    "MTRC",
    "MTX",
    "MVL",
    "MWAT",
    "MXAI",
    "MXM",
    "MYB",
    "MYST",
    "NANJ",
    "NAS",
    "NAVI",
    "NBAI",
    "NBC",
    "NCASH",
    "NCC",
    "NCT",
    "NEC",
    "NEU",
    "NEXO",
    "NEXT",
    "NGC",
    "NIO",
    "NMR",
    "NOAH",
    "NOBS",
    "NOKU",
    "NOX",
    "NPER",
    "NPX",
    "NPXS",
    "NRG",
    "NRP",
    "NTK",
    "NULS",
    "NXC",
    "OAX",
    "OCN",
    "ODE",
    "OIO",
    "OKB",
    "OLE",
    "OLT",
    "OMG",
    "OMX",
    "ONG",
    "ONL",
    "OPEN",
    "OPT",
    "ORBS",
    "ORI",
    "ORME",
    "ORS",
    "OSA",
    "OST",
    "PAL",
    "PARETO",
    "PASS",
    "PAT",
    "PAX",
    "PAY",
    "PCH",
    "PCL",
    "PCO",
    "PFR",
    "PHI",
    "PIX",
    "PKT",
    "PLA",
    "PLAY",
    "PLBT",
    "PLR",
    "PLU",
    "PMA",
    "PMNT",
    "PNT",
    "POE",
    "POLL",
    "POLY",
    "POWR",
    "PPP",
    "PPT",
    "PRA",
    "PRG",
    "PRIX",
    "PRO",
    "PSM",
    "PST",
    "PTOY",
    "PXG",
    "PYLNT",
    "PYN",
    "QASH",
    "QBIT",
    "QCX",
    "QKC",
    "QNTU",
    "QSP",
    "QUANT",
    "QUN",
    "QUSD",
    "R",
    "RCN",
    "RCT",
    "RDC",
    "RDD",
    "REAL",
    "REBL",
    "REF",
    "REM",
    "REP",
    "REQ",
    "REX",
    "RFR",
    "RHOC",
    "RIYA",
    "RLC",
    "RLX",
    "RMESH",
    "RNT",
    "RNTB",
    "ROBET",
    "ROCK",
    "ROX",
    "RRC",
    "RTE",
    "RUFF",
    "RVT",
    "SAL",
    "SALT",
    "SAN",
    "SCC",
    "SCL",
    "SCRL",
    "SEAL",
    "SEELE",
    "SENC",
    "SENT",
    "SETH",
    "SGN",
    "SGR",
    "SHE",
    "SHIP",
    "SHOW",
    "SHP",
    "SHPING",
    "SKIN",
    "SKM",
    "SKRB",
    "SLT",
    "SMT",
    "SNC",
    "SNGLS",
    "SNIP",
    "SNM",
    "SNOV",
    "SNPC",
    "SNS",
    "SNT",
    "SNTR",
    "SNTVT",
    "SNX",
    "SOAR",
    "SOC",
    "SOLVE",
    "SOMA",
    "SPANK",
    "SPF",
    "SPHTX",
    "SPT",
    "SPX",
    "SRCH",
    "SRCOIN",
    "SRN",
    "SS",
    "STAC",
    "STACS",
    "STAR",
    "STASH",
    "STC",
    "STK",
    "STORJ",
    "STORM",
    "STQ",
    "STU",
    "STX",
    "SUB",
    "SUR",
    "SUSD",
    "SVD",
    "SWARM",
    "SWC",
    "SWFTC",
    "SWT",
    "SXDT",
    "SXUT",
    "TAAS",
    "TBX",
    "TCH",
    "TCT",
    "TDP",
    "TDS",
    "TEL",
    "TEN",
    "TFD",
    "TFL",
    "TFUEL",
    "TGAME",
    "TGT",
    "THETA",
    "THR",
    "THRT",
    "TIE",
    "TIG",
    "TIOX",
    "TIX",
    "TKN",
    "TMT",
    "TMTG",
    "TNB",
    "TNT",
    "TOMO",
    "TOPC",
    "TRAC",
    "TRAK",
    "TRCT",
    "TRDT",
    "TRIO",
    "TRST",
    "TRUE",
    "TSL",
    "TTC",
    "TTV",
    "TUSD",
    "UBC",
    "UBEX",
    "UBT",
    "UCT",
    "UDOO",
    "UFR",
    "UGAS",
    "UGC",
    "UKG",
    "UP",
    "UPP",
    "UQC",
    "USDC",
    "USDS",
    "USDT",
    "USE",
    "UTK",
    "UTNP",
    "UTT",
    "UUU",
    "VEE",
    "VERI",
    "VEST",
    "VET",
    "VIBE",
    "VIDT",
    "VIN",
    "VIT",
    "VITE",
    "VIU",
    "VME",
    "VNX",
    "VOISE",
    "VRA",
    "VRS",
    "VSL",
    "VZT",
    "WAB",
    "WABI",
    "WAN",
    "WAND",
    "WAX",
    "WBTC",
    "WCOIN",
    "WEB",
    "WELL",
    "WETH",
    "WHEN",
    "WINGS",
    "WISH",
    "WIZ",
    "WPP",
    "WPR",
    "WRC",
    "WT",
    "WTC",
    "WTL",
    "WYS",
    "X8X",
    "XAUR",
    "XBASE",
    "XBB",
    "XBL",
    "XBX",
    "XCD",
    "XCLR",
    "XDCE",
    "XES",
    "XET",
    "XMX",
    "XNG",
    "XNK",
    "XOV",
    "XPAT",
    "XUC",
    "XYO",
    "XZC",
    "YEE",
    "YOYOW",
    "YUP",
    "ZAP",
    "ZCN",
    "ZCO",
    "ZEC",
    "ZEON",
    "ZIL",
    "ZINC",
    "ZIP",
    "ZIPT",
    "ZLA",
    "ZMN",
    "ZPR",
    "ZRX",
    "ZSC",
    "ZT",
    "ZXC"
})
public class Data {

    @JsonProperty("0XBTC")
    private org.ged.crypto.model._0xbtc _0xbtc;
    @JsonProperty("1ST")
    private org.ged.crypto.model._1st _1st;
    @JsonProperty("1WO")
    private org.ged.crypto.model._1wo _1wo;
    @JsonProperty("AAC")
    private Aac aac;
    @JsonProperty("ABCC")
    private Abcc abcc;
    @JsonProperty("ABT")
    private Abt abt;
    @JsonProperty("ABYSS")
    private Abyss abyss;
    @JsonProperty("ACCN")
    private Accn accn;
    @JsonProperty("ACE")
    private Ace ace;
    @JsonProperty("ADA")
    private Ada ada;
    @JsonProperty("ADB")
    private Adb adb;
    @JsonProperty("ADH")
    private Adh adh;
    @JsonProperty("ADI")
    private Adi adi;
    @JsonProperty("ADL")
    private Adl adl;
    @JsonProperty("ADT")
    private Adt adt;
    @JsonProperty("ADX")
    private Adx adx;
    @JsonProperty("AE")
    private Ae ae;
    @JsonProperty("AEN")
    private Aen aen;
    @JsonProperty("AERGO")
    private Aergo aergo;
    @JsonProperty("AGI")
    private Agi agi;
    @JsonProperty("AGVC")
    private Agvc agvc;
    @JsonProperty("AID")
    private Aid aid;
    @JsonProperty("AIDOC")
    private Aidoc aidoc;
    @JsonProperty("AIT")
    private Ait ait;
    @JsonProperty("AIX")
    private Aix aix;
    @JsonProperty("ALIS")
    private Alis alis;
    @JsonProperty("ALX")
    private Alx alx;
    @JsonProperty("AMB")
    private Amb amb;
    @JsonProperty("AMLT")
    private Amlt amlt;
    @JsonProperty("AMM")
    private Amm amm;
    @JsonProperty("AMN")
    private Amn amn;
    @JsonProperty("AMO")
    private Amo amo;
    @JsonProperty("ANKR")
    private Ankr ankr;
    @JsonProperty("ANT")
    private Ant ant;
    @JsonProperty("AOA")
    private Aoa aoa;
    @JsonProperty("APIS")
    private Apis apis;
    @JsonProperty("APPC")
    private Appc appc;
    @JsonProperty("ARAW")
    private Araw araw;
    @JsonProperty("ARBT")
    private Arbt arbt;
    @JsonProperty("ARCT")
    private Arct arct;
    @JsonProperty("ARN")
    private Arn arn;
    @JsonProperty("ART")
    private Art art;
    @JsonProperty("ARY")
    private Ary ary;
    @JsonProperty("AST")
    private Ast ast;
    @JsonProperty("ASTO")
    private Asto asto;
    @JsonProperty("ATL")
    private Atl atl;
    @JsonProperty("ATM")
    private Atm atm;
    @JsonProperty("ATMI")
    private Atmi atmi;
    @JsonProperty("ATS")
    private Ats ats;
    @JsonProperty("AUC")
    private Auc auc;
    @JsonProperty("AVH")
    private Avh avh;
    @JsonProperty("AVT")
    private Avt avt;
    @JsonProperty("AWC")
    private Awc awc;
    @JsonProperty("AXPR")
    private Axpr axpr;
    @JsonProperty("B2B")
    private B2b b2b;
    @JsonProperty("BAAS")
    private Baas baas;
    @JsonProperty("BANCA")
    private Banca banca;
    @JsonProperty("BAT")
    private Bat bat;
    @JsonProperty("BAX")
    private Bax bax;
    @JsonProperty("BBC")
    private Bbc bbc;
    @JsonProperty("BBO")
    private Bbo bbo;
    @JsonProperty("BCAP")
    private Bcap bcap;
    @JsonProperty("BCDN")
    private Bcdn bcdn;
    @JsonProperty("BCDT")
    private Bcdt bcdt;
    @JsonProperty("BCH")
    private Bch bch;
    @JsonProperty("BCPT")
    private Bcpt bcpt;
    @JsonProperty("BDG")
    private Bdg bdg;
    @JsonProperty("BEAT")
    private Beat beat;
    @JsonProperty("BEE")
    private Bee bee;
    @JsonProperty("BELA")
    private Bela bela;
    @JsonProperty("BERRY")
    private Berry berry;
    @JsonProperty("BETHER")
    private Bether bether;
    @JsonProperty("BETR")
    private Betr betr;
    @JsonProperty("BEZ")
    private Bez bez;
    @JsonProperty("BFT")
    private Bft bft;
    @JsonProperty("BGG")
    private Bgg bgg;
    @JsonProperty("BIO")
    private Bio bio;
    @JsonProperty("BITX")
    private Bitx bitx;
    @JsonProperty("BIX")
    private Bix bix;
    @JsonProperty("BKX")
    private Bkx bkx;
    @JsonProperty("BLNM")
    private Blnm blnm;
    @JsonProperty("BLOC")
    private Bloc bloc;
    @JsonProperty("BLT")
    private Blt blt;
    @JsonProperty("BLZ")
    private Blz blz;
    @JsonProperty("BMC")
    private Bmc bmc;
    @JsonProperty("BMH")
    private Bmh bmh;
    @JsonProperty("BMX")
    private Bmx bmx;
    @JsonProperty("BNK")
    private Bnk bnk;
    @JsonProperty("BNN")
    private Bnn bnn;
    @JsonProperty("BNT")
    private Bnt bnt;
    @JsonProperty("BNTY")
    private Bnty bnty;
    @JsonProperty("BOB")
    private Bob bob;
    @JsonProperty("BOE")
    private Boe boe;
    @JsonProperty("BOLT")
    private Bolt bolt;
    @JsonProperty("BOLTT")
    private Boltt boltt;
    @JsonProperty("BON")
    private Bon bon;
    @JsonProperty("BOT")
    private Bot bot;
    @JsonProperty("BOUTS")
    private Bouts bouts;
    @JsonProperty("BOX")
    private Box box;
    @JsonProperty("BPT")
    private Bpt bpt;
    @JsonProperty("BPX")
    private Bpx bpx;
    @JsonProperty("BQ")
    private Bq bq;
    @JsonProperty("BQTX")
    private Bqtx bqtx;
    @JsonProperty("BRAT")
    private Brat brat;
    @JsonProperty("BRD")
    private Brd brd;
    @JsonProperty("BSTN")
    private Bstn bstn;
    @JsonProperty("BSV")
    private Bsv bsv;
    @JsonProperty("BTC")
    private Btc btc;
    @JsonProperty("BTCL")
    private Btcl btcl;
    @JsonProperty("BTCM")
    private Btcm btcm;
    @JsonProperty("BTCRED")
    private Btcred btcred;
    @JsonProperty("BTM")
    private Btm btm;
    @JsonProperty("BTMX")
    private Btmx btmx;
    @JsonProperty("BTO")
    private Bto bto;
    @JsonProperty("BTRN")
    private Btrn btrn;
    @JsonProperty("BTU")
    private Btu btu;
    @JsonProperty("BUBO")
    private Bubo bubo;
    @JsonProperty("BUD")
    private Bud bud;
    @JsonProperty("BWT")
    private Bwt bwt;
    @JsonProperty("BZ")
    private Bz bz;
    @JsonProperty("BZKY")
    private Bzky bzky;
    @JsonProperty("BZNT")
    private Bznt bznt;
    @JsonProperty("C20")
    private C20 c20;
    @JsonProperty("CAG")
    private Cag cag;
    @JsonProperty("CAN")
    private Can can;
    @JsonProperty("CANDY")
    private Candy candy;
    @JsonProperty("CAPP")
    private Capp capp;
    @JsonProperty("CAR")
    private Car car;
    @JsonProperty("CARAT")
    private Carat carat;
    @JsonProperty("CARD")
    private Card card;
    @JsonProperty("CBC")
    private Cbc cbc;
    @JsonProperty("CBT")
    private Cbt cbt;
    @JsonProperty("CCCX")
    private Cccx cccx;
    @JsonProperty("CCL")
    private Ccl ccl;
    @JsonProperty("CCO")
    private Cco cco;
    @JsonProperty("CCRB")
    private Ccrb ccrb;
    @JsonProperty("CCT")
    private Cct cct;
    @JsonProperty("CDT")
    private Cdt cdt;
    @JsonProperty("CDX")
    private Cdx cdx;
    @JsonProperty("CEDEX")
    private Cedex cedex;
    @JsonProperty("CEEK")
    private Ceek ceek;
    @JsonProperty("CEL")
    private Cel cel;
    @JsonProperty("CELR")
    private Celr celr;
    @JsonProperty("CEN")
    private Cen cen;
    @JsonProperty("CENNZ")
    private Cennz cennz;
    @JsonProperty("CET")
    private Cet cet;
    @JsonProperty("CHAT")
    private Chat chat;
    @JsonProperty("CHP")
    private Chp chp;
    @JsonProperty("CHSB")
    private Chsb chsb;
    @JsonProperty("CHT")
    private Cht cht;
    @JsonProperty("CHX")
    private Chx chx;
    @JsonProperty("CJT")
    private Cjt cjt;
    @JsonProperty("CL")
    private Cl cl;
    @JsonProperty("CLN")
    private Cln cln;
    @JsonProperty("CMCT")
    private Cmct cmct;
    @JsonProperty("CMS")
    private Cms cms;
    @JsonProperty("CMT")
    private Cmt cmt;
    @JsonProperty("CND")
    private Cnd cnd;
    @JsonProperty("CNN")
    private Cnn cnn;
    @JsonProperty("CNX")
    private Cnx cnx;
    @JsonProperty("COB")
    private Cob cob;
    @JsonProperty("COFI")
    private Cofi cofi;
    @JsonProperty("COIN")
    private Coin coin;
    @JsonProperty("CONI")
    private Coni coni;
    @JsonProperty("COSM")
    private Cosm cosm;
    @JsonProperty("COT")
    private Cot cot;
    @JsonProperty("COU")
    private Cou cou;
    @JsonProperty("COV")
    private Cov cov;
    @JsonProperty("COVA")
    private Cova cova;
    @JsonProperty("CPAY")
    private Cpay cpay;
    @JsonProperty("CPCH")
    private Cpch cpch;
    @JsonProperty("CPT")
    private Cpt cpt;
    @JsonProperty("CPY")
    private Cpy cpy;
    @JsonProperty("CRB")
    private Crb crb;
    @JsonProperty("CRDS")
    private Crds crds;
    @JsonProperty("CRED")
    private Cred cred;
    @JsonProperty("CREDO")
    private Credo credo;
    @JsonProperty("CRO")
    private Cro cro;
    @JsonProperty("CRPT")
    private Crpt crpt;
    @JsonProperty("CRYC")
    private Cryc cryc;
    @JsonProperty("CSEN")
    private Csen csen;
    @JsonProperty("CSM")
    private Csm csm;
    @JsonProperty("CSNO")
    private Csno csno;
    @JsonProperty("CSP")
    private Csp csp;
    @JsonProperty("CTXC")
    private Ctxc ctxc;
    @JsonProperty("CUBE")
    private Cube cube;
    @JsonProperty("CV")
    private Cv cv;
    @JsonProperty("CVC")
    private Cvc cvc;
    @JsonProperty("CVT")
    private Cvt cvt;
    @JsonProperty("CXO")
    private Cxo cxo;
    @JsonProperty("DACC")
    private Dacc dacc;
    @JsonProperty("DADI")
    private Dadi dadi;
    @JsonProperty("DAG")
    private Dag dag;
    @JsonProperty("DAGT")
    private Dagt dagt;
    @JsonProperty("DAI")
    private Dai dai;
    @JsonProperty("DAN")
    private Dan dan;
    @JsonProperty("DAOC")
    private Daoc daoc;
    @JsonProperty("DAPS")
    private Daps daps;
    @JsonProperty("DASH")
    private Dash dash;
    @JsonProperty("DAT")
    private Dat dat;
    @JsonProperty("DATA")
    private Data__1 data;
    @JsonProperty("DATX")
    private Datx datx;
    @JsonProperty("DAV")
    private Dav dav;
    @JsonProperty("DAX")
    private Dax dax;
    @JsonProperty("DAY")
    private Day day;
    @JsonProperty("DBET")
    private Dbet dbet;
    @JsonProperty("DCN")
    private Dcn dcn;
    @JsonProperty("DDD")
    private Ddd ddd;
    @JsonProperty("DEB")
    private Deb deb;
    @JsonProperty("DEC")
    private Dec dec;
    @JsonProperty("DENT")
    private Dent dent;
    @JsonProperty("DFXT")
    private Dfxt dfxt;
    @JsonProperty("DGD")
    private Dgd dgd;
    @JsonProperty("DGTX")
    private Dgtx dgtx;
    @JsonProperty("DGX")
    private Dgx dgx;
    @JsonProperty("DICE")
    private Dice dice;
    @JsonProperty("DIG")
    private Dig dig;
    @JsonProperty("DIO")
    private Dio dio;
    @JsonProperty("DLT")
    private Dlt dlt;
    @JsonProperty("DML")
    private Dml dml;
    @JsonProperty("DMT")
    private Dmt dmt;
    @JsonProperty("DNA")
    private Dna dna;
    @JsonProperty("DNT")
    private Dnt dnt;
    @JsonProperty("DOCK")
    private Dock dock;
    @JsonProperty("DOGE")
    private Doge doge;
    @JsonProperty("DOOH")
    private Dooh dooh;
    @JsonProperty("DOV")
    private Dov dov;
    @JsonProperty("DOW")
    private Dow dow;
    @JsonProperty("DPY")
    private Dpy dpy;
    @JsonProperty("DRG")
    private Drg drg;
    @JsonProperty("DRGN")
    private Drgn drgn;
    @JsonProperty("DROP")
    private Drop drop;
    @JsonProperty("DRPU")
    private Drpu drpu;
    @JsonProperty("DRT")
    private Drt drt;
    @JsonProperty("DTH")
    private Dth dth;
    @JsonProperty("DTR")
    private Dtr dtr;
    @JsonProperty("DTRC")
    private Dtrc dtrc;
    @JsonProperty("DTX")
    private Dtx dtx;
    @JsonProperty("DXT")
    private Dxt dxt;
    @JsonProperty("EARTH")
    private Earth earth;
    @JsonProperty("EBC")
    private Ebc ebc;
    @JsonProperty("EBTC")
    private Ebtc ebtc;
    @JsonProperty("ECASH")
    private Ecash ecash;
    @JsonProperty("ECHT")
    private Echt echt;
    @JsonProperty("ECOM")
    private Ecom ecom;
    @JsonProperty("ECTE")
    private Ecte ecte;
    @JsonProperty("EDG")
    private Edg edg;
    @JsonProperty("EDN")
    private Edn edn;
    @JsonProperty("EDO")
    private Edo edo;
    @JsonProperty("EDU")
    private Edu edu;
    @JsonProperty("EGCC")
    private Egcc egcc;
    @JsonProperty("EGT")
    private Egt egt;
    @JsonProperty("EKO")
    private Eko eko;
    @JsonProperty("EKT")
    private Ekt ekt;
    @JsonProperty("ELEC")
    private Elec elec;
    @JsonProperty("ELF")
    private Elf elf;
    @JsonProperty("ELI")
    private Eli eli;
    @JsonProperty("ELITE")
    private Elite elite;
    @JsonProperty("ELIX")
    private Elix elix;
    @JsonProperty("ELTCOIN")
    private Eltcoin eltcoin;
    @JsonProperty("ELY")
    private Ely ely;
    @JsonProperty("EMPH")
    private Emph emph;
    @JsonProperty("ENGT")
    private Engt engt;
    @JsonProperty("ENJ")
    private Enj enj;
    @JsonProperty("ENTER")
    private Enter enter;
    @JsonProperty("EOSDAC")
    private Eosdac eosdac;
    @JsonProperty("EQUAL")
    private Equal equal;
    @JsonProperty("ERC20")
    private Erc20 erc20;
    @JsonProperty("ERIS")
    private Eris eris;
    @JsonProperty("ERO")
    private Ero ero;
    @JsonProperty("ESS")
    private Ess ess;
    @JsonProperty("EST")
    private Est est;
    @JsonProperty("ESZ")
    private Esz esz;
    @JsonProperty("ETBS")
    private Etbs etbs;
    @JsonProperty("ETC")
    private Etc etc;
    @JsonProperty("ETG")
    private Etg etg;
    @JsonProperty("ETGP")
    private Etgp etgp;
    @JsonProperty("ETH")
    private Eth eth;
    @JsonProperty("ETHM")
    private Ethm ethm;
    @JsonProperty("ETHOS")
    private Ethos ethos;
    @JsonProperty("ETK")
    private Etk etk;
    @JsonProperty("ETN")
    private Etn etn;
    @JsonProperty("EURS")
    private Eurs eurs;
    @JsonProperty("EVC")
    private Evc evc;
    @JsonProperty("EVE")
    private Eve eve;
    @JsonProperty("EVED")
    private Eved eved;
    @JsonProperty("EVR")
    private Evr evr;
    @JsonProperty("EVX")
    private Evx evx;
    @JsonProperty("EXC")
    private Exc exc;
    @JsonProperty("EXMR")
    private Exmr exmr;
    @JsonProperty("EXRN")
    private Exrn exrn;
    @JsonProperty("EXY")
    private Exy exy;
    @JsonProperty("FACE")
    private Face face;
    @JsonProperty("FAIRG")
    private Fairg fairg;
    @JsonProperty("FAT")
    private Fat fat;
    @JsonProperty("FDX")
    private Fdx fdx;
    @JsonProperty("FDZ")
    private Fdz fdz;
    @JsonProperty("FET")
    private Fet fet;
    @JsonProperty("FLIK")
    private Flik flik;
    @JsonProperty("FLIXX")
    private Flixx flixx;
    @JsonProperty("FLOT")
    private Flot flot;
    @JsonProperty("FLUZ")
    private Fluz fluz;
    @JsonProperty("FND")
    private Fnd fnd;
    @JsonProperty("FNTB")
    private Fntb fntb;
    @JsonProperty("FOAM")
    private Foam foam;
    @JsonProperty("FOTA")
    private Fota fota;
    @JsonProperty("FOXT")
    private Foxt foxt;
    @JsonProperty("FREC")
    private Frec frec;
    @JsonProperty("FREE")
    private Free free;
    @JsonProperty("FSN")
    private Fsn fsn;
    @JsonProperty("FT")
    private Ft ft;
    @JsonProperty("FTM")
    private Ftm ftm;
    @JsonProperty("FTT")
    private Ftt ftt;
    @JsonProperty("FTX")
    private Ftx ftx;
    @JsonProperty("FUEL")
    private Fuel fuel;
    @JsonProperty("FUN")
    private Fun fun;
    @JsonProperty("FUNDZ")
    private Fundz fundz;
    @JsonProperty("FXT")
    private Fxt fxt;
    @JsonProperty("FYP")
    private Fyp fyp;
    @JsonProperty("GAMB")
    private Gamb gamb;
    @JsonProperty("GARD")
    private Gard gard;
    @JsonProperty("GEM")
    private Gem gem;
    @JsonProperty("GENE")
    private Gene gene;
    @JsonProperty("GENS")
    private Gens gens;
    @JsonProperty("GETX")
    private Getx getx;
    @JsonProperty("GNO")
    private Gno gno;
    @JsonProperty("GNT")
    private Gnt gnt;
    @JsonProperty("GNX")
    private Gnx gnx;
    @JsonProperty("GOOD")
    private Good good;
    @JsonProperty("GRID")
    private Grid grid;
    @JsonProperty("GRMD")
    private Grmd grmd;
    @JsonProperty("GRX")
    private Grx grx;
    @JsonProperty("GSC")
    private Gsc gsc;
    @JsonProperty("GST")
    private Gst gst;
    @JsonProperty("GTC")
    private Gtc gtc;
    @JsonProperty("GTO")
    private Gto gto;
    @JsonProperty("GUESS")
    private Guess guess;
    @JsonProperty("GUP")
    private Gup gup;
    @JsonProperty("GUSD")
    private Gusd gusd;
    @JsonProperty("GVE")
    private Gve gve;
    @JsonProperty("GVT")
    private Gvt gvt;
    @JsonProperty("HAND")
    private Hand hand;
    @JsonProperty("HB")
    private Hb hb;
    @JsonProperty("HBT")
    private Hbt hbt;
    @JsonProperty("HBZ")
    private Hbz hbz;
    @JsonProperty("HEDG")
    private Hedg hedg;
    @JsonProperty("HER")
    private Her her;
    @JsonProperty("HERO")
    private Hero hero;
    @JsonProperty("HGT")
    private Hgt hgt;
    @JsonProperty("HIT")
    private Hit hit;
    @JsonProperty("HKN")
    private Hkn hkn;
    @JsonProperty("HMC")
    private Hmc hmc;
    @JsonProperty("HMQ")
    private Hmq hmq;
    @JsonProperty("HORSE")
    private Horse horse;
    @JsonProperty("HPB")
    private Hpb hpb;
    @JsonProperty("HPT")
    private Hpt hpt;
    @JsonProperty("HQT")
    private Hqt hqt;
    @JsonProperty("HQX")
    private Hqx hqx;
    @JsonProperty("HSC")
    private Hsc hsc;
    @JsonProperty("HST")
    private Hst hst;
    @JsonProperty("HT")
    private Ht ht;
    @JsonProperty("HUR")
    private Hur hur;
    @JsonProperty("HVN")
    private Hvn hvn;
    @JsonProperty("HYDRO")
    private Hydro hydro;
    @JsonProperty("HYT")
    private Hyt hyt;
    @JsonProperty("ICHX")
    private Ichx ichx;
    @JsonProperty("ICN")
    private Icn icn;
    @JsonProperty("ICON")
    private Icon icon;
    @JsonProperty("IDEX")
    private Idex idex;
    @JsonProperty("IDH")
    private Idh idh;
    @JsonProperty("IDT")
    private Idt idt;
    @JsonProperty("IDXM")
    private Idxm idxm;
    @JsonProperty("IETH")
    private Ieth ieth;
    @JsonProperty("IFT")
    private Ift ift;
    @JsonProperty("IG")
    private Ig ig;
    @JsonProperty("IHF")
    private Ihf ihf;
    @JsonProperty("IHT")
    private Iht iht;
    @JsonProperty("IMT")
    private Imt imt;
    @JsonProperty("IND")
    private Ind ind;
    @JsonProperty("ING")
    private Ing ing;
    @JsonProperty("INS")
    private Ins ins;
    @JsonProperty("INSTAR")
    private Instar instar;
    @JsonProperty("INT")
    private Int _int;
    @JsonProperty("INVC")
    private Invc invc;
    @JsonProperty("INX")
    private Inx inx;
    @JsonProperty("INXT")
    private Inxt inxt;
    @JsonProperty("IOST")
    private Iost iost;
    @JsonProperty("IOTX")
    private Iotx iotx;
    @JsonProperty("IPC")
    private Ipc ipc;
    @JsonProperty("IPSX")
    private Ipsx ipsx;
    @JsonProperty("IQN")
    private Iqn iqn;
    @JsonProperty("ISR")
    private Isr isr;
    @JsonProperty("ITC")
    private Itc itc;
    @JsonProperty("ITL")
    private Itl itl;
    @JsonProperty("ITT")
    private Itt itt;
    @JsonProperty("IVY")
    private Ivy ivy;
    @JsonProperty("IXT")
    private Ixt ixt;
    @JsonProperty("J8T")
    private J8t j8t;
    @JsonProperty("JC")
    private Jc jc;
    @JsonProperty("JET")
    private Jet jet;
    @JsonProperty("JNT")
    private Jnt jnt;
    @JsonProperty("JOINT")
    private Joint joint;
    @JsonProperty("JSE")
    private Jse jse;
    @JsonProperty("KAN")
    private Kan kan;
    @JsonProperty("KBC")
    private Kbc kbc;
    @JsonProperty("KCASH")
    private Kcash kcash;
    @JsonProperty("KCS")
    private Kcs kcs;
    @JsonProperty("KEY")
    private Key key;
    @JsonProperty("KICK")
    private Kick kick;
    @JsonProperty("KIN")
    private Kin kin;
    @JsonProperty("KIND")
    private Kind kind;
    @JsonProperty("KNC")
    private Knc knc;
    @JsonProperty("KRL")
    private Krl krl;
    @JsonProperty("KUE")
    private Kue kue;
    @JsonProperty("KWH")
    private Kwh kwh;
    @JsonProperty("LA")
    private La la;
    @JsonProperty("LALA")
    private Lala lala;
    @JsonProperty("LAMB")
    private Lamb lamb;
    @JsonProperty("LATX")
    private Latx latx;
    @JsonProperty("LCS")
    private Lcs lcs;
    @JsonProperty("LDC")
    private Ldc ldc;
    @JsonProperty("LEDU")
    private Ledu ledu;
    @JsonProperty("LEND")
    private Lend lend;
    @JsonProperty("LEV")
    private Lev lev;
    @JsonProperty("LGO")
    private Lgo lgo;
    @JsonProperty("LIF")
    private Lif lif;
    @JsonProperty("LIFE")
    private Life life;
    @JsonProperty("LIKE")
    private Like like;
    @JsonProperty("LINA")
    private Lina lina;
    @JsonProperty("LINK")
    private Link link;
    @JsonProperty("LION")
    private Lion lion;
    @JsonProperty("LNC")
    private Lnc lnc;
    @JsonProperty("LND")
    private Lnd lnd;
    @JsonProperty("LOCI")
    private Loci loci;
    @JsonProperty("LOCK")
    private Lock lock;
    @JsonProperty("LOOM")
    private Loom loom;
    @JsonProperty("LPT")
    private Lpt lpt;
    @JsonProperty("LQDN")
    private Lqdn lqdn;
    @JsonProperty("LRC")
    private Lrc lrc;
    @JsonProperty("LST")
    private Lst lst;
    @JsonProperty("LTC")
    private Ltc ltc;
    @JsonProperty("LTO")
    private Lto lto;
    @JsonProperty("LUC")
    private Luc luc;
    @JsonProperty("LUN")
    private Lun lun;
    @JsonProperty("LYM")
    private Lym lym;
    @JsonProperty("M2O")
    private M2o m2o;
    @JsonProperty("MANA")
    private Mana mana;
    @JsonProperty("MATIC")
    private Matic matic;
    @JsonProperty("MBTX")
    private Mbtx mbtx;
    @JsonProperty("MCO")
    private Mco mco;
    @JsonProperty("MDA")
    private Mda mda;
    @JsonProperty("MDCL")
    private Mdcl mdcl;
    @JsonProperty("MDS")
    private Mds mds;
    @JsonProperty("MEDX")
    private Medx medx;
    @JsonProperty("MEE")
    private Mee mee;
    @JsonProperty("MENLO")
    private Menlo menlo;
    @JsonProperty("META")
    private Meta meta;
    @JsonProperty("METAL")
    private Metal metal;
    @JsonProperty("METM")
    private Metm metm;
    @JsonProperty("MFG")
    private Mfg mfg;
    @JsonProperty("MFT")
    private Mft mft;
    @JsonProperty("MGO")
    private Mgo mgo;
    @JsonProperty("MIC")
    private Mic mic;
    @JsonProperty("MITH")
    private Mith mith;
    @JsonProperty("MITX")
    private Mitx mitx;
    @JsonProperty("MIXI")
    private Mixi mixi;
    @JsonProperty("MKR")
    private Mkr mkr;
    @JsonProperty("MLN")
    private Mln mln;
    @JsonProperty("MNC")
    private Mnc mnc;
    @JsonProperty("MNE")
    private Mne mne;
    @JsonProperty("MNTP")
    private Mntp mntp;
    @JsonProperty("MOAC")
    private Moac moac;
    @JsonProperty("MOF")
    private Mof mof;
    @JsonProperty("MOLK")
    private Molk molk;
    @JsonProperty("MOT")
    private Mot mot;
    @JsonProperty("MRK")
    private Mrk mrk;
    @JsonProperty("MRPH")
    private Mrph mrph;
    @JsonProperty("MTC")
    private Mtc mtc;
    @JsonProperty("MTH")
    private Mth mth;
    @JsonProperty("MTKN")
    private Mtkn mtkn;
    @JsonProperty("MTRC")
    private Mtrc mtrc;
    @JsonProperty("MTX")
    private Mtx mtx;
    @JsonProperty("MVL")
    private Mvl mvl;
    @JsonProperty("MWAT")
    private Mwat mwat;
    @JsonProperty("MXAI")
    private Mxai mxai;
    @JsonProperty("MXM")
    private Mxm mxm;
    @JsonProperty("MYB")
    private Myb myb;
    @JsonProperty("MYST")
    private Myst myst;
    @JsonProperty("NANJ")
    private Nanj nanj;
    @JsonProperty("NAS")
    private Nas nas;
    @JsonProperty("NAVI")
    private Navi navi;
    @JsonProperty("NBAI")
    private Nbai nbai;
    @JsonProperty("NBC")
    private Nbc nbc;
    @JsonProperty("NCASH")
    private Ncash ncash;
    @JsonProperty("NCC")
    private Ncc ncc;
    @JsonProperty("NCT")
    private Nct nct;
    @JsonProperty("NEC")
    private Nec nec;
    @JsonProperty("NEU")
    private Neu neu;
    @JsonProperty("NEXO")
    private Nexo nexo;
    @JsonProperty("NEXT")
    private Next next;
    @JsonProperty("NGC")
    private Ngc ngc;
    @JsonProperty("NIO")
    private Nio nio;
    @JsonProperty("NMR")
    private Nmr nmr;
    @JsonProperty("NOAH")
    private Noah noah;
    @JsonProperty("NOBS")
    private Nobs nobs;
    @JsonProperty("NOKU")
    private Noku noku;
    @JsonProperty("NOX")
    private Nox nox;
    @JsonProperty("NPER")
    private Nper nper;
    @JsonProperty("NPX")
    private Npx npx;
    @JsonProperty("NPXS")
    private Npxs npxs;
    @JsonProperty("NRG")
    private Nrg nrg;
    @JsonProperty("NRP")
    private Nrp nrp;
    @JsonProperty("NTK")
    private Ntk ntk;
    @JsonProperty("NULS")
    private Nuls nuls;
    @JsonProperty("NXC")
    private Nxc nxc;
    @JsonProperty("OAX")
    private Oax oax;
    @JsonProperty("OCN")
    private Ocn ocn;
    @JsonProperty("ODE")
    private Ode ode;
    @JsonProperty("OIO")
    private Oio oio;
    @JsonProperty("OKB")
    private Okb okb;
    @JsonProperty("OLE")
    private Ole ole;
    @JsonProperty("OLT")
    private Olt olt;
    @JsonProperty("OMG")
    private Omg omg;
    @JsonProperty("OMX")
    private Omx omx;
    @JsonProperty("ONG")
    private Ong ong;
    @JsonProperty("ONL")
    private Onl onl;
    @JsonProperty("OPEN")
    private Open open;
    @JsonProperty("OPT")
    private Opt opt;
    @JsonProperty("ORBS")
    private Orbs orbs;
    @JsonProperty("ORI")
    private Ori ori;
    @JsonProperty("ORME")
    private Orme orme;
    @JsonProperty("ORS")
    private Ors ors;
    @JsonProperty("OSA")
    private Osa osa;
    @JsonProperty("OST")
    private Ost ost;
    @JsonProperty("PAL")
    private Pal pal;
    @JsonProperty("PARETO")
    private Pareto pareto;
    @JsonProperty("PASS")
    private Pass pass;
    @JsonProperty("PAT")
    private Pat pat;
    @JsonProperty("PAX")
    private Pax pax;
    @JsonProperty("PAY")
    private Pay pay;
    @JsonProperty("PCH")
    private Pch pch;
    @JsonProperty("PCL")
    private Pcl pcl;
    @JsonProperty("PCO")
    private Pco pco;
    @JsonProperty("PFR")
    private Pfr pfr;
    @JsonProperty("PHI")
    private Phi phi;
    @JsonProperty("PIX")
    private Pix pix;
    @JsonProperty("PKT")
    private Pkt pkt;
    @JsonProperty("PLA")
    private Pla pla;
    @JsonProperty("PLAY")
    private Play play;
    @JsonProperty("PLBT")
    private Plbt plbt;
    @JsonProperty("PLR")
    private Plr plr;
    @JsonProperty("PLU")
    private Plu plu;
    @JsonProperty("PMA")
    private Pma pma;
    @JsonProperty("PMNT")
    private Pmnt pmnt;
    @JsonProperty("PNT")
    private Pnt pnt;
    @JsonProperty("POE")
    private Poe poe;
    @JsonProperty("POLL")
    private Poll poll;
    @JsonProperty("POLY")
    private Poly poly;
    @JsonProperty("POWR")
    private Powr powr;
    @JsonProperty("PPP")
    private Ppp ppp;
    @JsonProperty("PPT")
    private Ppt ppt;
    @JsonProperty("PRA")
    private Pra pra;
    @JsonProperty("PRG")
    private Prg prg;
    @JsonProperty("PRIX")
    private Prix prix;
    @JsonProperty("PRO")
    private Pro pro;
    @JsonProperty("PSM")
    private Psm psm;
    @JsonProperty("PST")
    private Pst pst;
    @JsonProperty("PTOY")
    private Ptoy ptoy;
    @JsonProperty("PXG")
    private Pxg pxg;
    @JsonProperty("PYLNT")
    private Pylnt pylnt;
    @JsonProperty("PYN")
    private Pyn pyn;
    @JsonProperty("QASH")
    private Qash qash;
    @JsonProperty("QBIT")
    private Qbit qbit;
    @JsonProperty("QCX")
    private Qcx qcx;
    @JsonProperty("QKC")
    private Qkc qkc;
    @JsonProperty("QNTU")
    private Qntu qntu;
    @JsonProperty("QSP")
    private Qsp qsp;
    @JsonProperty("QUANT")
    private Quant quant;
    @JsonProperty("QUN")
    private Qun qun;
    @JsonProperty("QUSD")
    private Qusd qusd;
    @JsonProperty("R")
    private R r;
    @JsonProperty("RCN")
    private Rcn rcn;
    @JsonProperty("RCT")
    private Rct rct;
    @JsonProperty("RDC")
    private Rdc rdc;
    @JsonProperty("RDD")
    private Rdd rdd;
    @JsonProperty("REAL")
    private Real real;
    @JsonProperty("REBL")
    private Rebl rebl;
    @JsonProperty("REF")
    private Ref ref;
    @JsonProperty("REM")
    private Rem rem;
    @JsonProperty("REP")
    private Rep rep;
    @JsonProperty("REQ")
    private Req req;
    @JsonProperty("REX")
    private Rex rex;
    @JsonProperty("RFR")
    private Rfr rfr;
    @JsonProperty("RHOC")
    private Rhoc rhoc;
    @JsonProperty("RIYA")
    private Riya riya;
    @JsonProperty("RLC")
    private Rlc rlc;
    @JsonProperty("RLX")
    private Rlx rlx;
    @JsonProperty("RMESH")
    private Rmesh rmesh;
    @JsonProperty("RNT")
    private Rnt rnt;
    @JsonProperty("RNTB")
    private Rntb rntb;
    @JsonProperty("ROBET")
    private Robet robet;
    @JsonProperty("ROCK")
    private Rock rock;
    @JsonProperty("ROX")
    private Rox rox;
    @JsonProperty("RRC")
    private Rrc rrc;
    @JsonProperty("RTE")
    private Rte rte;
    @JsonProperty("RUFF")
    private Ruff ruff;
    @JsonProperty("RVT")
    private Rvt rvt;
    @JsonProperty("SAL")
    private Sal sal;
    @JsonProperty("SALT")
    private Salt salt;
    @JsonProperty("SAN")
    private San san;
    @JsonProperty("SCC")
    private Scc scc;
    @JsonProperty("SCL")
    private Scl scl;
    @JsonProperty("SCRL")
    private Scrl scrl;
    @JsonProperty("SEAL")
    private Seal seal;
    @JsonProperty("SEELE")
    private Seele seele;
    @JsonProperty("SENC")
    private Senc senc;
    @JsonProperty("SENT")
    private Sent sent;
    @JsonProperty("SETH")
    private Seth seth;
    @JsonProperty("SGN")
    private Sgn sgn;
    @JsonProperty("SGR")
    private Sgr sgr;
    @JsonProperty("SHE")
    private She she;
    @JsonProperty("SHIP")
    private Ship ship;
    @JsonProperty("SHOW")
    private Show show;
    @JsonProperty("SHP")
    private Shp shp;
    @JsonProperty("SHPING")
    private Shping shping;
    @JsonProperty("SKIN")
    private Skin skin;
    @JsonProperty("SKM")
    private Skm skm;
    @JsonProperty("SKRB")
    private Skrb skrb;
    @JsonProperty("SLT")
    private Slt slt;
    @JsonProperty("SMT")
    private Smt smt;
    @JsonProperty("SNC")
    private Snc snc;
    @JsonProperty("SNGLS")
    private Sngls sngls;
    @JsonProperty("SNIP")
    private Snip snip;
    @JsonProperty("SNM")
    private Snm snm;
    @JsonProperty("SNOV")
    private Snov snov;
    @JsonProperty("SNPC")
    private Snpc snpc;
    @JsonProperty("SNS")
    private Sns sns;
    @JsonProperty("SNT")
    private Snt snt;
    @JsonProperty("SNTR")
    private Sntr sntr;
    @JsonProperty("SNTVT")
    private Sntvt sntvt;
    @JsonProperty("SNX")
    private Snx snx;
    @JsonProperty("SOAR")
    private Soar soar;
    @JsonProperty("SOC")
    private Soc soc;
    @JsonProperty("SOLVE")
    private Solve solve;
    @JsonProperty("SOMA")
    private Soma soma;
    @JsonProperty("SPANK")
    private Spank spank;
    @JsonProperty("SPF")
    private Spf spf;
    @JsonProperty("SPHTX")
    private Sphtx sphtx;
    @JsonProperty("SPT")
    private Spt spt;
    @JsonProperty("SPX")
    private Spx spx;
    @JsonProperty("SRCH")
    private Srch srch;
    @JsonProperty("SRCOIN")
    private Srcoin srcoin;
    @JsonProperty("SRN")
    private Srn srn;
    @JsonProperty("SS")
    private Ss ss;
    @JsonProperty("STAC")
    private Stac stac;
    @JsonProperty("STACS")
    private Stacs stacs;
    @JsonProperty("STAR")
    private Star star;
    @JsonProperty("STASH")
    private Stash stash;
    @JsonProperty("STC")
    private Stc stc;
    @JsonProperty("STK")
    private Stk stk;
    @JsonProperty("STORJ")
    private Storj storj;
    @JsonProperty("STORM")
    private Storm storm;
    @JsonProperty("STQ")
    private Stq stq;
    @JsonProperty("STU")
    private Stu stu;
    @JsonProperty("STX")
    private Stx stx;
    @JsonProperty("SUB")
    private Sub sub;
    @JsonProperty("SUR")
    private Sur sur;
    @JsonProperty("SUSD")
    private Susd susd;
    @JsonProperty("SVD")
    private Svd svd;
    @JsonProperty("SWARM")
    private Swarm swarm;
    @JsonProperty("SWC")
    private Swc swc;
    @JsonProperty("SWFTC")
    private Swftc swftc;
    @JsonProperty("SWT")
    private Swt swt;
    @JsonProperty("SXDT")
    private Sxdt sxdt;
    @JsonProperty("SXUT")
    private Sxut sxut;
    @JsonProperty("TAAS")
    private Taas taas;
    @JsonProperty("TBX")
    private Tbx tbx;
    @JsonProperty("TCH")
    private Tch tch;
    @JsonProperty("TCT")
    private Tct tct;
    @JsonProperty("TDP")
    private Tdp tdp;
    @JsonProperty("TDS")
    private Tds tds;
    @JsonProperty("TEL")
    private Tel tel;
    @JsonProperty("TEN")
    private Ten ten;
    @JsonProperty("TFD")
    private Tfd tfd;
    @JsonProperty("TFL")
    private Tfl tfl;
    @JsonProperty("TFUEL")
    private Tfuel tfuel;
    @JsonProperty("TGAME")
    private Tgame tgame;
    @JsonProperty("TGT")
    private Tgt tgt;
    @JsonProperty("THETA")
    private Theta theta;
    @JsonProperty("THR")
    private Thr thr;
    @JsonProperty("THRT")
    private Thrt thrt;
    @JsonProperty("TIE")
    private Tie tie;
    @JsonProperty("TIG")
    private Tig tig;
    @JsonProperty("TIOX")
    private Tiox tiox;
    @JsonProperty("TIX")
    private Tix tix;
    @JsonProperty("TKN")
    private Tkn tkn;
    @JsonProperty("TMT")
    private Tmt tmt;
    @JsonProperty("TMTG")
    private Tmtg tmtg;
    @JsonProperty("TNB")
    private Tnb tnb;
    @JsonProperty("TNT")
    private Tnt tnt;
    @JsonProperty("TOMO")
    private Tomo tomo;
    @JsonProperty("TOPC")
    private Topc topc;
    @JsonProperty("TRAC")
    private Trac trac;
    @JsonProperty("TRAK")
    private Trak trak;
    @JsonProperty("TRCT")
    private Trct trct;
    @JsonProperty("TRDT")
    private Trdt trdt;
    @JsonProperty("TRIO")
    private Trio trio;
    @JsonProperty("TRST")
    private Trst trst;
    @JsonProperty("TRUE")
    private True _true;
    @JsonProperty("TSL")
    private Tsl tsl;
    @JsonProperty("TTC")
    private Ttc ttc;
    @JsonProperty("TTV")
    private Ttv ttv;
    @JsonProperty("TUSD")
    private Tusd tusd;
    @JsonProperty("UBC")
    private Ubc ubc;
    @JsonProperty("UBEX")
    private Ubex ubex;
    @JsonProperty("UBT")
    private Ubt ubt;
    @JsonProperty("UCT")
    private Uct uct;
    @JsonProperty("UDOO")
    private Udoo udoo;
    @JsonProperty("UFR")
    private Ufr ufr;
    @JsonProperty("UGAS")
    private Ugas ugas;
    @JsonProperty("UGC")
    private Ugc ugc;
    @JsonProperty("UKG")
    private Ukg ukg;
    @JsonProperty("UP")
    private Up up;
    @JsonProperty("UPP")
    private Upp upp;
    @JsonProperty("UQC")
    private Uqc uqc;
    @JsonProperty("USDC")
    private Usdc usdc;
    @JsonProperty("USDS")
    private Usds usds;
    @JsonProperty("USDT")
    private Usdt usdt;
    @JsonProperty("USE")
    private Use use;
    @JsonProperty("UTK")
    private Utk utk;
    @JsonProperty("UTNP")
    private Utnp utnp;
    @JsonProperty("UTT")
    private Utt utt;
    @JsonProperty("UUU")
    private Uuu uuu;
    @JsonProperty("VEE")
    private Vee vee;
    @JsonProperty("VERI")
    private Veri veri;
    @JsonProperty("VEST")
    private Vest vest;
    @JsonProperty("VET")
    private Vet vet;
    @JsonProperty("VIBE")
    private Vibe vibe;
    @JsonProperty("VIDT")
    private Vidt vidt;
    @JsonProperty("VIN")
    private Vin vin;
    @JsonProperty("VIT")
    private Vit vit;
    @JsonProperty("VITE")
    private Vite vite;
    @JsonProperty("VIU")
    private Viu viu;
    @JsonProperty("VME")
    private Vme vme;
    @JsonProperty("VNX")
    private Vnx vnx;
    @JsonProperty("VOISE")
    private Voise voise;
    @JsonProperty("VRA")
    private Vra vra;
    @JsonProperty("VRS")
    private Vrs vrs;
    @JsonProperty("VSL")
    private Vsl vsl;
    @JsonProperty("VZT")
    private Vzt vzt;
    @JsonProperty("WAB")
    private Wab wab;
    @JsonProperty("WABI")
    private Wabi wabi;
    @JsonProperty("WAN")
    private Wan wan;
    @JsonProperty("WAND")
    private Wand wand;
    @JsonProperty("WAX")
    private Wax wax;
    @JsonProperty("WBTC")
    private Wbtc wbtc;
    @JsonProperty("WCOIN")
    private Wcoin wcoin;
    @JsonProperty("WEB")
    private Web web;
    @JsonProperty("WELL")
    private Well well;
    @JsonProperty("WETH")
    private Weth weth;
    @JsonProperty("WHEN")
    private When when;
    @JsonProperty("WINGS")
    private Wings wings;
    @JsonProperty("WISH")
    private Wish wish;
    @JsonProperty("WIZ")
    private Wiz wiz;
    @JsonProperty("WPP")
    private Wpp wpp;
    @JsonProperty("WPR")
    private Wpr wpr;
    @JsonProperty("WRC")
    private Wrc wrc;
    @JsonProperty("WT")
    private Wt wt;
    @JsonProperty("WTC")
    private Wtc wtc;
    @JsonProperty("WTL")
    private Wtl wtl;
    @JsonProperty("WYS")
    private Wys wys;
    @JsonProperty("X8X")
    private X8x x8x;
    @JsonProperty("XAUR")
    private Xaur xaur;
    @JsonProperty("XBASE")
    private Xbase xbase;
    @JsonProperty("XBB")
    private Xbb xbb;
    @JsonProperty("XBL")
    private Xbl xbl;
    @JsonProperty("XBX")
    private Xbx xbx;
    @JsonProperty("XCD")
    private Xcd xcd;
    @JsonProperty("XCLR")
    private Xclr xclr;
    @JsonProperty("XDCE")
    private Xdce xdce;
    @JsonProperty("XES")
    private Xes xes;
    @JsonProperty("XET")
    private Xet xet;
    @JsonProperty("XMX")
    private Xmx xmx;
    @JsonProperty("XNG")
    private Xng xng;
    @JsonProperty("XNK")
    private Xnk xnk;
    @JsonProperty("XOV")
    private Xov xov;
    @JsonProperty("XPAT")
    private Xpat xpat;
    @JsonProperty("XUC")
    private Xuc xuc;
    @JsonProperty("XYO")
    private Xyo xyo;
    @JsonProperty("XZC")
    private Xzc xzc;
    @JsonProperty("YEE")
    private Yee yee;
    @JsonProperty("YOYOW")
    private Yoyow yoyow;
    @JsonProperty("YUP")
    private Yup yup;
    @JsonProperty("ZAP")
    private Zap zap;
    @JsonProperty("ZCN")
    private Zcn zcn;
    @JsonProperty("ZCO")
    private Zco zco;
    @JsonProperty("ZEC")
    private Zec zec;
    @JsonProperty("ZEON")
    private Zeon zeon;
    @JsonProperty("ZIL")
    private Zil zil;
    @JsonProperty("ZINC")
    private Zinc zinc;
    @JsonProperty("ZIP")
    private Zip zip;
    @JsonProperty("ZIPT")
    private Zipt zipt;
    @JsonProperty("ZLA")
    private Zla zla;
    @JsonProperty("ZMN")
    private Zmn zmn;
    @JsonProperty("ZPR")
    private Zpr zpr;
    @JsonProperty("ZRX")
    private Zrx zrx;
    @JsonProperty("ZSC")
    private Zsc zsc;
    @JsonProperty("ZT")
    private Zt zt;
    @JsonProperty("ZXC")
    private Zxc zxc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0XBTC")
    public org.ged.crypto.model._0xbtc get0xbtc() {
        return _0xbtc;
    }

    @JsonProperty("0XBTC")
    public void set0xbtc(org.ged.crypto.model._0xbtc _0xbtc) {
        this._0xbtc = _0xbtc;
    }

    @JsonProperty("1ST")
    public org.ged.crypto.model._1st get1st() {
        return _1st;
    }

    @JsonProperty("1ST")
    public void set1st(org.ged.crypto.model._1st _1st) {
        this._1st = _1st;
    }

    @JsonProperty("1WO")
    public org.ged.crypto.model._1wo get1wo() {
        return _1wo;
    }

    @JsonProperty("1WO")
    public void set1wo(org.ged.crypto.model._1wo _1wo) {
        this._1wo = _1wo;
    }

    @JsonProperty("AAC")
    public Aac getAac() {
        return aac;
    }

    @JsonProperty("AAC")
    public void setAac(Aac aac) {
        this.aac = aac;
    }

    @JsonProperty("ABCC")
    public Abcc getAbcc() {
        return abcc;
    }

    @JsonProperty("ABCC")
    public void setAbcc(Abcc abcc) {
        this.abcc = abcc;
    }

    @JsonProperty("ABT")
    public Abt getAbt() {
        return abt;
    }

    @JsonProperty("ABT")
    public void setAbt(Abt abt) {
        this.abt = abt;
    }

    @JsonProperty("ABYSS")
    public Abyss getAbyss() {
        return abyss;
    }

    @JsonProperty("ABYSS")
    public void setAbyss(Abyss abyss) {
        this.abyss = abyss;
    }

    @JsonProperty("ACCN")
    public Accn getAccn() {
        return accn;
    }

    @JsonProperty("ACCN")
    public void setAccn(Accn accn) {
        this.accn = accn;
    }

    @JsonProperty("ACE")
    public Ace getAce() {
        return ace;
    }

    @JsonProperty("ACE")
    public void setAce(Ace ace) {
        this.ace = ace;
    }

    @JsonProperty("ADA")
    public Ada getAda() {
        return ada;
    }

    @JsonProperty("ADA")
    public void setAda(Ada ada) {
        this.ada = ada;
    }

    @JsonProperty("ADB")
    public Adb getAdb() {
        return adb;
    }

    @JsonProperty("ADB")
    public void setAdb(Adb adb) {
        this.adb = adb;
    }

    @JsonProperty("ADH")
    public Adh getAdh() {
        return adh;
    }

    @JsonProperty("ADH")
    public void setAdh(Adh adh) {
        this.adh = adh;
    }

    @JsonProperty("ADI")
    public Adi getAdi() {
        return adi;
    }

    @JsonProperty("ADI")
    public void setAdi(Adi adi) {
        this.adi = adi;
    }

    @JsonProperty("ADL")
    public Adl getAdl() {
        return adl;
    }

    @JsonProperty("ADL")
    public void setAdl(Adl adl) {
        this.adl = adl;
    }

    @JsonProperty("ADT")
    public Adt getAdt() {
        return adt;
    }

    @JsonProperty("ADT")
    public void setAdt(Adt adt) {
        this.adt = adt;
    }

    @JsonProperty("ADX")
    public Adx getAdx() {
        return adx;
    }

    @JsonProperty("ADX")
    public void setAdx(Adx adx) {
        this.adx = adx;
    }

    @JsonProperty("AE")
    public Ae getAe() {
        return ae;
    }

    @JsonProperty("AE")
    public void setAe(Ae ae) {
        this.ae = ae;
    }

    @JsonProperty("AEN")
    public Aen getAen() {
        return aen;
    }

    @JsonProperty("AEN")
    public void setAen(Aen aen) {
        this.aen = aen;
    }

    @JsonProperty("AERGO")
    public Aergo getAergo() {
        return aergo;
    }

    @JsonProperty("AERGO")
    public void setAergo(Aergo aergo) {
        this.aergo = aergo;
    }

    @JsonProperty("AGI")
    public Agi getAgi() {
        return agi;
    }

    @JsonProperty("AGI")
    public void setAgi(Agi agi) {
        this.agi = agi;
    }

    @JsonProperty("AGVC")
    public Agvc getAgvc() {
        return agvc;
    }

    @JsonProperty("AGVC")
    public void setAgvc(Agvc agvc) {
        this.agvc = agvc;
    }

    @JsonProperty("AID")
    public Aid getAid() {
        return aid;
    }

    @JsonProperty("AID")
    public void setAid(Aid aid) {
        this.aid = aid;
    }

    @JsonProperty("AIDOC")
    public Aidoc getAidoc() {
        return aidoc;
    }

    @JsonProperty("AIDOC")
    public void setAidoc(Aidoc aidoc) {
        this.aidoc = aidoc;
    }

    @JsonProperty("AIT")
    public Ait getAit() {
        return ait;
    }

    @JsonProperty("AIT")
    public void setAit(Ait ait) {
        this.ait = ait;
    }

    @JsonProperty("AIX")
    public Aix getAix() {
        return aix;
    }

    @JsonProperty("AIX")
    public void setAix(Aix aix) {
        this.aix = aix;
    }

    @JsonProperty("ALIS")
    public Alis getAlis() {
        return alis;
    }

    @JsonProperty("ALIS")
    public void setAlis(Alis alis) {
        this.alis = alis;
    }

    @JsonProperty("ALX")
    public Alx getAlx() {
        return alx;
    }

    @JsonProperty("ALX")
    public void setAlx(Alx alx) {
        this.alx = alx;
    }

    @JsonProperty("AMB")
    public Amb getAmb() {
        return amb;
    }

    @JsonProperty("AMB")
    public void setAmb(Amb amb) {
        this.amb = amb;
    }

    @JsonProperty("AMLT")
    public Amlt getAmlt() {
        return amlt;
    }

    @JsonProperty("AMLT")
    public void setAmlt(Amlt amlt) {
        this.amlt = amlt;
    }

    @JsonProperty("AMM")
    public Amm getAmm() {
        return amm;
    }

    @JsonProperty("AMM")
    public void setAmm(Amm amm) {
        this.amm = amm;
    }

    @JsonProperty("AMN")
    public Amn getAmn() {
        return amn;
    }

    @JsonProperty("AMN")
    public void setAmn(Amn amn) {
        this.amn = amn;
    }

    @JsonProperty("AMO")
    public Amo getAmo() {
        return amo;
    }

    @JsonProperty("AMO")
    public void setAmo(Amo amo) {
        this.amo = amo;
    }

    @JsonProperty("ANKR")
    public Ankr getAnkr() {
        return ankr;
    }

    @JsonProperty("ANKR")
    public void setAnkr(Ankr ankr) {
        this.ankr = ankr;
    }

    @JsonProperty("ANT")
    public Ant getAnt() {
        return ant;
    }

    @JsonProperty("ANT")
    public void setAnt(Ant ant) {
        this.ant = ant;
    }

    @JsonProperty("AOA")
    public Aoa getAoa() {
        return aoa;
    }

    @JsonProperty("AOA")
    public void setAoa(Aoa aoa) {
        this.aoa = aoa;
    }

    @JsonProperty("APIS")
    public Apis getApis() {
        return apis;
    }

    @JsonProperty("APIS")
    public void setApis(Apis apis) {
        this.apis = apis;
    }

    @JsonProperty("APPC")
    public Appc getAppc() {
        return appc;
    }

    @JsonProperty("APPC")
    public void setAppc(Appc appc) {
        this.appc = appc;
    }

    @JsonProperty("ARAW")
    public Araw getAraw() {
        return araw;
    }

    @JsonProperty("ARAW")
    public void setAraw(Araw araw) {
        this.araw = araw;
    }

    @JsonProperty("ARBT")
    public Arbt getArbt() {
        return arbt;
    }

    @JsonProperty("ARBT")
    public void setArbt(Arbt arbt) {
        this.arbt = arbt;
    }

    @JsonProperty("ARCT")
    public Arct getArct() {
        return arct;
    }

    @JsonProperty("ARCT")
    public void setArct(Arct arct) {
        this.arct = arct;
    }

    @JsonProperty("ARN")
    public Arn getArn() {
        return arn;
    }

    @JsonProperty("ARN")
    public void setArn(Arn arn) {
        this.arn = arn;
    }

    @JsonProperty("ART")
    public Art getArt() {
        return art;
    }

    @JsonProperty("ART")
    public void setArt(Art art) {
        this.art = art;
    }

    @JsonProperty("ARY")
    public Ary getAry() {
        return ary;
    }

    @JsonProperty("ARY")
    public void setAry(Ary ary) {
        this.ary = ary;
    }

    @JsonProperty("AST")
    public Ast getAst() {
        return ast;
    }

    @JsonProperty("AST")
    public void setAst(Ast ast) {
        this.ast = ast;
    }

    @JsonProperty("ASTO")
    public Asto getAsto() {
        return asto;
    }

    @JsonProperty("ASTO")
    public void setAsto(Asto asto) {
        this.asto = asto;
    }

    @JsonProperty("ATL")
    public Atl getAtl() {
        return atl;
    }

    @JsonProperty("ATL")
    public void setAtl(Atl atl) {
        this.atl = atl;
    }

    @JsonProperty("ATM")
    public Atm getAtm() {
        return atm;
    }

    @JsonProperty("ATM")
    public void setAtm(Atm atm) {
        this.atm = atm;
    }

    @JsonProperty("ATMI")
    public Atmi getAtmi() {
        return atmi;
    }

    @JsonProperty("ATMI")
    public void setAtmi(Atmi atmi) {
        this.atmi = atmi;
    }

    @JsonProperty("ATS")
    public Ats getAts() {
        return ats;
    }

    @JsonProperty("ATS")
    public void setAts(Ats ats) {
        this.ats = ats;
    }

    @JsonProperty("AUC")
    public Auc getAuc() {
        return auc;
    }

    @JsonProperty("AUC")
    public void setAuc(Auc auc) {
        this.auc = auc;
    }

    @JsonProperty("AVH")
    public Avh getAvh() {
        return avh;
    }

    @JsonProperty("AVH")
    public void setAvh(Avh avh) {
        this.avh = avh;
    }

    @JsonProperty("AVT")
    public Avt getAvt() {
        return avt;
    }

    @JsonProperty("AVT")
    public void setAvt(Avt avt) {
        this.avt = avt;
    }

    @JsonProperty("AWC")
    public Awc getAwc() {
        return awc;
    }

    @JsonProperty("AWC")
    public void setAwc(Awc awc) {
        this.awc = awc;
    }

    @JsonProperty("AXPR")
    public Axpr getAxpr() {
        return axpr;
    }

    @JsonProperty("AXPR")
    public void setAxpr(Axpr axpr) {
        this.axpr = axpr;
    }

    @JsonProperty("B2B")
    public B2b getB2b() {
        return b2b;
    }

    @JsonProperty("B2B")
    public void setB2b(B2b b2b) {
        this.b2b = b2b;
    }

    @JsonProperty("BAAS")
    public Baas getBaas() {
        return baas;
    }

    @JsonProperty("BAAS")
    public void setBaas(Baas baas) {
        this.baas = baas;
    }

    @JsonProperty("BANCA")
    public Banca getBanca() {
        return banca;
    }

    @JsonProperty("BANCA")
    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    @JsonProperty("BAT")
    public Bat getBat() {
        return bat;
    }

    @JsonProperty("BAT")
    public void setBat(Bat bat) {
        this.bat = bat;
    }

    @JsonProperty("BAX")
    public Bax getBax() {
        return bax;
    }

    @JsonProperty("BAX")
    public void setBax(Bax bax) {
        this.bax = bax;
    }

    @JsonProperty("BBC")
    public Bbc getBbc() {
        return bbc;
    }

    @JsonProperty("BBC")
    public void setBbc(Bbc bbc) {
        this.bbc = bbc;
    }

    @JsonProperty("BBO")
    public Bbo getBbo() {
        return bbo;
    }

    @JsonProperty("BBO")
    public void setBbo(Bbo bbo) {
        this.bbo = bbo;
    }

    @JsonProperty("BCAP")
    public Bcap getBcap() {
        return bcap;
    }

    @JsonProperty("BCAP")
    public void setBcap(Bcap bcap) {
        this.bcap = bcap;
    }

    @JsonProperty("BCDN")
    public Bcdn getBcdn() {
        return bcdn;
    }

    @JsonProperty("BCDN")
    public void setBcdn(Bcdn bcdn) {
        this.bcdn = bcdn;
    }

    @JsonProperty("BCDT")
    public Bcdt getBcdt() {
        return bcdt;
    }

    @JsonProperty("BCDT")
    public void setBcdt(Bcdt bcdt) {
        this.bcdt = bcdt;
    }

    @JsonProperty("BCH")
    public Bch getBch() {
        return bch;
    }

    @JsonProperty("BCH")
    public void setBch(Bch bch) {
        this.bch = bch;
    }

    @JsonProperty("BCPT")
    public Bcpt getBcpt() {
        return bcpt;
    }

    @JsonProperty("BCPT")
    public void setBcpt(Bcpt bcpt) {
        this.bcpt = bcpt;
    }

    @JsonProperty("BDG")
    public Bdg getBdg() {
        return bdg;
    }

    @JsonProperty("BDG")
    public void setBdg(Bdg bdg) {
        this.bdg = bdg;
    }

    @JsonProperty("BEAT")
    public Beat getBeat() {
        return beat;
    }

    @JsonProperty("BEAT")
    public void setBeat(Beat beat) {
        this.beat = beat;
    }

    @JsonProperty("BEE")
    public Bee getBee() {
        return bee;
    }

    @JsonProperty("BEE")
    public void setBee(Bee bee) {
        this.bee = bee;
    }

    @JsonProperty("BELA")
    public Bela getBela() {
        return bela;
    }

    @JsonProperty("BELA")
    public void setBela(Bela bela) {
        this.bela = bela;
    }

    @JsonProperty("BERRY")
    public Berry getBerry() {
        return berry;
    }

    @JsonProperty("BERRY")
    public void setBerry(Berry berry) {
        this.berry = berry;
    }

    @JsonProperty("BETHER")
    public Bether getBether() {
        return bether;
    }

    @JsonProperty("BETHER")
    public void setBether(Bether bether) {
        this.bether = bether;
    }

    @JsonProperty("BETR")
    public Betr getBetr() {
        return betr;
    }

    @JsonProperty("BETR")
    public void setBetr(Betr betr) {
        this.betr = betr;
    }

    @JsonProperty("BEZ")
    public Bez getBez() {
        return bez;
    }

    @JsonProperty("BEZ")
    public void setBez(Bez bez) {
        this.bez = bez;
    }

    @JsonProperty("BFT")
    public Bft getBft() {
        return bft;
    }

    @JsonProperty("BFT")
    public void setBft(Bft bft) {
        this.bft = bft;
    }

    @JsonProperty("BGG")
    public Bgg getBgg() {
        return bgg;
    }

    @JsonProperty("BGG")
    public void setBgg(Bgg bgg) {
        this.bgg = bgg;
    }

    @JsonProperty("BIO")
    public Bio getBio() {
        return bio;
    }

    @JsonProperty("BIO")
    public void setBio(Bio bio) {
        this.bio = bio;
    }

    @JsonProperty("BITX")
    public Bitx getBitx() {
        return bitx;
    }

    @JsonProperty("BITX")
    public void setBitx(Bitx bitx) {
        this.bitx = bitx;
    }

    @JsonProperty("BIX")
    public Bix getBix() {
        return bix;
    }

    @JsonProperty("BIX")
    public void setBix(Bix bix) {
        this.bix = bix;
    }

    @JsonProperty("BKX")
    public Bkx getBkx() {
        return bkx;
    }

    @JsonProperty("BKX")
    public void setBkx(Bkx bkx) {
        this.bkx = bkx;
    }

    @JsonProperty("BLNM")
    public Blnm getBlnm() {
        return blnm;
    }

    @JsonProperty("BLNM")
    public void setBlnm(Blnm blnm) {
        this.blnm = blnm;
    }

    @JsonProperty("BLOC")
    public Bloc getBloc() {
        return bloc;
    }

    @JsonProperty("BLOC")
    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    @JsonProperty("BLT")
    public Blt getBlt() {
        return blt;
    }

    @JsonProperty("BLT")
    public void setBlt(Blt blt) {
        this.blt = blt;
    }

    @JsonProperty("BLZ")
    public Blz getBlz() {
        return blz;
    }

    @JsonProperty("BLZ")
    public void setBlz(Blz blz) {
        this.blz = blz;
    }

    @JsonProperty("BMC")
    public Bmc getBmc() {
        return bmc;
    }

    @JsonProperty("BMC")
    public void setBmc(Bmc bmc) {
        this.bmc = bmc;
    }

    @JsonProperty("BMH")
    public Bmh getBmh() {
        return bmh;
    }

    @JsonProperty("BMH")
    public void setBmh(Bmh bmh) {
        this.bmh = bmh;
    }

    @JsonProperty("BMX")
    public Bmx getBmx() {
        return bmx;
    }

    @JsonProperty("BMX")
    public void setBmx(Bmx bmx) {
        this.bmx = bmx;
    }

    @JsonProperty("BNK")
    public Bnk getBnk() {
        return bnk;
    }

    @JsonProperty("BNK")
    public void setBnk(Bnk bnk) {
        this.bnk = bnk;
    }

    @JsonProperty("BNN")
    public Bnn getBnn() {
        return bnn;
    }

    @JsonProperty("BNN")
    public void setBnn(Bnn bnn) {
        this.bnn = bnn;
    }

    @JsonProperty("BNT")
    public Bnt getBnt() {
        return bnt;
    }

    @JsonProperty("BNT")
    public void setBnt(Bnt bnt) {
        this.bnt = bnt;
    }

    @JsonProperty("BNTY")
    public Bnty getBnty() {
        return bnty;
    }

    @JsonProperty("BNTY")
    public void setBnty(Bnty bnty) {
        this.bnty = bnty;
    }

    @JsonProperty("BOB")
    public Bob getBob() {
        return bob;
    }

    @JsonProperty("BOB")
    public void setBob(Bob bob) {
        this.bob = bob;
    }

    @JsonProperty("BOE")
    public Boe getBoe() {
        return boe;
    }

    @JsonProperty("BOE")
    public void setBoe(Boe boe) {
        this.boe = boe;
    }

    @JsonProperty("BOLT")
    public Bolt getBolt() {
        return bolt;
    }

    @JsonProperty("BOLT")
    public void setBolt(Bolt bolt) {
        this.bolt = bolt;
    }

    @JsonProperty("BOLTT")
    public Boltt getBoltt() {
        return boltt;
    }

    @JsonProperty("BOLTT")
    public void setBoltt(Boltt boltt) {
        this.boltt = boltt;
    }

    @JsonProperty("BON")
    public Bon getBon() {
        return bon;
    }

    @JsonProperty("BON")
    public void setBon(Bon bon) {
        this.bon = bon;
    }

    @JsonProperty("BOT")
    public Bot getBot() {
        return bot;
    }

    @JsonProperty("BOT")
    public void setBot(Bot bot) {
        this.bot = bot;
    }

    @JsonProperty("BOUTS")
    public Bouts getBouts() {
        return bouts;
    }

    @JsonProperty("BOUTS")
    public void setBouts(Bouts bouts) {
        this.bouts = bouts;
    }

    @JsonProperty("BOX")
    public Box getBox() {
        return box;
    }

    @JsonProperty("BOX")
    public void setBox(Box box) {
        this.box = box;
    }

    @JsonProperty("BPT")
    public Bpt getBpt() {
        return bpt;
    }

    @JsonProperty("BPT")
    public void setBpt(Bpt bpt) {
        this.bpt = bpt;
    }

    @JsonProperty("BPX")
    public Bpx getBpx() {
        return bpx;
    }

    @JsonProperty("BPX")
    public void setBpx(Bpx bpx) {
        this.bpx = bpx;
    }

    @JsonProperty("BQ")
    public Bq getBq() {
        return bq;
    }

    @JsonProperty("BQ")
    public void setBq(Bq bq) {
        this.bq = bq;
    }

    @JsonProperty("BQTX")
    public Bqtx getBqtx() {
        return bqtx;
    }

    @JsonProperty("BQTX")
    public void setBqtx(Bqtx bqtx) {
        this.bqtx = bqtx;
    }

    @JsonProperty("BRAT")
    public Brat getBrat() {
        return brat;
    }

    @JsonProperty("BRAT")
    public void setBrat(Brat brat) {
        this.brat = brat;
    }

    @JsonProperty("BRD")
    public Brd getBrd() {
        return brd;
    }

    @JsonProperty("BRD")
    public void setBrd(Brd brd) {
        this.brd = brd;
    }

    @JsonProperty("BSTN")
    public Bstn getBstn() {
        return bstn;
    }

    @JsonProperty("BSTN")
    public void setBstn(Bstn bstn) {
        this.bstn = bstn;
    }

    @JsonProperty("BSV")
    public Bsv getBsv() {
        return bsv;
    }

    @JsonProperty("BSV")
    public void setBsv(Bsv bsv) {
        this.bsv = bsv;
    }

    @JsonProperty("BTC")
    public Btc getBtc() {
        return btc;
    }

    @JsonProperty("BTC")
    public void setBtc(Btc btc) {
        this.btc = btc;
    }

    @JsonProperty("BTCL")
    public Btcl getBtcl() {
        return btcl;
    }

    @JsonProperty("BTCL")
    public void setBtcl(Btcl btcl) {
        this.btcl = btcl;
    }

    @JsonProperty("BTCM")
    public Btcm getBtcm() {
        return btcm;
    }

    @JsonProperty("BTCM")
    public void setBtcm(Btcm btcm) {
        this.btcm = btcm;
    }

    @JsonProperty("BTCRED")
    public Btcred getBtcred() {
        return btcred;
    }

    @JsonProperty("BTCRED")
    public void setBtcred(Btcred btcred) {
        this.btcred = btcred;
    }

    @JsonProperty("BTM")
    public Btm getBtm() {
        return btm;
    }

    @JsonProperty("BTM")
    public void setBtm(Btm btm) {
        this.btm = btm;
    }

    @JsonProperty("BTMX")
    public Btmx getBtmx() {
        return btmx;
    }

    @JsonProperty("BTMX")
    public void setBtmx(Btmx btmx) {
        this.btmx = btmx;
    }

    @JsonProperty("BTO")
    public Bto getBto() {
        return bto;
    }

    @JsonProperty("BTO")
    public void setBto(Bto bto) {
        this.bto = bto;
    }

    @JsonProperty("BTRN")
    public Btrn getBtrn() {
        return btrn;
    }

    @JsonProperty("BTRN")
    public void setBtrn(Btrn btrn) {
        this.btrn = btrn;
    }

    @JsonProperty("BTU")
    public Btu getBtu() {
        return btu;
    }

    @JsonProperty("BTU")
    public void setBtu(Btu btu) {
        this.btu = btu;
    }

    @JsonProperty("BUBO")
    public Bubo getBubo() {
        return bubo;
    }

    @JsonProperty("BUBO")
    public void setBubo(Bubo bubo) {
        this.bubo = bubo;
    }

    @JsonProperty("BUD")
    public Bud getBud() {
        return bud;
    }

    @JsonProperty("BUD")
    public void setBud(Bud bud) {
        this.bud = bud;
    }

    @JsonProperty("BWT")
    public Bwt getBwt() {
        return bwt;
    }

    @JsonProperty("BWT")
    public void setBwt(Bwt bwt) {
        this.bwt = bwt;
    }

    @JsonProperty("BZ")
    public Bz getBz() {
        return bz;
    }

    @JsonProperty("BZ")
    public void setBz(Bz bz) {
        this.bz = bz;
    }

    @JsonProperty("BZKY")
    public Bzky getBzky() {
        return bzky;
    }

    @JsonProperty("BZKY")
    public void setBzky(Bzky bzky) {
        this.bzky = bzky;
    }

    @JsonProperty("BZNT")
    public Bznt getBznt() {
        return bznt;
    }

    @JsonProperty("BZNT")
    public void setBznt(Bznt bznt) {
        this.bznt = bznt;
    }

    @JsonProperty("C20")
    public C20 getC20() {
        return c20;
    }

    @JsonProperty("C20")
    public void setC20(C20 c20) {
        this.c20 = c20;
    }

    @JsonProperty("CAG")
    public Cag getCag() {
        return cag;
    }

    @JsonProperty("CAG")
    public void setCag(Cag cag) {
        this.cag = cag;
    }

    @JsonProperty("CAN")
    public Can getCan() {
        return can;
    }

    @JsonProperty("CAN")
    public void setCan(Can can) {
        this.can = can;
    }

    @JsonProperty("CANDY")
    public Candy getCandy() {
        return candy;
    }

    @JsonProperty("CANDY")
    public void setCandy(Candy candy) {
        this.candy = candy;
    }

    @JsonProperty("CAPP")
    public Capp getCapp() {
        return capp;
    }

    @JsonProperty("CAPP")
    public void setCapp(Capp capp) {
        this.capp = capp;
    }

    @JsonProperty("CAR")
    public Car getCar() {
        return car;
    }

    @JsonProperty("CAR")
    public void setCar(Car car) {
        this.car = car;
    }

    @JsonProperty("CARAT")
    public Carat getCarat() {
        return carat;
    }

    @JsonProperty("CARAT")
    public void setCarat(Carat carat) {
        this.carat = carat;
    }

    @JsonProperty("CARD")
    public Card getCard() {
        return card;
    }

    @JsonProperty("CARD")
    public void setCard(Card card) {
        this.card = card;
    }

    @JsonProperty("CBC")
    public Cbc getCbc() {
        return cbc;
    }

    @JsonProperty("CBC")
    public void setCbc(Cbc cbc) {
        this.cbc = cbc;
    }

    @JsonProperty("CBT")
    public Cbt getCbt() {
        return cbt;
    }

    @JsonProperty("CBT")
    public void setCbt(Cbt cbt) {
        this.cbt = cbt;
    }

    @JsonProperty("CCCX")
    public Cccx getCccx() {
        return cccx;
    }

    @JsonProperty("CCCX")
    public void setCccx(Cccx cccx) {
        this.cccx = cccx;
    }

    @JsonProperty("CCL")
    public Ccl getCcl() {
        return ccl;
    }

    @JsonProperty("CCL")
    public void setCcl(Ccl ccl) {
        this.ccl = ccl;
    }

    @JsonProperty("CCO")
    public Cco getCco() {
        return cco;
    }

    @JsonProperty("CCO")
    public void setCco(Cco cco) {
        this.cco = cco;
    }

    @JsonProperty("CCRB")
    public Ccrb getCcrb() {
        return ccrb;
    }

    @JsonProperty("CCRB")
    public void setCcrb(Ccrb ccrb) {
        this.ccrb = ccrb;
    }

    @JsonProperty("CCT")
    public Cct getCct() {
        return cct;
    }

    @JsonProperty("CCT")
    public void setCct(Cct cct) {
        this.cct = cct;
    }

    @JsonProperty("CDT")
    public Cdt getCdt() {
        return cdt;
    }

    @JsonProperty("CDT")
    public void setCdt(Cdt cdt) {
        this.cdt = cdt;
    }

    @JsonProperty("CDX")
    public Cdx getCdx() {
        return cdx;
    }

    @JsonProperty("CDX")
    public void setCdx(Cdx cdx) {
        this.cdx = cdx;
    }

    @JsonProperty("CEDEX")
    public Cedex getCedex() {
        return cedex;
    }

    @JsonProperty("CEDEX")
    public void setCedex(Cedex cedex) {
        this.cedex = cedex;
    }

    @JsonProperty("CEEK")
    public Ceek getCeek() {
        return ceek;
    }

    @JsonProperty("CEEK")
    public void setCeek(Ceek ceek) {
        this.ceek = ceek;
    }

    @JsonProperty("CEL")
    public Cel getCel() {
        return cel;
    }

    @JsonProperty("CEL")
    public void setCel(Cel cel) {
        this.cel = cel;
    }

    @JsonProperty("CELR")
    public Celr getCelr() {
        return celr;
    }

    @JsonProperty("CELR")
    public void setCelr(Celr celr) {
        this.celr = celr;
    }

    @JsonProperty("CEN")
    public Cen getCen() {
        return cen;
    }

    @JsonProperty("CEN")
    public void setCen(Cen cen) {
        this.cen = cen;
    }

    @JsonProperty("CENNZ")
    public Cennz getCennz() {
        return cennz;
    }

    @JsonProperty("CENNZ")
    public void setCennz(Cennz cennz) {
        this.cennz = cennz;
    }

    @JsonProperty("CET")
    public Cet getCet() {
        return cet;
    }

    @JsonProperty("CET")
    public void setCet(Cet cet) {
        this.cet = cet;
    }

    @JsonProperty("CHAT")
    public Chat getChat() {
        return chat;
    }

    @JsonProperty("CHAT")
    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @JsonProperty("CHP")
    public Chp getChp() {
        return chp;
    }

    @JsonProperty("CHP")
    public void setChp(Chp chp) {
        this.chp = chp;
    }

    @JsonProperty("CHSB")
    public Chsb getChsb() {
        return chsb;
    }

    @JsonProperty("CHSB")
    public void setChsb(Chsb chsb) {
        this.chsb = chsb;
    }

    @JsonProperty("CHT")
    public Cht getCht() {
        return cht;
    }

    @JsonProperty("CHT")
    public void setCht(Cht cht) {
        this.cht = cht;
    }

    @JsonProperty("CHX")
    public Chx getChx() {
        return chx;
    }

    @JsonProperty("CHX")
    public void setChx(Chx chx) {
        this.chx = chx;
    }

    @JsonProperty("CJT")
    public Cjt getCjt() {
        return cjt;
    }

    @JsonProperty("CJT")
    public void setCjt(Cjt cjt) {
        this.cjt = cjt;
    }

    @JsonProperty("CL")
    public Cl getCl() {
        return cl;
    }

    @JsonProperty("CL")
    public void setCl(Cl cl) {
        this.cl = cl;
    }

    @JsonProperty("CLN")
    public Cln getCln() {
        return cln;
    }

    @JsonProperty("CLN")
    public void setCln(Cln cln) {
        this.cln = cln;
    }

    @JsonProperty("CMCT")
    public Cmct getCmct() {
        return cmct;
    }

    @JsonProperty("CMCT")
    public void setCmct(Cmct cmct) {
        this.cmct = cmct;
    }

    @JsonProperty("CMS")
    public Cms getCms() {
        return cms;
    }

    @JsonProperty("CMS")
    public void setCms(Cms cms) {
        this.cms = cms;
    }

    @JsonProperty("CMT")
    public Cmt getCmt() {
        return cmt;
    }

    @JsonProperty("CMT")
    public void setCmt(Cmt cmt) {
        this.cmt = cmt;
    }

    @JsonProperty("CND")
    public Cnd getCnd() {
        return cnd;
    }

    @JsonProperty("CND")
    public void setCnd(Cnd cnd) {
        this.cnd = cnd;
    }

    @JsonProperty("CNN")
    public Cnn getCnn() {
        return cnn;
    }

    @JsonProperty("CNN")
    public void setCnn(Cnn cnn) {
        this.cnn = cnn;
    }

    @JsonProperty("CNX")
    public Cnx getCnx() {
        return cnx;
    }

    @JsonProperty("CNX")
    public void setCnx(Cnx cnx) {
        this.cnx = cnx;
    }

    @JsonProperty("COB")
    public Cob getCob() {
        return cob;
    }

    @JsonProperty("COB")
    public void setCob(Cob cob) {
        this.cob = cob;
    }

    @JsonProperty("COFI")
    public Cofi getCofi() {
        return cofi;
    }

    @JsonProperty("COFI")
    public void setCofi(Cofi cofi) {
        this.cofi = cofi;
    }

    @JsonProperty("COIN")
    public Coin getCoin() {
        return coin;
    }

    @JsonProperty("COIN")
    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    @JsonProperty("CONI")
    public Coni getConi() {
        return coni;
    }

    @JsonProperty("CONI")
    public void setConi(Coni coni) {
        this.coni = coni;
    }

    @JsonProperty("COSM")
    public Cosm getCosm() {
        return cosm;
    }

    @JsonProperty("COSM")
    public void setCosm(Cosm cosm) {
        this.cosm = cosm;
    }

    @JsonProperty("COT")
    public Cot getCot() {
        return cot;
    }

    @JsonProperty("COT")
    public void setCot(Cot cot) {
        this.cot = cot;
    }

    @JsonProperty("COU")
    public Cou getCou() {
        return cou;
    }

    @JsonProperty("COU")
    public void setCou(Cou cou) {
        this.cou = cou;
    }

    @JsonProperty("COV")
    public Cov getCov() {
        return cov;
    }

    @JsonProperty("COV")
    public void setCov(Cov cov) {
        this.cov = cov;
    }

    @JsonProperty("COVA")
    public Cova getCova() {
        return cova;
    }

    @JsonProperty("COVA")
    public void setCova(Cova cova) {
        this.cova = cova;
    }

    @JsonProperty("CPAY")
    public Cpay getCpay() {
        return cpay;
    }

    @JsonProperty("CPAY")
    public void setCpay(Cpay cpay) {
        this.cpay = cpay;
    }

    @JsonProperty("CPCH")
    public Cpch getCpch() {
        return cpch;
    }

    @JsonProperty("CPCH")
    public void setCpch(Cpch cpch) {
        this.cpch = cpch;
    }

    @JsonProperty("CPT")
    public Cpt getCpt() {
        return cpt;
    }

    @JsonProperty("CPT")
    public void setCpt(Cpt cpt) {
        this.cpt = cpt;
    }

    @JsonProperty("CPY")
    public Cpy getCpy() {
        return cpy;
    }

    @JsonProperty("CPY")
    public void setCpy(Cpy cpy) {
        this.cpy = cpy;
    }

    @JsonProperty("CRB")
    public Crb getCrb() {
        return crb;
    }

    @JsonProperty("CRB")
    public void setCrb(Crb crb) {
        this.crb = crb;
    }

    @JsonProperty("CRDS")
    public Crds getCrds() {
        return crds;
    }

    @JsonProperty("CRDS")
    public void setCrds(Crds crds) {
        this.crds = crds;
    }

    @JsonProperty("CRED")
    public Cred getCred() {
        return cred;
    }

    @JsonProperty("CRED")
    public void setCred(Cred cred) {
        this.cred = cred;
    }

    @JsonProperty("CREDO")
    public Credo getCredo() {
        return credo;
    }

    @JsonProperty("CREDO")
    public void setCredo(Credo credo) {
        this.credo = credo;
    }

    @JsonProperty("CRO")
    public Cro getCro() {
        return cro;
    }

    @JsonProperty("CRO")
    public void setCro(Cro cro) {
        this.cro = cro;
    }

    @JsonProperty("CRPT")
    public Crpt getCrpt() {
        return crpt;
    }

    @JsonProperty("CRPT")
    public void setCrpt(Crpt crpt) {
        this.crpt = crpt;
    }

    @JsonProperty("CRYC")
    public Cryc getCryc() {
        return cryc;
    }

    @JsonProperty("CRYC")
    public void setCryc(Cryc cryc) {
        this.cryc = cryc;
    }

    @JsonProperty("CSEN")
    public Csen getCsen() {
        return csen;
    }

    @JsonProperty("CSEN")
    public void setCsen(Csen csen) {
        this.csen = csen;
    }

    @JsonProperty("CSM")
    public Csm getCsm() {
        return csm;
    }

    @JsonProperty("CSM")
    public void setCsm(Csm csm) {
        this.csm = csm;
    }

    @JsonProperty("CSNO")
    public Csno getCsno() {
        return csno;
    }

    @JsonProperty("CSNO")
    public void setCsno(Csno csno) {
        this.csno = csno;
    }

    @JsonProperty("CSP")
    public Csp getCsp() {
        return csp;
    }

    @JsonProperty("CSP")
    public void setCsp(Csp csp) {
        this.csp = csp;
    }

    @JsonProperty("CTXC")
    public Ctxc getCtxc() {
        return ctxc;
    }

    @JsonProperty("CTXC")
    public void setCtxc(Ctxc ctxc) {
        this.ctxc = ctxc;
    }

    @JsonProperty("CUBE")
    public Cube getCube() {
        return cube;
    }

    @JsonProperty("CUBE")
    public void setCube(Cube cube) {
        this.cube = cube;
    }

    @JsonProperty("CV")
    public Cv getCv() {
        return cv;
    }

    @JsonProperty("CV")
    public void setCv(Cv cv) {
        this.cv = cv;
    }

    @JsonProperty("CVC")
    public Cvc getCvc() {
        return cvc;
    }

    @JsonProperty("CVC")
    public void setCvc(Cvc cvc) {
        this.cvc = cvc;
    }

    @JsonProperty("CVT")
    public Cvt getCvt() {
        return cvt;
    }

    @JsonProperty("CVT")
    public void setCvt(Cvt cvt) {
        this.cvt = cvt;
    }

    @JsonProperty("CXO")
    public Cxo getCxo() {
        return cxo;
    }

    @JsonProperty("CXO")
    public void setCxo(Cxo cxo) {
        this.cxo = cxo;
    }

    @JsonProperty("DACC")
    public Dacc getDacc() {
        return dacc;
    }

    @JsonProperty("DACC")
    public void setDacc(Dacc dacc) {
        this.dacc = dacc;
    }

    @JsonProperty("DADI")
    public Dadi getDadi() {
        return dadi;
    }

    @JsonProperty("DADI")
    public void setDadi(Dadi dadi) {
        this.dadi = dadi;
    }

    @JsonProperty("DAG")
    public Dag getDag() {
        return dag;
    }

    @JsonProperty("DAG")
    public void setDag(Dag dag) {
        this.dag = dag;
    }

    @JsonProperty("DAGT")
    public Dagt getDagt() {
        return dagt;
    }

    @JsonProperty("DAGT")
    public void setDagt(Dagt dagt) {
        this.dagt = dagt;
    }

    @JsonProperty("DAI")
    public Dai getDai() {
        return dai;
    }

    @JsonProperty("DAI")
    public void setDai(Dai dai) {
        this.dai = dai;
    }

    @JsonProperty("DAN")
    public Dan getDan() {
        return dan;
    }

    @JsonProperty("DAN")
    public void setDan(Dan dan) {
        this.dan = dan;
    }

    @JsonProperty("DAOC")
    public Daoc getDaoc() {
        return daoc;
    }

    @JsonProperty("DAOC")
    public void setDaoc(Daoc daoc) {
        this.daoc = daoc;
    }

    @JsonProperty("DAPS")
    public Daps getDaps() {
        return daps;
    }

    @JsonProperty("DAPS")
    public void setDaps(Daps daps) {
        this.daps = daps;
    }

    @JsonProperty("DASH")
    public Dash getDash() {
        return dash;
    }

    @JsonProperty("DASH")
    public void setDash(Dash dash) {
        this.dash = dash;
    }

    @JsonProperty("DAT")
    public Dat getDat() {
        return dat;
    }

    @JsonProperty("DAT")
    public void setDat(Dat dat) {
        this.dat = dat;
    }

    @JsonProperty("DATA")
    public Data__1 getData() {
        return data;
    }

    @JsonProperty("DATA")
    public void setData(Data__1 data) {
        this.data = data;
    }

    @JsonProperty("DATX")
    public Datx getDatx() {
        return datx;
    }

    @JsonProperty("DATX")
    public void setDatx(Datx datx) {
        this.datx = datx;
    }

    @JsonProperty("DAV")
    public Dav getDav() {
        return dav;
    }

    @JsonProperty("DAV")
    public void setDav(Dav dav) {
        this.dav = dav;
    }

    @JsonProperty("DAX")
    public Dax getDax() {
        return dax;
    }

    @JsonProperty("DAX")
    public void setDax(Dax dax) {
        this.dax = dax;
    }

    @JsonProperty("DAY")
    public Day getDay() {
        return day;
    }

    @JsonProperty("DAY")
    public void setDay(Day day) {
        this.day = day;
    }

    @JsonProperty("DBET")
    public Dbet getDbet() {
        return dbet;
    }

    @JsonProperty("DBET")
    public void setDbet(Dbet dbet) {
        this.dbet = dbet;
    }

    @JsonProperty("DCN")
    public Dcn getDcn() {
        return dcn;
    }

    @JsonProperty("DCN")
    public void setDcn(Dcn dcn) {
        this.dcn = dcn;
    }

    @JsonProperty("DDD")
    public Ddd getDdd() {
        return ddd;
    }

    @JsonProperty("DDD")
    public void setDdd(Ddd ddd) {
        this.ddd = ddd;
    }

    @JsonProperty("DEB")
    public Deb getDeb() {
        return deb;
    }

    @JsonProperty("DEB")
    public void setDeb(Deb deb) {
        this.deb = deb;
    }

    @JsonProperty("DEC")
    public Dec getDec() {
        return dec;
    }

    @JsonProperty("DEC")
    public void setDec(Dec dec) {
        this.dec = dec;
    }

    @JsonProperty("DENT")
    public Dent getDent() {
        return dent;
    }

    @JsonProperty("DENT")
    public void setDent(Dent dent) {
        this.dent = dent;
    }

    @JsonProperty("DFXT")
    public Dfxt getDfxt() {
        return dfxt;
    }

    @JsonProperty("DFXT")
    public void setDfxt(Dfxt dfxt) {
        this.dfxt = dfxt;
    }

    @JsonProperty("DGD")
    public Dgd getDgd() {
        return dgd;
    }

    @JsonProperty("DGD")
    public void setDgd(Dgd dgd) {
        this.dgd = dgd;
    }

    @JsonProperty("DGTX")
    public Dgtx getDgtx() {
        return dgtx;
    }

    @JsonProperty("DGTX")
    public void setDgtx(Dgtx dgtx) {
        this.dgtx = dgtx;
    }

    @JsonProperty("DGX")
    public Dgx getDgx() {
        return dgx;
    }

    @JsonProperty("DGX")
    public void setDgx(Dgx dgx) {
        this.dgx = dgx;
    }

    @JsonProperty("DICE")
    public Dice getDice() {
        return dice;
    }

    @JsonProperty("DICE")
    public void setDice(Dice dice) {
        this.dice = dice;
    }

    @JsonProperty("DIG")
    public Dig getDig() {
        return dig;
    }

    @JsonProperty("DIG")
    public void setDig(Dig dig) {
        this.dig = dig;
    }

    @JsonProperty("DIO")
    public Dio getDio() {
        return dio;
    }

    @JsonProperty("DIO")
    public void setDio(Dio dio) {
        this.dio = dio;
    }

    @JsonProperty("DLT")
    public Dlt getDlt() {
        return dlt;
    }

    @JsonProperty("DLT")
    public void setDlt(Dlt dlt) {
        this.dlt = dlt;
    }

    @JsonProperty("DML")
    public Dml getDml() {
        return dml;
    }

    @JsonProperty("DML")
    public void setDml(Dml dml) {
        this.dml = dml;
    }

    @JsonProperty("DMT")
    public Dmt getDmt() {
        return dmt;
    }

    @JsonProperty("DMT")
    public void setDmt(Dmt dmt) {
        this.dmt = dmt;
    }

    @JsonProperty("DNA")
    public Dna getDna() {
        return dna;
    }

    @JsonProperty("DNA")
    public void setDna(Dna dna) {
        this.dna = dna;
    }

    @JsonProperty("DNT")
    public Dnt getDnt() {
        return dnt;
    }

    @JsonProperty("DNT")
    public void setDnt(Dnt dnt) {
        this.dnt = dnt;
    }

    @JsonProperty("DOCK")
    public Dock getDock() {
        return dock;
    }

    @JsonProperty("DOCK")
    public void setDock(Dock dock) {
        this.dock = dock;
    }

    @JsonProperty("DOGE")
    public Doge getDoge() {
        return doge;
    }

    @JsonProperty("DOGE")
    public void setDoge(Doge doge) {
        this.doge = doge;
    }

    @JsonProperty("DOOH")
    public Dooh getDooh() {
        return dooh;
    }

    @JsonProperty("DOOH")
    public void setDooh(Dooh dooh) {
        this.dooh = dooh;
    }

    @JsonProperty("DOV")
    public Dov getDov() {
        return dov;
    }

    @JsonProperty("DOV")
    public void setDov(Dov dov) {
        this.dov = dov;
    }

    @JsonProperty("DOW")
    public Dow getDow() {
        return dow;
    }

    @JsonProperty("DOW")
    public void setDow(Dow dow) {
        this.dow = dow;
    }

    @JsonProperty("DPY")
    public Dpy getDpy() {
        return dpy;
    }

    @JsonProperty("DPY")
    public void setDpy(Dpy dpy) {
        this.dpy = dpy;
    }

    @JsonProperty("DRG")
    public Drg getDrg() {
        return drg;
    }

    @JsonProperty("DRG")
    public void setDrg(Drg drg) {
        this.drg = drg;
    }

    @JsonProperty("DRGN")
    public Drgn getDrgn() {
        return drgn;
    }

    @JsonProperty("DRGN")
    public void setDrgn(Drgn drgn) {
        this.drgn = drgn;
    }

    @JsonProperty("DROP")
    public Drop getDrop() {
        return drop;
    }

    @JsonProperty("DROP")
    public void setDrop(Drop drop) {
        this.drop = drop;
    }

    @JsonProperty("DRPU")
    public Drpu getDrpu() {
        return drpu;
    }

    @JsonProperty("DRPU")
    public void setDrpu(Drpu drpu) {
        this.drpu = drpu;
    }

    @JsonProperty("DRT")
    public Drt getDrt() {
        return drt;
    }

    @JsonProperty("DRT")
    public void setDrt(Drt drt) {
        this.drt = drt;
    }

    @JsonProperty("DTH")
    public Dth getDth() {
        return dth;
    }

    @JsonProperty("DTH")
    public void setDth(Dth dth) {
        this.dth = dth;
    }

    @JsonProperty("DTR")
    public Dtr getDtr() {
        return dtr;
    }

    @JsonProperty("DTR")
    public void setDtr(Dtr dtr) {
        this.dtr = dtr;
    }

    @JsonProperty("DTRC")
    public Dtrc getDtrc() {
        return dtrc;
    }

    @JsonProperty("DTRC")
    public void setDtrc(Dtrc dtrc) {
        this.dtrc = dtrc;
    }

    @JsonProperty("DTX")
    public Dtx getDtx() {
        return dtx;
    }

    @JsonProperty("DTX")
    public void setDtx(Dtx dtx) {
        this.dtx = dtx;
    }

    @JsonProperty("DXT")
    public Dxt getDxt() {
        return dxt;
    }

    @JsonProperty("DXT")
    public void setDxt(Dxt dxt) {
        this.dxt = dxt;
    }

    @JsonProperty("EARTH")
    public Earth getEarth() {
        return earth;
    }

    @JsonProperty("EARTH")
    public void setEarth(Earth earth) {
        this.earth = earth;
    }

    @JsonProperty("EBC")
    public Ebc getEbc() {
        return ebc;
    }

    @JsonProperty("EBC")
    public void setEbc(Ebc ebc) {
        this.ebc = ebc;
    }

    @JsonProperty("EBTC")
    public Ebtc getEbtc() {
        return ebtc;
    }

    @JsonProperty("EBTC")
    public void setEbtc(Ebtc ebtc) {
        this.ebtc = ebtc;
    }

    @JsonProperty("ECASH")
    public Ecash getEcash() {
        return ecash;
    }

    @JsonProperty("ECASH")
    public void setEcash(Ecash ecash) {
        this.ecash = ecash;
    }

    @JsonProperty("ECHT")
    public Echt getEcht() {
        return echt;
    }

    @JsonProperty("ECHT")
    public void setEcht(Echt echt) {
        this.echt = echt;
    }

    @JsonProperty("ECOM")
    public Ecom getEcom() {
        return ecom;
    }

    @JsonProperty("ECOM")
    public void setEcom(Ecom ecom) {
        this.ecom = ecom;
    }

    @JsonProperty("ECTE")
    public Ecte getEcte() {
        return ecte;
    }

    @JsonProperty("ECTE")
    public void setEcte(Ecte ecte) {
        this.ecte = ecte;
    }

    @JsonProperty("EDG")
    public Edg getEdg() {
        return edg;
    }

    @JsonProperty("EDG")
    public void setEdg(Edg edg) {
        this.edg = edg;
    }

    @JsonProperty("EDN")
    public Edn getEdn() {
        return edn;
    }

    @JsonProperty("EDN")
    public void setEdn(Edn edn) {
        this.edn = edn;
    }

    @JsonProperty("EDO")
    public Edo getEdo() {
        return edo;
    }

    @JsonProperty("EDO")
    public void setEdo(Edo edo) {
        this.edo = edo;
    }

    @JsonProperty("EDU")
    public Edu getEdu() {
        return edu;
    }

    @JsonProperty("EDU")
    public void setEdu(Edu edu) {
        this.edu = edu;
    }

    @JsonProperty("EGCC")
    public Egcc getEgcc() {
        return egcc;
    }

    @JsonProperty("EGCC")
    public void setEgcc(Egcc egcc) {
        this.egcc = egcc;
    }

    @JsonProperty("EGT")
    public Egt getEgt() {
        return egt;
    }

    @JsonProperty("EGT")
    public void setEgt(Egt egt) {
        this.egt = egt;
    }

    @JsonProperty("EKO")
    public Eko getEko() {
        return eko;
    }

    @JsonProperty("EKO")
    public void setEko(Eko eko) {
        this.eko = eko;
    }

    @JsonProperty("EKT")
    public Ekt getEkt() {
        return ekt;
    }

    @JsonProperty("EKT")
    public void setEkt(Ekt ekt) {
        this.ekt = ekt;
    }

    @JsonProperty("ELEC")
    public Elec getElec() {
        return elec;
    }

    @JsonProperty("ELEC")
    public void setElec(Elec elec) {
        this.elec = elec;
    }

    @JsonProperty("ELF")
    public Elf getElf() {
        return elf;
    }

    @JsonProperty("ELF")
    public void setElf(Elf elf) {
        this.elf = elf;
    }

    @JsonProperty("ELI")
    public Eli getEli() {
        return eli;
    }

    @JsonProperty("ELI")
    public void setEli(Eli eli) {
        this.eli = eli;
    }

    @JsonProperty("ELITE")
    public Elite getElite() {
        return elite;
    }

    @JsonProperty("ELITE")
    public void setElite(Elite elite) {
        this.elite = elite;
    }

    @JsonProperty("ELIX")
    public Elix getElix() {
        return elix;
    }

    @JsonProperty("ELIX")
    public void setElix(Elix elix) {
        this.elix = elix;
    }

    @JsonProperty("ELTCOIN")
    public Eltcoin getEltcoin() {
        return eltcoin;
    }

    @JsonProperty("ELTCOIN")
    public void setEltcoin(Eltcoin eltcoin) {
        this.eltcoin = eltcoin;
    }

    @JsonProperty("ELY")
    public Ely getEly() {
        return ely;
    }

    @JsonProperty("ELY")
    public void setEly(Ely ely) {
        this.ely = ely;
    }

    @JsonProperty("EMPH")
    public Emph getEmph() {
        return emph;
    }

    @JsonProperty("EMPH")
    public void setEmph(Emph emph) {
        this.emph = emph;
    }

    @JsonProperty("ENGT")
    public Engt getEngt() {
        return engt;
    }

    @JsonProperty("ENGT")
    public void setEngt(Engt engt) {
        this.engt = engt;
    }

    @JsonProperty("ENJ")
    public Enj getEnj() {
        return enj;
    }

    @JsonProperty("ENJ")
    public void setEnj(Enj enj) {
        this.enj = enj;
    }

    @JsonProperty("ENTER")
    public Enter getEnter() {
        return enter;
    }

    @JsonProperty("ENTER")
    public void setEnter(Enter enter) {
        this.enter = enter;
    }

    @JsonProperty("EOSDAC")
    public Eosdac getEosdac() {
        return eosdac;
    }

    @JsonProperty("EOSDAC")
    public void setEosdac(Eosdac eosdac) {
        this.eosdac = eosdac;
    }

    @JsonProperty("EQUAL")
    public Equal getEqual() {
        return equal;
    }

    @JsonProperty("EQUAL")
    public void setEqual(Equal equal) {
        this.equal = equal;
    }

    @JsonProperty("ERC20")
    public Erc20 getErc20() {
        return erc20;
    }

    @JsonProperty("ERC20")
    public void setErc20(Erc20 erc20) {
        this.erc20 = erc20;
    }

    @JsonProperty("ERIS")
    public Eris getEris() {
        return eris;
    }

    @JsonProperty("ERIS")
    public void setEris(Eris eris) {
        this.eris = eris;
    }

    @JsonProperty("ERO")
    public Ero getEro() {
        return ero;
    }

    @JsonProperty("ERO")
    public void setEro(Ero ero) {
        this.ero = ero;
    }

    @JsonProperty("ESS")
    public Ess getEss() {
        return ess;
    }

    @JsonProperty("ESS")
    public void setEss(Ess ess) {
        this.ess = ess;
    }

    @JsonProperty("EST")
    public Est getEst() {
        return est;
    }

    @JsonProperty("EST")
    public void setEst(Est est) {
        this.est = est;
    }

    @JsonProperty("ESZ")
    public Esz getEsz() {
        return esz;
    }

    @JsonProperty("ESZ")
    public void setEsz(Esz esz) {
        this.esz = esz;
    }

    @JsonProperty("ETBS")
    public Etbs getEtbs() {
        return etbs;
    }

    @JsonProperty("ETBS")
    public void setEtbs(Etbs etbs) {
        this.etbs = etbs;
    }

    @JsonProperty("ETC")
    public Etc getEtc() {
        return etc;
    }

    @JsonProperty("ETC")
    public void setEtc(Etc etc) {
        this.etc = etc;
    }

    @JsonProperty("ETG")
    public Etg getEtg() {
        return etg;
    }

    @JsonProperty("ETG")
    public void setEtg(Etg etg) {
        this.etg = etg;
    }

    @JsonProperty("ETGP")
    public Etgp getEtgp() {
        return etgp;
    }

    @JsonProperty("ETGP")
    public void setEtgp(Etgp etgp) {
        this.etgp = etgp;
    }

    @JsonProperty("ETH")
    public Eth getEth() {
        return eth;
    }

    @JsonProperty("ETH")
    public void setEth(Eth eth) {
        this.eth = eth;
    }

    @JsonProperty("ETHM")
    public Ethm getEthm() {
        return ethm;
    }

    @JsonProperty("ETHM")
    public void setEthm(Ethm ethm) {
        this.ethm = ethm;
    }

    @JsonProperty("ETHOS")
    public Ethos getEthos() {
        return ethos;
    }

    @JsonProperty("ETHOS")
    public void setEthos(Ethos ethos) {
        this.ethos = ethos;
    }

    @JsonProperty("ETK")
    public Etk getEtk() {
        return etk;
    }

    @JsonProperty("ETK")
    public void setEtk(Etk etk) {
        this.etk = etk;
    }

    @JsonProperty("ETN")
    public Etn getEtn() {
        return etn;
    }

    @JsonProperty("ETN")
    public void setEtn(Etn etn) {
        this.etn = etn;
    }

    @JsonProperty("EURS")
    public Eurs getEurs() {
        return eurs;
    }

    @JsonProperty("EURS")
    public void setEurs(Eurs eurs) {
        this.eurs = eurs;
    }

    @JsonProperty("EVC")
    public Evc getEvc() {
        return evc;
    }

    @JsonProperty("EVC")
    public void setEvc(Evc evc) {
        this.evc = evc;
    }

    @JsonProperty("EVE")
    public Eve getEve() {
        return eve;
    }

    @JsonProperty("EVE")
    public void setEve(Eve eve) {
        this.eve = eve;
    }

    @JsonProperty("EVED")
    public Eved getEved() {
        return eved;
    }

    @JsonProperty("EVED")
    public void setEved(Eved eved) {
        this.eved = eved;
    }

    @JsonProperty("EVR")
    public Evr getEvr() {
        return evr;
    }

    @JsonProperty("EVR")
    public void setEvr(Evr evr) {
        this.evr = evr;
    }

    @JsonProperty("EVX")
    public Evx getEvx() {
        return evx;
    }

    @JsonProperty("EVX")
    public void setEvx(Evx evx) {
        this.evx = evx;
    }

    @JsonProperty("EXC")
    public Exc getExc() {
        return exc;
    }

    @JsonProperty("EXC")
    public void setExc(Exc exc) {
        this.exc = exc;
    }

    @JsonProperty("EXMR")
    public Exmr getExmr() {
        return exmr;
    }

    @JsonProperty("EXMR")
    public void setExmr(Exmr exmr) {
        this.exmr = exmr;
    }

    @JsonProperty("EXRN")
    public Exrn getExrn() {
        return exrn;
    }

    @JsonProperty("EXRN")
    public void setExrn(Exrn exrn) {
        this.exrn = exrn;
    }

    @JsonProperty("EXY")
    public Exy getExy() {
        return exy;
    }

    @JsonProperty("EXY")
    public void setExy(Exy exy) {
        this.exy = exy;
    }

    @JsonProperty("FACE")
    public Face getFace() {
        return face;
    }

    @JsonProperty("FACE")
    public void setFace(Face face) {
        this.face = face;
    }

    @JsonProperty("FAIRG")
    public Fairg getFairg() {
        return fairg;
    }

    @JsonProperty("FAIRG")
    public void setFairg(Fairg fairg) {
        this.fairg = fairg;
    }

    @JsonProperty("FAT")
    public Fat getFat() {
        return fat;
    }

    @JsonProperty("FAT")
    public void setFat(Fat fat) {
        this.fat = fat;
    }

    @JsonProperty("FDX")
    public Fdx getFdx() {
        return fdx;
    }

    @JsonProperty("FDX")
    public void setFdx(Fdx fdx) {
        this.fdx = fdx;
    }

    @JsonProperty("FDZ")
    public Fdz getFdz() {
        return fdz;
    }

    @JsonProperty("FDZ")
    public void setFdz(Fdz fdz) {
        this.fdz = fdz;
    }

    @JsonProperty("FET")
    public Fet getFet() {
        return fet;
    }

    @JsonProperty("FET")
    public void setFet(Fet fet) {
        this.fet = fet;
    }

    @JsonProperty("FLIK")
    public Flik getFlik() {
        return flik;
    }

    @JsonProperty("FLIK")
    public void setFlik(Flik flik) {
        this.flik = flik;
    }

    @JsonProperty("FLIXX")
    public Flixx getFlixx() {
        return flixx;
    }

    @JsonProperty("FLIXX")
    public void setFlixx(Flixx flixx) {
        this.flixx = flixx;
    }

    @JsonProperty("FLOT")
    public Flot getFlot() {
        return flot;
    }

    @JsonProperty("FLOT")
    public void setFlot(Flot flot) {
        this.flot = flot;
    }

    @JsonProperty("FLUZ")
    public Fluz getFluz() {
        return fluz;
    }

    @JsonProperty("FLUZ")
    public void setFluz(Fluz fluz) {
        this.fluz = fluz;
    }

    @JsonProperty("FND")
    public Fnd getFnd() {
        return fnd;
    }

    @JsonProperty("FND")
    public void setFnd(Fnd fnd) {
        this.fnd = fnd;
    }

    @JsonProperty("FNTB")
    public Fntb getFntb() {
        return fntb;
    }

    @JsonProperty("FNTB")
    public void setFntb(Fntb fntb) {
        this.fntb = fntb;
    }

    @JsonProperty("FOAM")
    public Foam getFoam() {
        return foam;
    }

    @JsonProperty("FOAM")
    public void setFoam(Foam foam) {
        this.foam = foam;
    }

    @JsonProperty("FOTA")
    public Fota getFota() {
        return fota;
    }

    @JsonProperty("FOTA")
    public void setFota(Fota fota) {
        this.fota = fota;
    }

    @JsonProperty("FOXT")
    public Foxt getFoxt() {
        return foxt;
    }

    @JsonProperty("FOXT")
    public void setFoxt(Foxt foxt) {
        this.foxt = foxt;
    }

    @JsonProperty("FREC")
    public Frec getFrec() {
        return frec;
    }

    @JsonProperty("FREC")
    public void setFrec(Frec frec) {
        this.frec = frec;
    }

    @JsonProperty("FREE")
    public Free getFree() {
        return free;
    }

    @JsonProperty("FREE")
    public void setFree(Free free) {
        this.free = free;
    }

    @JsonProperty("FSN")
    public Fsn getFsn() {
        return fsn;
    }

    @JsonProperty("FSN")
    public void setFsn(Fsn fsn) {
        this.fsn = fsn;
    }

    @JsonProperty("FT")
    public Ft getFt() {
        return ft;
    }

    @JsonProperty("FT")
    public void setFt(Ft ft) {
        this.ft = ft;
    }

    @JsonProperty("FTM")
    public Ftm getFtm() {
        return ftm;
    }

    @JsonProperty("FTM")
    public void setFtm(Ftm ftm) {
        this.ftm = ftm;
    }

    @JsonProperty("FTT")
    public Ftt getFtt() {
        return ftt;
    }

    @JsonProperty("FTT")
    public void setFtt(Ftt ftt) {
        this.ftt = ftt;
    }

    @JsonProperty("FTX")
    public Ftx getFtx() {
        return ftx;
    }

    @JsonProperty("FTX")
    public void setFtx(Ftx ftx) {
        this.ftx = ftx;
    }

    @JsonProperty("FUEL")
    public Fuel getFuel() {
        return fuel;
    }

    @JsonProperty("FUEL")
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @JsonProperty("FUN")
    public Fun getFun() {
        return fun;
    }

    @JsonProperty("FUN")
    public void setFun(Fun fun) {
        this.fun = fun;
    }

    @JsonProperty("FUNDZ")
    public Fundz getFundz() {
        return fundz;
    }

    @JsonProperty("FUNDZ")
    public void setFundz(Fundz fundz) {
        this.fundz = fundz;
    }

    @JsonProperty("FXT")
    public Fxt getFxt() {
        return fxt;
    }

    @JsonProperty("FXT")
    public void setFxt(Fxt fxt) {
        this.fxt = fxt;
    }

    @JsonProperty("FYP")
    public Fyp getFyp() {
        return fyp;
    }

    @JsonProperty("FYP")
    public void setFyp(Fyp fyp) {
        this.fyp = fyp;
    }

    @JsonProperty("GAMB")
    public Gamb getGamb() {
        return gamb;
    }

    @JsonProperty("GAMB")
    public void setGamb(Gamb gamb) {
        this.gamb = gamb;
    }

    @JsonProperty("GARD")
    public Gard getGard() {
        return gard;
    }

    @JsonProperty("GARD")
    public void setGard(Gard gard) {
        this.gard = gard;
    }

    @JsonProperty("GEM")
    public Gem getGem() {
        return gem;
    }

    @JsonProperty("GEM")
    public void setGem(Gem gem) {
        this.gem = gem;
    }

    @JsonProperty("GENE")
    public Gene getGene() {
        return gene;
    }

    @JsonProperty("GENE")
    public void setGene(Gene gene) {
        this.gene = gene;
    }

    @JsonProperty("GENS")
    public Gens getGens() {
        return gens;
    }

    @JsonProperty("GENS")
    public void setGens(Gens gens) {
        this.gens = gens;
    }

    @JsonProperty("GETX")
    public Getx getGetx() {
        return getx;
    }

    @JsonProperty("GETX")
    public void setGetx(Getx getx) {
        this.getx = getx;
    }

    @JsonProperty("GNO")
    public Gno getGno() {
        return gno;
    }

    @JsonProperty("GNO")
    public void setGno(Gno gno) {
        this.gno = gno;
    }

    @JsonProperty("GNT")
    public Gnt getGnt() {
        return gnt;
    }

    @JsonProperty("GNT")
    public void setGnt(Gnt gnt) {
        this.gnt = gnt;
    }

    @JsonProperty("GNX")
    public Gnx getGnx() {
        return gnx;
    }

    @JsonProperty("GNX")
    public void setGnx(Gnx gnx) {
        this.gnx = gnx;
    }

    @JsonProperty("GOOD")
    public Good getGood() {
        return good;
    }

    @JsonProperty("GOOD")
    public void setGood(Good good) {
        this.good = good;
    }

    @JsonProperty("GRID")
    public Grid getGrid() {
        return grid;
    }

    @JsonProperty("GRID")
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @JsonProperty("GRMD")
    public Grmd getGrmd() {
        return grmd;
    }

    @JsonProperty("GRMD")
    public void setGrmd(Grmd grmd) {
        this.grmd = grmd;
    }

    @JsonProperty("GRX")
    public Grx getGrx() {
        return grx;
    }

    @JsonProperty("GRX")
    public void setGrx(Grx grx) {
        this.grx = grx;
    }

    @JsonProperty("GSC")
    public Gsc getGsc() {
        return gsc;
    }

    @JsonProperty("GSC")
    public void setGsc(Gsc gsc) {
        this.gsc = gsc;
    }

    @JsonProperty("GST")
    public Gst getGst() {
        return gst;
    }

    @JsonProperty("GST")
    public void setGst(Gst gst) {
        this.gst = gst;
    }

    @JsonProperty("GTC")
    public Gtc getGtc() {
        return gtc;
    }

    @JsonProperty("GTC")
    public void setGtc(Gtc gtc) {
        this.gtc = gtc;
    }

    @JsonProperty("GTO")
    public Gto getGto() {
        return gto;
    }

    @JsonProperty("GTO")
    public void setGto(Gto gto) {
        this.gto = gto;
    }

    @JsonProperty("GUESS")
    public Guess getGuess() {
        return guess;
    }

    @JsonProperty("GUESS")
    public void setGuess(Guess guess) {
        this.guess = guess;
    }

    @JsonProperty("GUP")
    public Gup getGup() {
        return gup;
    }

    @JsonProperty("GUP")
    public void setGup(Gup gup) {
        this.gup = gup;
    }

    @JsonProperty("GUSD")
    public Gusd getGusd() {
        return gusd;
    }

    @JsonProperty("GUSD")
    public void setGusd(Gusd gusd) {
        this.gusd = gusd;
    }

    @JsonProperty("GVE")
    public Gve getGve() {
        return gve;
    }

    @JsonProperty("GVE")
    public void setGve(Gve gve) {
        this.gve = gve;
    }

    @JsonProperty("GVT")
    public Gvt getGvt() {
        return gvt;
    }

    @JsonProperty("GVT")
    public void setGvt(Gvt gvt) {
        this.gvt = gvt;
    }

    @JsonProperty("HAND")
    public Hand getHand() {
        return hand;
    }

    @JsonProperty("HAND")
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @JsonProperty("HB")
    public Hb getHb() {
        return hb;
    }

    @JsonProperty("HB")
    public void setHb(Hb hb) {
        this.hb = hb;
    }

    @JsonProperty("HBT")
    public Hbt getHbt() {
        return hbt;
    }

    @JsonProperty("HBT")
    public void setHbt(Hbt hbt) {
        this.hbt = hbt;
    }

    @JsonProperty("HBZ")
    public Hbz getHbz() {
        return hbz;
    }

    @JsonProperty("HBZ")
    public void setHbz(Hbz hbz) {
        this.hbz = hbz;
    }

    @JsonProperty("HEDG")
    public Hedg getHedg() {
        return hedg;
    }

    @JsonProperty("HEDG")
    public void setHedg(Hedg hedg) {
        this.hedg = hedg;
    }

    @JsonProperty("HER")
    public Her getHer() {
        return her;
    }

    @JsonProperty("HER")
    public void setHer(Her her) {
        this.her = her;
    }

    @JsonProperty("HERO")
    public Hero getHero() {
        return hero;
    }

    @JsonProperty("HERO")
    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @JsonProperty("HGT")
    public Hgt getHgt() {
        return hgt;
    }

    @JsonProperty("HGT")
    public void setHgt(Hgt hgt) {
        this.hgt = hgt;
    }

    @JsonProperty("HIT")
    public Hit getHit() {
        return hit;
    }

    @JsonProperty("HIT")
    public void setHit(Hit hit) {
        this.hit = hit;
    }

    @JsonProperty("HKN")
    public Hkn getHkn() {
        return hkn;
    }

    @JsonProperty("HKN")
    public void setHkn(Hkn hkn) {
        this.hkn = hkn;
    }

    @JsonProperty("HMC")
    public Hmc getHmc() {
        return hmc;
    }

    @JsonProperty("HMC")
    public void setHmc(Hmc hmc) {
        this.hmc = hmc;
    }

    @JsonProperty("HMQ")
    public Hmq getHmq() {
        return hmq;
    }

    @JsonProperty("HMQ")
    public void setHmq(Hmq hmq) {
        this.hmq = hmq;
    }

    @JsonProperty("HORSE")
    public Horse getHorse() {
        return horse;
    }

    @JsonProperty("HORSE")
    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @JsonProperty("HPB")
    public Hpb getHpb() {
        return hpb;
    }

    @JsonProperty("HPB")
    public void setHpb(Hpb hpb) {
        this.hpb = hpb;
    }

    @JsonProperty("HPT")
    public Hpt getHpt() {
        return hpt;
    }

    @JsonProperty("HPT")
    public void setHpt(Hpt hpt) {
        this.hpt = hpt;
    }

    @JsonProperty("HQT")
    public Hqt getHqt() {
        return hqt;
    }

    @JsonProperty("HQT")
    public void setHqt(Hqt hqt) {
        this.hqt = hqt;
    }

    @JsonProperty("HQX")
    public Hqx getHqx() {
        return hqx;
    }

    @JsonProperty("HQX")
    public void setHqx(Hqx hqx) {
        this.hqx = hqx;
    }

    @JsonProperty("HSC")
    public Hsc getHsc() {
        return hsc;
    }

    @JsonProperty("HSC")
    public void setHsc(Hsc hsc) {
        this.hsc = hsc;
    }

    @JsonProperty("HST")
    public Hst getHst() {
        return hst;
    }

    @JsonProperty("HST")
    public void setHst(Hst hst) {
        this.hst = hst;
    }

    @JsonProperty("HT")
    public Ht getHt() {
        return ht;
    }

    @JsonProperty("HT")
    public void setHt(Ht ht) {
        this.ht = ht;
    }

    @JsonProperty("HUR")
    public Hur getHur() {
        return hur;
    }

    @JsonProperty("HUR")
    public void setHur(Hur hur) {
        this.hur = hur;
    }

    @JsonProperty("HVN")
    public Hvn getHvn() {
        return hvn;
    }

    @JsonProperty("HVN")
    public void setHvn(Hvn hvn) {
        this.hvn = hvn;
    }

    @JsonProperty("HYDRO")
    public Hydro getHydro() {
        return hydro;
    }

    @JsonProperty("HYDRO")
    public void setHydro(Hydro hydro) {
        this.hydro = hydro;
    }

    @JsonProperty("HYT")
    public Hyt getHyt() {
        return hyt;
    }

    @JsonProperty("HYT")
    public void setHyt(Hyt hyt) {
        this.hyt = hyt;
    }

    @JsonProperty("ICHX")
    public Ichx getIchx() {
        return ichx;
    }

    @JsonProperty("ICHX")
    public void setIchx(Ichx ichx) {
        this.ichx = ichx;
    }

    @JsonProperty("ICN")
    public Icn getIcn() {
        return icn;
    }

    @JsonProperty("ICN")
    public void setIcn(Icn icn) {
        this.icn = icn;
    }

    @JsonProperty("ICON")
    public Icon getIcon() {
        return icon;
    }

    @JsonProperty("ICON")
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @JsonProperty("IDEX")
    public Idex getIdex() {
        return idex;
    }

    @JsonProperty("IDEX")
    public void setIdex(Idex idex) {
        this.idex = idex;
    }

    @JsonProperty("IDH")
    public Idh getIdh() {
        return idh;
    }

    @JsonProperty("IDH")
    public void setIdh(Idh idh) {
        this.idh = idh;
    }

    @JsonProperty("IDT")
    public Idt getIdt() {
        return idt;
    }

    @JsonProperty("IDT")
    public void setIdt(Idt idt) {
        this.idt = idt;
    }

    @JsonProperty("IDXM")
    public Idxm getIdxm() {
        return idxm;
    }

    @JsonProperty("IDXM")
    public void setIdxm(Idxm idxm) {
        this.idxm = idxm;
    }

    @JsonProperty("IETH")
    public Ieth getIeth() {
        return ieth;
    }

    @JsonProperty("IETH")
    public void setIeth(Ieth ieth) {
        this.ieth = ieth;
    }

    @JsonProperty("IFT")
    public Ift getIft() {
        return ift;
    }

    @JsonProperty("IFT")
    public void setIft(Ift ift) {
        this.ift = ift;
    }

    @JsonProperty("IG")
    public Ig getIg() {
        return ig;
    }

    @JsonProperty("IG")
    public void setIg(Ig ig) {
        this.ig = ig;
    }

    @JsonProperty("IHF")
    public Ihf getIhf() {
        return ihf;
    }

    @JsonProperty("IHF")
    public void setIhf(Ihf ihf) {
        this.ihf = ihf;
    }

    @JsonProperty("IHT")
    public Iht getIht() {
        return iht;
    }

    @JsonProperty("IHT")
    public void setIht(Iht iht) {
        this.iht = iht;
    }

    @JsonProperty("IMT")
    public Imt getImt() {
        return imt;
    }

    @JsonProperty("IMT")
    public void setImt(Imt imt) {
        this.imt = imt;
    }

    @JsonProperty("IND")
    public Ind getInd() {
        return ind;
    }

    @JsonProperty("IND")
    public void setInd(Ind ind) {
        this.ind = ind;
    }

    @JsonProperty("ING")
    public Ing getIng() {
        return ing;
    }

    @JsonProperty("ING")
    public void setIng(Ing ing) {
        this.ing = ing;
    }

    @JsonProperty("INS")
    public Ins getIns() {
        return ins;
    }

    @JsonProperty("INS")
    public void setIns(Ins ins) {
        this.ins = ins;
    }

    @JsonProperty("INSTAR")
    public Instar getInstar() {
        return instar;
    }

    @JsonProperty("INSTAR")
    public void setInstar(Instar instar) {
        this.instar = instar;
    }

    @JsonProperty("INT")
    public Int getInt() {
        return _int;
    }

    @JsonProperty("INT")
    public void setInt(Int _int) {
        this._int = _int;
    }

    @JsonProperty("INVC")
    public Invc getInvc() {
        return invc;
    }

    @JsonProperty("INVC")
    public void setInvc(Invc invc) {
        this.invc = invc;
    }

    @JsonProperty("INX")
    public Inx getInx() {
        return inx;
    }

    @JsonProperty("INX")
    public void setInx(Inx inx) {
        this.inx = inx;
    }

    @JsonProperty("INXT")
    public Inxt getInxt() {
        return inxt;
    }

    @JsonProperty("INXT")
    public void setInxt(Inxt inxt) {
        this.inxt = inxt;
    }

    @JsonProperty("IOST")
    public Iost getIost() {
        return iost;
    }

    @JsonProperty("IOST")
    public void setIost(Iost iost) {
        this.iost = iost;
    }

    @JsonProperty("IOTX")
    public Iotx getIotx() {
        return iotx;
    }

    @JsonProperty("IOTX")
    public void setIotx(Iotx iotx) {
        this.iotx = iotx;
    }

    @JsonProperty("IPC")
    public Ipc getIpc() {
        return ipc;
    }

    @JsonProperty("IPC")
    public void setIpc(Ipc ipc) {
        this.ipc = ipc;
    }

    @JsonProperty("IPSX")
    public Ipsx getIpsx() {
        return ipsx;
    }

    @JsonProperty("IPSX")
    public void setIpsx(Ipsx ipsx) {
        this.ipsx = ipsx;
    }

    @JsonProperty("IQN")
    public Iqn getIqn() {
        return iqn;
    }

    @JsonProperty("IQN")
    public void setIqn(Iqn iqn) {
        this.iqn = iqn;
    }

    @JsonProperty("ISR")
    public Isr getIsr() {
        return isr;
    }

    @JsonProperty("ISR")
    public void setIsr(Isr isr) {
        this.isr = isr;
    }

    @JsonProperty("ITC")
    public Itc getItc() {
        return itc;
    }

    @JsonProperty("ITC")
    public void setItc(Itc itc) {
        this.itc = itc;
    }

    @JsonProperty("ITL")
    public Itl getItl() {
        return itl;
    }

    @JsonProperty("ITL")
    public void setItl(Itl itl) {
        this.itl = itl;
    }

    @JsonProperty("ITT")
    public Itt getItt() {
        return itt;
    }

    @JsonProperty("ITT")
    public void setItt(Itt itt) {
        this.itt = itt;
    }

    @JsonProperty("IVY")
    public Ivy getIvy() {
        return ivy;
    }

    @JsonProperty("IVY")
    public void setIvy(Ivy ivy) {
        this.ivy = ivy;
    }

    @JsonProperty("IXT")
    public Ixt getIxt() {
        return ixt;
    }

    @JsonProperty("IXT")
    public void setIxt(Ixt ixt) {
        this.ixt = ixt;
    }

    @JsonProperty("J8T")
    public J8t getJ8t() {
        return j8t;
    }

    @JsonProperty("J8T")
    public void setJ8t(J8t j8t) {
        this.j8t = j8t;
    }

    @JsonProperty("JC")
    public Jc getJc() {
        return jc;
    }

    @JsonProperty("JC")
    public void setJc(Jc jc) {
        this.jc = jc;
    }

    @JsonProperty("JET")
    public Jet getJet() {
        return jet;
    }

    @JsonProperty("JET")
    public void setJet(Jet jet) {
        this.jet = jet;
    }

    @JsonProperty("JNT")
    public Jnt getJnt() {
        return jnt;
    }

    @JsonProperty("JNT")
    public void setJnt(Jnt jnt) {
        this.jnt = jnt;
    }

    @JsonProperty("JOINT")
    public Joint getJoint() {
        return joint;
    }

    @JsonProperty("JOINT")
    public void setJoint(Joint joint) {
        this.joint = joint;
    }

    @JsonProperty("JSE")
    public Jse getJse() {
        return jse;
    }

    @JsonProperty("JSE")
    public void setJse(Jse jse) {
        this.jse = jse;
    }

    @JsonProperty("KAN")
    public Kan getKan() {
        return kan;
    }

    @JsonProperty("KAN")
    public void setKan(Kan kan) {
        this.kan = kan;
    }

    @JsonProperty("KBC")
    public Kbc getKbc() {
        return kbc;
    }

    @JsonProperty("KBC")
    public void setKbc(Kbc kbc) {
        this.kbc = kbc;
    }

    @JsonProperty("KCASH")
    public Kcash getKcash() {
        return kcash;
    }

    @JsonProperty("KCASH")
    public void setKcash(Kcash kcash) {
        this.kcash = kcash;
    }

    @JsonProperty("KCS")
    public Kcs getKcs() {
        return kcs;
    }

    @JsonProperty("KCS")
    public void setKcs(Kcs kcs) {
        this.kcs = kcs;
    }

    @JsonProperty("KEY")
    public Key getKey() {
        return key;
    }

    @JsonProperty("KEY")
    public void setKey(Key key) {
        this.key = key;
    }

    @JsonProperty("KICK")
    public Kick getKick() {
        return kick;
    }

    @JsonProperty("KICK")
    public void setKick(Kick kick) {
        this.kick = kick;
    }

    @JsonProperty("KIN")
    public Kin getKin() {
        return kin;
    }

    @JsonProperty("KIN")
    public void setKin(Kin kin) {
        this.kin = kin;
    }

    @JsonProperty("KIND")
    public Kind getKind() {
        return kind;
    }

    @JsonProperty("KIND")
    public void setKind(Kind kind) {
        this.kind = kind;
    }

    @JsonProperty("KNC")
    public Knc getKnc() {
        return knc;
    }

    @JsonProperty("KNC")
    public void setKnc(Knc knc) {
        this.knc = knc;
    }

    @JsonProperty("KRL")
    public Krl getKrl() {
        return krl;
    }

    @JsonProperty("KRL")
    public void setKrl(Krl krl) {
        this.krl = krl;
    }

    @JsonProperty("KUE")
    public Kue getKue() {
        return kue;
    }

    @JsonProperty("KUE")
    public void setKue(Kue kue) {
        this.kue = kue;
    }

    @JsonProperty("KWH")
    public Kwh getKwh() {
        return kwh;
    }

    @JsonProperty("KWH")
    public void setKwh(Kwh kwh) {
        this.kwh = kwh;
    }

    @JsonProperty("LA")
    public La getLa() {
        return la;
    }

    @JsonProperty("LA")
    public void setLa(La la) {
        this.la = la;
    }

    @JsonProperty("LALA")
    public Lala getLala() {
        return lala;
    }

    @JsonProperty("LALA")
    public void setLala(Lala lala) {
        this.lala = lala;
    }

    @JsonProperty("LAMB")
    public Lamb getLamb() {
        return lamb;
    }

    @JsonProperty("LAMB")
    public void setLamb(Lamb lamb) {
        this.lamb = lamb;
    }

    @JsonProperty("LATX")
    public Latx getLatx() {
        return latx;
    }

    @JsonProperty("LATX")
    public void setLatx(Latx latx) {
        this.latx = latx;
    }

    @JsonProperty("LCS")
    public Lcs getLcs() {
        return lcs;
    }

    @JsonProperty("LCS")
    public void setLcs(Lcs lcs) {
        this.lcs = lcs;
    }

    @JsonProperty("LDC")
    public Ldc getLdc() {
        return ldc;
    }

    @JsonProperty("LDC")
    public void setLdc(Ldc ldc) {
        this.ldc = ldc;
    }

    @JsonProperty("LEDU")
    public Ledu getLedu() {
        return ledu;
    }

    @JsonProperty("LEDU")
    public void setLedu(Ledu ledu) {
        this.ledu = ledu;
    }

    @JsonProperty("LEND")
    public Lend getLend() {
        return lend;
    }

    @JsonProperty("LEND")
    public void setLend(Lend lend) {
        this.lend = lend;
    }

    @JsonProperty("LEV")
    public Lev getLev() {
        return lev;
    }

    @JsonProperty("LEV")
    public void setLev(Lev lev) {
        this.lev = lev;
    }

    @JsonProperty("LGO")
    public Lgo getLgo() {
        return lgo;
    }

    @JsonProperty("LGO")
    public void setLgo(Lgo lgo) {
        this.lgo = lgo;
    }

    @JsonProperty("LIF")
    public Lif getLif() {
        return lif;
    }

    @JsonProperty("LIF")
    public void setLif(Lif lif) {
        this.lif = lif;
    }

    @JsonProperty("LIFE")
    public Life getLife() {
        return life;
    }

    @JsonProperty("LIFE")
    public void setLife(Life life) {
        this.life = life;
    }

    @JsonProperty("LIKE")
    public Like getLike() {
        return like;
    }

    @JsonProperty("LIKE")
    public void setLike(Like like) {
        this.like = like;
    }

    @JsonProperty("LINA")
    public Lina getLina() {
        return lina;
    }

    @JsonProperty("LINA")
    public void setLina(Lina lina) {
        this.lina = lina;
    }

    @JsonProperty("LINK")
    public Link getLink() {
        return link;
    }

    @JsonProperty("LINK")
    public void setLink(Link link) {
        this.link = link;
    }

    @JsonProperty("LION")
    public Lion getLion() {
        return lion;
    }

    @JsonProperty("LION")
    public void setLion(Lion lion) {
        this.lion = lion;
    }

    @JsonProperty("LNC")
    public Lnc getLnc() {
        return lnc;
    }

    @JsonProperty("LNC")
    public void setLnc(Lnc lnc) {
        this.lnc = lnc;
    }

    @JsonProperty("LND")
    public Lnd getLnd() {
        return lnd;
    }

    @JsonProperty("LND")
    public void setLnd(Lnd lnd) {
        this.lnd = lnd;
    }

    @JsonProperty("LOCI")
    public Loci getLoci() {
        return loci;
    }

    @JsonProperty("LOCI")
    public void setLoci(Loci loci) {
        this.loci = loci;
    }

    @JsonProperty("LOCK")
    public Lock getLock() {
        return lock;
    }

    @JsonProperty("LOCK")
    public void setLock(Lock lock) {
        this.lock = lock;
    }

    @JsonProperty("LOOM")
    public Loom getLoom() {
        return loom;
    }

    @JsonProperty("LOOM")
    public void setLoom(Loom loom) {
        this.loom = loom;
    }

    @JsonProperty("LPT")
    public Lpt getLpt() {
        return lpt;
    }

    @JsonProperty("LPT")
    public void setLpt(Lpt lpt) {
        this.lpt = lpt;
    }

    @JsonProperty("LQDN")
    public Lqdn getLqdn() {
        return lqdn;
    }

    @JsonProperty("LQDN")
    public void setLqdn(Lqdn lqdn) {
        this.lqdn = lqdn;
    }

    @JsonProperty("LRC")
    public Lrc getLrc() {
        return lrc;
    }

    @JsonProperty("LRC")
    public void setLrc(Lrc lrc) {
        this.lrc = lrc;
    }

    @JsonProperty("LST")
    public Lst getLst() {
        return lst;
    }

    @JsonProperty("LST")
    public void setLst(Lst lst) {
        this.lst = lst;
    }

    @JsonProperty("LTC")
    public Ltc getLtc() {
        return ltc;
    }

    @JsonProperty("LTC")
    public void setLtc(Ltc ltc) {
        this.ltc = ltc;
    }

    @JsonProperty("LTO")
    public Lto getLto() {
        return lto;
    }

    @JsonProperty("LTO")
    public void setLto(Lto lto) {
        this.lto = lto;
    }

    @JsonProperty("LUC")
    public Luc getLuc() {
        return luc;
    }

    @JsonProperty("LUC")
    public void setLuc(Luc luc) {
        this.luc = luc;
    }

    @JsonProperty("LUN")
    public Lun getLun() {
        return lun;
    }

    @JsonProperty("LUN")
    public void setLun(Lun lun) {
        this.lun = lun;
    }

    @JsonProperty("LYM")
    public Lym getLym() {
        return lym;
    }

    @JsonProperty("LYM")
    public void setLym(Lym lym) {
        this.lym = lym;
    }

    @JsonProperty("M2O")
    public M2o getM2o() {
        return m2o;
    }

    @JsonProperty("M2O")
    public void setM2o(M2o m2o) {
        this.m2o = m2o;
    }

    @JsonProperty("MANA")
    public Mana getMana() {
        return mana;
    }

    @JsonProperty("MANA")
    public void setMana(Mana mana) {
        this.mana = mana;
    }

    @JsonProperty("MATIC")
    public Matic getMatic() {
        return matic;
    }

    @JsonProperty("MATIC")
    public void setMatic(Matic matic) {
        this.matic = matic;
    }

    @JsonProperty("MBTX")
    public Mbtx getMbtx() {
        return mbtx;
    }

    @JsonProperty("MBTX")
    public void setMbtx(Mbtx mbtx) {
        this.mbtx = mbtx;
    }

    @JsonProperty("MCO")
    public Mco getMco() {
        return mco;
    }

    @JsonProperty("MCO")
    public void setMco(Mco mco) {
        this.mco = mco;
    }

    @JsonProperty("MDA")
    public Mda getMda() {
        return mda;
    }

    @JsonProperty("MDA")
    public void setMda(Mda mda) {
        this.mda = mda;
    }

    @JsonProperty("MDCL")
    public Mdcl getMdcl() {
        return mdcl;
    }

    @JsonProperty("MDCL")
    public void setMdcl(Mdcl mdcl) {
        this.mdcl = mdcl;
    }

    @JsonProperty("MDS")
    public Mds getMds() {
        return mds;
    }

    @JsonProperty("MDS")
    public void setMds(Mds mds) {
        this.mds = mds;
    }

    @JsonProperty("MEDX")
    public Medx getMedx() {
        return medx;
    }

    @JsonProperty("MEDX")
    public void setMedx(Medx medx) {
        this.medx = medx;
    }

    @JsonProperty("MEE")
    public Mee getMee() {
        return mee;
    }

    @JsonProperty("MEE")
    public void setMee(Mee mee) {
        this.mee = mee;
    }

    @JsonProperty("MENLO")
    public Menlo getMenlo() {
        return menlo;
    }

    @JsonProperty("MENLO")
    public void setMenlo(Menlo menlo) {
        this.menlo = menlo;
    }

    @JsonProperty("META")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("META")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("METAL")
    public Metal getMetal() {
        return metal;
    }

    @JsonProperty("METAL")
    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    @JsonProperty("METM")
    public Metm getMetm() {
        return metm;
    }

    @JsonProperty("METM")
    public void setMetm(Metm metm) {
        this.metm = metm;
    }

    @JsonProperty("MFG")
    public Mfg getMfg() {
        return mfg;
    }

    @JsonProperty("MFG")
    public void setMfg(Mfg mfg) {
        this.mfg = mfg;
    }

    @JsonProperty("MFT")
    public Mft getMft() {
        return mft;
    }

    @JsonProperty("MFT")
    public void setMft(Mft mft) {
        this.mft = mft;
    }

    @JsonProperty("MGO")
    public Mgo getMgo() {
        return mgo;
    }

    @JsonProperty("MGO")
    public void setMgo(Mgo mgo) {
        this.mgo = mgo;
    }

    @JsonProperty("MIC")
    public Mic getMic() {
        return mic;
    }

    @JsonProperty("MIC")
    public void setMic(Mic mic) {
        this.mic = mic;
    }

    @JsonProperty("MITH")
    public Mith getMith() {
        return mith;
    }

    @JsonProperty("MITH")
    public void setMith(Mith mith) {
        this.mith = mith;
    }

    @JsonProperty("MITX")
    public Mitx getMitx() {
        return mitx;
    }

    @JsonProperty("MITX")
    public void setMitx(Mitx mitx) {
        this.mitx = mitx;
    }

    @JsonProperty("MIXI")
    public Mixi getMixi() {
        return mixi;
    }

    @JsonProperty("MIXI")
    public void setMixi(Mixi mixi) {
        this.mixi = mixi;
    }

    @JsonProperty("MKR")
    public Mkr getMkr() {
        return mkr;
    }

    @JsonProperty("MKR")
    public void setMkr(Mkr mkr) {
        this.mkr = mkr;
    }

    @JsonProperty("MLN")
    public Mln getMln() {
        return mln;
    }

    @JsonProperty("MLN")
    public void setMln(Mln mln) {
        this.mln = mln;
    }

    @JsonProperty("MNC")
    public Mnc getMnc() {
        return mnc;
    }

    @JsonProperty("MNC")
    public void setMnc(Mnc mnc) {
        this.mnc = mnc;
    }

    @JsonProperty("MNE")
    public Mne getMne() {
        return mne;
    }

    @JsonProperty("MNE")
    public void setMne(Mne mne) {
        this.mne = mne;
    }

    @JsonProperty("MNTP")
    public Mntp getMntp() {
        return mntp;
    }

    @JsonProperty("MNTP")
    public void setMntp(Mntp mntp) {
        this.mntp = mntp;
    }

    @JsonProperty("MOAC")
    public Moac getMoac() {
        return moac;
    }

    @JsonProperty("MOAC")
    public void setMoac(Moac moac) {
        this.moac = moac;
    }

    @JsonProperty("MOF")
    public Mof getMof() {
        return mof;
    }

    @JsonProperty("MOF")
    public void setMof(Mof mof) {
        this.mof = mof;
    }

    @JsonProperty("MOLK")
    public Molk getMolk() {
        return molk;
    }

    @JsonProperty("MOLK")
    public void setMolk(Molk molk) {
        this.molk = molk;
    }

    @JsonProperty("MOT")
    public Mot getMot() {
        return mot;
    }

    @JsonProperty("MOT")
    public void setMot(Mot mot) {
        this.mot = mot;
    }

    @JsonProperty("MRK")
    public Mrk getMrk() {
        return mrk;
    }

    @JsonProperty("MRK")
    public void setMrk(Mrk mrk) {
        this.mrk = mrk;
    }

    @JsonProperty("MRPH")
    public Mrph getMrph() {
        return mrph;
    }

    @JsonProperty("MRPH")
    public void setMrph(Mrph mrph) {
        this.mrph = mrph;
    }

    @JsonProperty("MTC")
    public Mtc getMtc() {
        return mtc;
    }

    @JsonProperty("MTC")
    public void setMtc(Mtc mtc) {
        this.mtc = mtc;
    }

    @JsonProperty("MTH")
    public Mth getMth() {
        return mth;
    }

    @JsonProperty("MTH")
    public void setMth(Mth mth) {
        this.mth = mth;
    }

    @JsonProperty("MTKN")
    public Mtkn getMtkn() {
        return mtkn;
    }

    @JsonProperty("MTKN")
    public void setMtkn(Mtkn mtkn) {
        this.mtkn = mtkn;
    }

    @JsonProperty("MTRC")
    public Mtrc getMtrc() {
        return mtrc;
    }

    @JsonProperty("MTRC")
    public void setMtrc(Mtrc mtrc) {
        this.mtrc = mtrc;
    }

    @JsonProperty("MTX")
    public Mtx getMtx() {
        return mtx;
    }

    @JsonProperty("MTX")
    public void setMtx(Mtx mtx) {
        this.mtx = mtx;
    }

    @JsonProperty("MVL")
    public Mvl getMvl() {
        return mvl;
    }

    @JsonProperty("MVL")
    public void setMvl(Mvl mvl) {
        this.mvl = mvl;
    }

    @JsonProperty("MWAT")
    public Mwat getMwat() {
        return mwat;
    }

    @JsonProperty("MWAT")
    public void setMwat(Mwat mwat) {
        this.mwat = mwat;
    }

    @JsonProperty("MXAI")
    public Mxai getMxai() {
        return mxai;
    }

    @JsonProperty("MXAI")
    public void setMxai(Mxai mxai) {
        this.mxai = mxai;
    }

    @JsonProperty("MXM")
    public Mxm getMxm() {
        return mxm;
    }

    @JsonProperty("MXM")
    public void setMxm(Mxm mxm) {
        this.mxm = mxm;
    }

    @JsonProperty("MYB")
    public Myb getMyb() {
        return myb;
    }

    @JsonProperty("MYB")
    public void setMyb(Myb myb) {
        this.myb = myb;
    }

    @JsonProperty("MYST")
    public Myst getMyst() {
        return myst;
    }

    @JsonProperty("MYST")
    public void setMyst(Myst myst) {
        this.myst = myst;
    }

    @JsonProperty("NANJ")
    public Nanj getNanj() {
        return nanj;
    }

    @JsonProperty("NANJ")
    public void setNanj(Nanj nanj) {
        this.nanj = nanj;
    }

    @JsonProperty("NAS")
    public Nas getNas() {
        return nas;
    }

    @JsonProperty("NAS")
    public void setNas(Nas nas) {
        this.nas = nas;
    }

    @JsonProperty("NAVI")
    public Navi getNavi() {
        return navi;
    }

    @JsonProperty("NAVI")
    public void setNavi(Navi navi) {
        this.navi = navi;
    }

    @JsonProperty("NBAI")
    public Nbai getNbai() {
        return nbai;
    }

    @JsonProperty("NBAI")
    public void setNbai(Nbai nbai) {
        this.nbai = nbai;
    }

    @JsonProperty("NBC")
    public Nbc getNbc() {
        return nbc;
    }

    @JsonProperty("NBC")
    public void setNbc(Nbc nbc) {
        this.nbc = nbc;
    }

    @JsonProperty("NCASH")
    public Ncash getNcash() {
        return ncash;
    }

    @JsonProperty("NCASH")
    public void setNcash(Ncash ncash) {
        this.ncash = ncash;
    }

    @JsonProperty("NCC")
    public Ncc getNcc() {
        return ncc;
    }

    @JsonProperty("NCC")
    public void setNcc(Ncc ncc) {
        this.ncc = ncc;
    }

    @JsonProperty("NCT")
    public Nct getNct() {
        return nct;
    }

    @JsonProperty("NCT")
    public void setNct(Nct nct) {
        this.nct = nct;
    }

    @JsonProperty("NEC")
    public Nec getNec() {
        return nec;
    }

    @JsonProperty("NEC")
    public void setNec(Nec nec) {
        this.nec = nec;
    }

    @JsonProperty("NEU")
    public Neu getNeu() {
        return neu;
    }

    @JsonProperty("NEU")
    public void setNeu(Neu neu) {
        this.neu = neu;
    }

    @JsonProperty("NEXO")
    public Nexo getNexo() {
        return nexo;
    }

    @JsonProperty("NEXO")
    public void setNexo(Nexo nexo) {
        this.nexo = nexo;
    }

    @JsonProperty("NEXT")
    public Next getNext() {
        return next;
    }

    @JsonProperty("NEXT")
    public void setNext(Next next) {
        this.next = next;
    }

    @JsonProperty("NGC")
    public Ngc getNgc() {
        return ngc;
    }

    @JsonProperty("NGC")
    public void setNgc(Ngc ngc) {
        this.ngc = ngc;
    }

    @JsonProperty("NIO")
    public Nio getNio() {
        return nio;
    }

    @JsonProperty("NIO")
    public void setNio(Nio nio) {
        this.nio = nio;
    }

    @JsonProperty("NMR")
    public Nmr getNmr() {
        return nmr;
    }

    @JsonProperty("NMR")
    public void setNmr(Nmr nmr) {
        this.nmr = nmr;
    }

    @JsonProperty("NOAH")
    public Noah getNoah() {
        return noah;
    }

    @JsonProperty("NOAH")
    public void setNoah(Noah noah) {
        this.noah = noah;
    }

    @JsonProperty("NOBS")
    public Nobs getNobs() {
        return nobs;
    }

    @JsonProperty("NOBS")
    public void setNobs(Nobs nobs) {
        this.nobs = nobs;
    }

    @JsonProperty("NOKU")
    public Noku getNoku() {
        return noku;
    }

    @JsonProperty("NOKU")
    public void setNoku(Noku noku) {
        this.noku = noku;
    }

    @JsonProperty("NOX")
    public Nox getNox() {
        return nox;
    }

    @JsonProperty("NOX")
    public void setNox(Nox nox) {
        this.nox = nox;
    }

    @JsonProperty("NPER")
    public Nper getNper() {
        return nper;
    }

    @JsonProperty("NPER")
    public void setNper(Nper nper) {
        this.nper = nper;
    }

    @JsonProperty("NPX")
    public Npx getNpx() {
        return npx;
    }

    @JsonProperty("NPX")
    public void setNpx(Npx npx) {
        this.npx = npx;
    }

    @JsonProperty("NPXS")
    public Npxs getNpxs() {
        return npxs;
    }

    @JsonProperty("NPXS")
    public void setNpxs(Npxs npxs) {
        this.npxs = npxs;
    }

    @JsonProperty("NRG")
    public Nrg getNrg() {
        return nrg;
    }

    @JsonProperty("NRG")
    public void setNrg(Nrg nrg) {
        this.nrg = nrg;
    }

    @JsonProperty("NRP")
    public Nrp getNrp() {
        return nrp;
    }

    @JsonProperty("NRP")
    public void setNrp(Nrp nrp) {
        this.nrp = nrp;
    }

    @JsonProperty("NTK")
    public Ntk getNtk() {
        return ntk;
    }

    @JsonProperty("NTK")
    public void setNtk(Ntk ntk) {
        this.ntk = ntk;
    }

    @JsonProperty("NULS")
    public Nuls getNuls() {
        return nuls;
    }

    @JsonProperty("NULS")
    public void setNuls(Nuls nuls) {
        this.nuls = nuls;
    }

    @JsonProperty("NXC")
    public Nxc getNxc() {
        return nxc;
    }

    @JsonProperty("NXC")
    public void setNxc(Nxc nxc) {
        this.nxc = nxc;
    }

    @JsonProperty("OAX")
    public Oax getOax() {
        return oax;
    }

    @JsonProperty("OAX")
    public void setOax(Oax oax) {
        this.oax = oax;
    }

    @JsonProperty("OCN")
    public Ocn getOcn() {
        return ocn;
    }

    @JsonProperty("OCN")
    public void setOcn(Ocn ocn) {
        this.ocn = ocn;
    }

    @JsonProperty("ODE")
    public Ode getOde() {
        return ode;
    }

    @JsonProperty("ODE")
    public void setOde(Ode ode) {
        this.ode = ode;
    }

    @JsonProperty("OIO")
    public Oio getOio() {
        return oio;
    }

    @JsonProperty("OIO")
    public void setOio(Oio oio) {
        this.oio = oio;
    }

    @JsonProperty("OKB")
    public Okb getOkb() {
        return okb;
    }

    @JsonProperty("OKB")
    public void setOkb(Okb okb) {
        this.okb = okb;
    }

    @JsonProperty("OLE")
    public Ole getOle() {
        return ole;
    }

    @JsonProperty("OLE")
    public void setOle(Ole ole) {
        this.ole = ole;
    }

    @JsonProperty("OLT")
    public Olt getOlt() {
        return olt;
    }

    @JsonProperty("OLT")
    public void setOlt(Olt olt) {
        this.olt = olt;
    }

    @JsonProperty("OMG")
    public Omg getOmg() {
        return omg;
    }

    @JsonProperty("OMG")
    public void setOmg(Omg omg) {
        this.omg = omg;
    }

    @JsonProperty("OMX")
    public Omx getOmx() {
        return omx;
    }

    @JsonProperty("OMX")
    public void setOmx(Omx omx) {
        this.omx = omx;
    }

    @JsonProperty("ONG")
    public Ong getOng() {
        return ong;
    }

    @JsonProperty("ONG")
    public void setOng(Ong ong) {
        this.ong = ong;
    }

    @JsonProperty("ONL")
    public Onl getOnl() {
        return onl;
    }

    @JsonProperty("ONL")
    public void setOnl(Onl onl) {
        this.onl = onl;
    }

    @JsonProperty("OPEN")
    public Open getOpen() {
        return open;
    }

    @JsonProperty("OPEN")
    public void setOpen(Open open) {
        this.open = open;
    }

    @JsonProperty("OPT")
    public Opt getOpt() {
        return opt;
    }

    @JsonProperty("OPT")
    public void setOpt(Opt opt) {
        this.opt = opt;
    }

    @JsonProperty("ORBS")
    public Orbs getOrbs() {
        return orbs;
    }

    @JsonProperty("ORBS")
    public void setOrbs(Orbs orbs) {
        this.orbs = orbs;
    }

    @JsonProperty("ORI")
    public Ori getOri() {
        return ori;
    }

    @JsonProperty("ORI")
    public void setOri(Ori ori) {
        this.ori = ori;
    }

    @JsonProperty("ORME")
    public Orme getOrme() {
        return orme;
    }

    @JsonProperty("ORME")
    public void setOrme(Orme orme) {
        this.orme = orme;
    }

    @JsonProperty("ORS")
    public Ors getOrs() {
        return ors;
    }

    @JsonProperty("ORS")
    public void setOrs(Ors ors) {
        this.ors = ors;
    }

    @JsonProperty("OSA")
    public Osa getOsa() {
        return osa;
    }

    @JsonProperty("OSA")
    public void setOsa(Osa osa) {
        this.osa = osa;
    }

    @JsonProperty("OST")
    public Ost getOst() {
        return ost;
    }

    @JsonProperty("OST")
    public void setOst(Ost ost) {
        this.ost = ost;
    }

    @JsonProperty("PAL")
    public Pal getPal() {
        return pal;
    }

    @JsonProperty("PAL")
    public void setPal(Pal pal) {
        this.pal = pal;
    }

    @JsonProperty("PARETO")
    public Pareto getPareto() {
        return pareto;
    }

    @JsonProperty("PARETO")
    public void setPareto(Pareto pareto) {
        this.pareto = pareto;
    }

    @JsonProperty("PASS")
    public Pass getPass() {
        return pass;
    }

    @JsonProperty("PASS")
    public void setPass(Pass pass) {
        this.pass = pass;
    }

    @JsonProperty("PAT")
    public Pat getPat() {
        return pat;
    }

    @JsonProperty("PAT")
    public void setPat(Pat pat) {
        this.pat = pat;
    }

    @JsonProperty("PAX")
    public Pax getPax() {
        return pax;
    }

    @JsonProperty("PAX")
    public void setPax(Pax pax) {
        this.pax = pax;
    }

    @JsonProperty("PAY")
    public Pay getPay() {
        return pay;
    }

    @JsonProperty("PAY")
    public void setPay(Pay pay) {
        this.pay = pay;
    }

    @JsonProperty("PCH")
    public Pch getPch() {
        return pch;
    }

    @JsonProperty("PCH")
    public void setPch(Pch pch) {
        this.pch = pch;
    }

    @JsonProperty("PCL")
    public Pcl getPcl() {
        return pcl;
    }

    @JsonProperty("PCL")
    public void setPcl(Pcl pcl) {
        this.pcl = pcl;
    }

    @JsonProperty("PCO")
    public Pco getPco() {
        return pco;
    }

    @JsonProperty("PCO")
    public void setPco(Pco pco) {
        this.pco = pco;
    }

    @JsonProperty("PFR")
    public Pfr getPfr() {
        return pfr;
    }

    @JsonProperty("PFR")
    public void setPfr(Pfr pfr) {
        this.pfr = pfr;
    }

    @JsonProperty("PHI")
    public Phi getPhi() {
        return phi;
    }

    @JsonProperty("PHI")
    public void setPhi(Phi phi) {
        this.phi = phi;
    }

    @JsonProperty("PIX")
    public Pix getPix() {
        return pix;
    }

    @JsonProperty("PIX")
    public void setPix(Pix pix) {
        this.pix = pix;
    }

    @JsonProperty("PKT")
    public Pkt getPkt() {
        return pkt;
    }

    @JsonProperty("PKT")
    public void setPkt(Pkt pkt) {
        this.pkt = pkt;
    }

    @JsonProperty("PLA")
    public Pla getPla() {
        return pla;
    }

    @JsonProperty("PLA")
    public void setPla(Pla pla) {
        this.pla = pla;
    }

    @JsonProperty("PLAY")
    public Play getPlay() {
        return play;
    }

    @JsonProperty("PLAY")
    public void setPlay(Play play) {
        this.play = play;
    }

    @JsonProperty("PLBT")
    public Plbt getPlbt() {
        return plbt;
    }

    @JsonProperty("PLBT")
    public void setPlbt(Plbt plbt) {
        this.plbt = plbt;
    }

    @JsonProperty("PLR")
    public Plr getPlr() {
        return plr;
    }

    @JsonProperty("PLR")
    public void setPlr(Plr plr) {
        this.plr = plr;
    }

    @JsonProperty("PLU")
    public Plu getPlu() {
        return plu;
    }

    @JsonProperty("PLU")
    public void setPlu(Plu plu) {
        this.plu = plu;
    }

    @JsonProperty("PMA")
    public Pma getPma() {
        return pma;
    }

    @JsonProperty("PMA")
    public void setPma(Pma pma) {
        this.pma = pma;
    }

    @JsonProperty("PMNT")
    public Pmnt getPmnt() {
        return pmnt;
    }

    @JsonProperty("PMNT")
    public void setPmnt(Pmnt pmnt) {
        this.pmnt = pmnt;
    }

    @JsonProperty("PNT")
    public Pnt getPnt() {
        return pnt;
    }

    @JsonProperty("PNT")
    public void setPnt(Pnt pnt) {
        this.pnt = pnt;
    }

    @JsonProperty("POE")
    public Poe getPoe() {
        return poe;
    }

    @JsonProperty("POE")
    public void setPoe(Poe poe) {
        this.poe = poe;
    }

    @JsonProperty("POLL")
    public Poll getPoll() {
        return poll;
    }

    @JsonProperty("POLL")
    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @JsonProperty("POLY")
    public Poly getPoly() {
        return poly;
    }

    @JsonProperty("POLY")
    public void setPoly(Poly poly) {
        this.poly = poly;
    }

    @JsonProperty("POWR")
    public Powr getPowr() {
        return powr;
    }

    @JsonProperty("POWR")
    public void setPowr(Powr powr) {
        this.powr = powr;
    }

    @JsonProperty("PPP")
    public Ppp getPpp() {
        return ppp;
    }

    @JsonProperty("PPP")
    public void setPpp(Ppp ppp) {
        this.ppp = ppp;
    }

    @JsonProperty("PPT")
    public Ppt getPpt() {
        return ppt;
    }

    @JsonProperty("PPT")
    public void setPpt(Ppt ppt) {
        this.ppt = ppt;
    }

    @JsonProperty("PRA")
    public Pra getPra() {
        return pra;
    }

    @JsonProperty("PRA")
    public void setPra(Pra pra) {
        this.pra = pra;
    }

    @JsonProperty("PRG")
    public Prg getPrg() {
        return prg;
    }

    @JsonProperty("PRG")
    public void setPrg(Prg prg) {
        this.prg = prg;
    }

    @JsonProperty("PRIX")
    public Prix getPrix() {
        return prix;
    }

    @JsonProperty("PRIX")
    public void setPrix(Prix prix) {
        this.prix = prix;
    }

    @JsonProperty("PRO")
    public Pro getPro() {
        return pro;
    }

    @JsonProperty("PRO")
    public void setPro(Pro pro) {
        this.pro = pro;
    }

    @JsonProperty("PSM")
    public Psm getPsm() {
        return psm;
    }

    @JsonProperty("PSM")
    public void setPsm(Psm psm) {
        this.psm = psm;
    }

    @JsonProperty("PST")
    public Pst getPst() {
        return pst;
    }

    @JsonProperty("PST")
    public void setPst(Pst pst) {
        this.pst = pst;
    }

    @JsonProperty("PTOY")
    public Ptoy getPtoy() {
        return ptoy;
    }

    @JsonProperty("PTOY")
    public void setPtoy(Ptoy ptoy) {
        this.ptoy = ptoy;
    }

    @JsonProperty("PXG")
    public Pxg getPxg() {
        return pxg;
    }

    @JsonProperty("PXG")
    public void setPxg(Pxg pxg) {
        this.pxg = pxg;
    }

    @JsonProperty("PYLNT")
    public Pylnt getPylnt() {
        return pylnt;
    }

    @JsonProperty("PYLNT")
    public void setPylnt(Pylnt pylnt) {
        this.pylnt = pylnt;
    }

    @JsonProperty("PYN")
    public Pyn getPyn() {
        return pyn;
    }

    @JsonProperty("PYN")
    public void setPyn(Pyn pyn) {
        this.pyn = pyn;
    }

    @JsonProperty("QASH")
    public Qash getQash() {
        return qash;
    }

    @JsonProperty("QASH")
    public void setQash(Qash qash) {
        this.qash = qash;
    }

    @JsonProperty("QBIT")
    public Qbit getQbit() {
        return qbit;
    }

    @JsonProperty("QBIT")
    public void setQbit(Qbit qbit) {
        this.qbit = qbit;
    }

    @JsonProperty("QCX")
    public Qcx getQcx() {
        return qcx;
    }

    @JsonProperty("QCX")
    public void setQcx(Qcx qcx) {
        this.qcx = qcx;
    }

    @JsonProperty("QKC")
    public Qkc getQkc() {
        return qkc;
    }

    @JsonProperty("QKC")
    public void setQkc(Qkc qkc) {
        this.qkc = qkc;
    }

    @JsonProperty("QNTU")
    public Qntu getQntu() {
        return qntu;
    }

    @JsonProperty("QNTU")
    public void setQntu(Qntu qntu) {
        this.qntu = qntu;
    }

    @JsonProperty("QSP")
    public Qsp getQsp() {
        return qsp;
    }

    @JsonProperty("QSP")
    public void setQsp(Qsp qsp) {
        this.qsp = qsp;
    }

    @JsonProperty("QUANT")
    public Quant getQuant() {
        return quant;
    }

    @JsonProperty("QUANT")
    public void setQuant(Quant quant) {
        this.quant = quant;
    }

    @JsonProperty("QUN")
    public Qun getQun() {
        return qun;
    }

    @JsonProperty("QUN")
    public void setQun(Qun qun) {
        this.qun = qun;
    }

    @JsonProperty("QUSD")
    public Qusd getQusd() {
        return qusd;
    }

    @JsonProperty("QUSD")
    public void setQusd(Qusd qusd) {
        this.qusd = qusd;
    }

    @JsonProperty("R")
    public R getR() {
        return r;
    }

    @JsonProperty("R")
    public void setR(R r) {
        this.r = r;
    }

    @JsonProperty("RCN")
    public Rcn getRcn() {
        return rcn;
    }

    @JsonProperty("RCN")
    public void setRcn(Rcn rcn) {
        this.rcn = rcn;
    }

    @JsonProperty("RCT")
    public Rct getRct() {
        return rct;
    }

    @JsonProperty("RCT")
    public void setRct(Rct rct) {
        this.rct = rct;
    }

    @JsonProperty("RDC")
    public Rdc getRdc() {
        return rdc;
    }

    @JsonProperty("RDC")
    public void setRdc(Rdc rdc) {
        this.rdc = rdc;
    }

    @JsonProperty("RDD")
    public Rdd getRdd() {
        return rdd;
    }

    @JsonProperty("RDD")
    public void setRdd(Rdd rdd) {
        this.rdd = rdd;
    }

    @JsonProperty("REAL")
    public Real getReal() {
        return real;
    }

    @JsonProperty("REAL")
    public void setReal(Real real) {
        this.real = real;
    }

    @JsonProperty("REBL")
    public Rebl getRebl() {
        return rebl;
    }

    @JsonProperty("REBL")
    public void setRebl(Rebl rebl) {
        this.rebl = rebl;
    }

    @JsonProperty("REF")
    public Ref getRef() {
        return ref;
    }

    @JsonProperty("REF")
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    @JsonProperty("REM")
    public Rem getRem() {
        return rem;
    }

    @JsonProperty("REM")
    public void setRem(Rem rem) {
        this.rem = rem;
    }

    @JsonProperty("REP")
    public Rep getRep() {
        return rep;
    }

    @JsonProperty("REP")
    public void setRep(Rep rep) {
        this.rep = rep;
    }

    @JsonProperty("REQ")
    public Req getReq() {
        return req;
    }

    @JsonProperty("REQ")
    public void setReq(Req req) {
        this.req = req;
    }

    @JsonProperty("REX")
    public Rex getRex() {
        return rex;
    }

    @JsonProperty("REX")
    public void setRex(Rex rex) {
        this.rex = rex;
    }

    @JsonProperty("RFR")
    public Rfr getRfr() {
        return rfr;
    }

    @JsonProperty("RFR")
    public void setRfr(Rfr rfr) {
        this.rfr = rfr;
    }

    @JsonProperty("RHOC")
    public Rhoc getRhoc() {
        return rhoc;
    }

    @JsonProperty("RHOC")
    public void setRhoc(Rhoc rhoc) {
        this.rhoc = rhoc;
    }

    @JsonProperty("RIYA")
    public Riya getRiya() {
        return riya;
    }

    @JsonProperty("RIYA")
    public void setRiya(Riya riya) {
        this.riya = riya;
    }

    @JsonProperty("RLC")
    public Rlc getRlc() {
        return rlc;
    }

    @JsonProperty("RLC")
    public void setRlc(Rlc rlc) {
        this.rlc = rlc;
    }

    @JsonProperty("RLX")
    public Rlx getRlx() {
        return rlx;
    }

    @JsonProperty("RLX")
    public void setRlx(Rlx rlx) {
        this.rlx = rlx;
    }

    @JsonProperty("RMESH")
    public Rmesh getRmesh() {
        return rmesh;
    }

    @JsonProperty("RMESH")
    public void setRmesh(Rmesh rmesh) {
        this.rmesh = rmesh;
    }

    @JsonProperty("RNT")
    public Rnt getRnt() {
        return rnt;
    }

    @JsonProperty("RNT")
    public void setRnt(Rnt rnt) {
        this.rnt = rnt;
    }

    @JsonProperty("RNTB")
    public Rntb getRntb() {
        return rntb;
    }

    @JsonProperty("RNTB")
    public void setRntb(Rntb rntb) {
        this.rntb = rntb;
    }

    @JsonProperty("ROBET")
    public Robet getRobet() {
        return robet;
    }

    @JsonProperty("ROBET")
    public void setRobet(Robet robet) {
        this.robet = robet;
    }

    @JsonProperty("ROCK")
    public Rock getRock() {
        return rock;
    }

    @JsonProperty("ROCK")
    public void setRock(Rock rock) {
        this.rock = rock;
    }

    @JsonProperty("ROX")
    public Rox getRox() {
        return rox;
    }

    @JsonProperty("ROX")
    public void setRox(Rox rox) {
        this.rox = rox;
    }

    @JsonProperty("RRC")
    public Rrc getRrc() {
        return rrc;
    }

    @JsonProperty("RRC")
    public void setRrc(Rrc rrc) {
        this.rrc = rrc;
    }

    @JsonProperty("RTE")
    public Rte getRte() {
        return rte;
    }

    @JsonProperty("RTE")
    public void setRte(Rte rte) {
        this.rte = rte;
    }

    @JsonProperty("RUFF")
    public Ruff getRuff() {
        return ruff;
    }

    @JsonProperty("RUFF")
    public void setRuff(Ruff ruff) {
        this.ruff = ruff;
    }

    @JsonProperty("RVT")
    public Rvt getRvt() {
        return rvt;
    }

    @JsonProperty("RVT")
    public void setRvt(Rvt rvt) {
        this.rvt = rvt;
    }

    @JsonProperty("SAL")
    public Sal getSal() {
        return sal;
    }

    @JsonProperty("SAL")
    public void setSal(Sal sal) {
        this.sal = sal;
    }

    @JsonProperty("SALT")
    public Salt getSalt() {
        return salt;
    }

    @JsonProperty("SALT")
    public void setSalt(Salt salt) {
        this.salt = salt;
    }

    @JsonProperty("SAN")
    public San getSan() {
        return san;
    }

    @JsonProperty("SAN")
    public void setSan(San san) {
        this.san = san;
    }

    @JsonProperty("SCC")
    public Scc getScc() {
        return scc;
    }

    @JsonProperty("SCC")
    public void setScc(Scc scc) {
        this.scc = scc;
    }

    @JsonProperty("SCL")
    public Scl getScl() {
        return scl;
    }

    @JsonProperty("SCL")
    public void setScl(Scl scl) {
        this.scl = scl;
    }

    @JsonProperty("SCRL")
    public Scrl getScrl() {
        return scrl;
    }

    @JsonProperty("SCRL")
    public void setScrl(Scrl scrl) {
        this.scrl = scrl;
    }

    @JsonProperty("SEAL")
    public Seal getSeal() {
        return seal;
    }

    @JsonProperty("SEAL")
    public void setSeal(Seal seal) {
        this.seal = seal;
    }

    @JsonProperty("SEELE")
    public Seele getSeele() {
        return seele;
    }

    @JsonProperty("SEELE")
    public void setSeele(Seele seele) {
        this.seele = seele;
    }

    @JsonProperty("SENC")
    public Senc getSenc() {
        return senc;
    }

    @JsonProperty("SENC")
    public void setSenc(Senc senc) {
        this.senc = senc;
    }

    @JsonProperty("SENT")
    public Sent getSent() {
        return sent;
    }

    @JsonProperty("SENT")
    public void setSent(Sent sent) {
        this.sent = sent;
    }

    @JsonProperty("SETH")
    public Seth getSeth() {
        return seth;
    }

    @JsonProperty("SETH")
    public void setSeth(Seth seth) {
        this.seth = seth;
    }

    @JsonProperty("SGN")
    public Sgn getSgn() {
        return sgn;
    }

    @JsonProperty("SGN")
    public void setSgn(Sgn sgn) {
        this.sgn = sgn;
    }

    @JsonProperty("SGR")
    public Sgr getSgr() {
        return sgr;
    }

    @JsonProperty("SGR")
    public void setSgr(Sgr sgr) {
        this.sgr = sgr;
    }

    @JsonProperty("SHE")
    public She getShe() {
        return she;
    }

    @JsonProperty("SHE")
    public void setShe(She she) {
        this.she = she;
    }

    @JsonProperty("SHIP")
    public Ship getShip() {
        return ship;
    }

    @JsonProperty("SHIP")
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @JsonProperty("SHOW")
    public Show getShow() {
        return show;
    }

    @JsonProperty("SHOW")
    public void setShow(Show show) {
        this.show = show;
    }

    @JsonProperty("SHP")
    public Shp getShp() {
        return shp;
    }

    @JsonProperty("SHP")
    public void setShp(Shp shp) {
        this.shp = shp;
    }

    @JsonProperty("SHPING")
    public Shping getShping() {
        return shping;
    }

    @JsonProperty("SHPING")
    public void setShping(Shping shping) {
        this.shping = shping;
    }

    @JsonProperty("SKIN")
    public Skin getSkin() {
        return skin;
    }

    @JsonProperty("SKIN")
    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    @JsonProperty("SKM")
    public Skm getSkm() {
        return skm;
    }

    @JsonProperty("SKM")
    public void setSkm(Skm skm) {
        this.skm = skm;
    }

    @JsonProperty("SKRB")
    public Skrb getSkrb() {
        return skrb;
    }

    @JsonProperty("SKRB")
    public void setSkrb(Skrb skrb) {
        this.skrb = skrb;
    }

    @JsonProperty("SLT")
    public Slt getSlt() {
        return slt;
    }

    @JsonProperty("SLT")
    public void setSlt(Slt slt) {
        this.slt = slt;
    }

    @JsonProperty("SMT")
    public Smt getSmt() {
        return smt;
    }

    @JsonProperty("SMT")
    public void setSmt(Smt smt) {
        this.smt = smt;
    }

    @JsonProperty("SNC")
    public Snc getSnc() {
        return snc;
    }

    @JsonProperty("SNC")
    public void setSnc(Snc snc) {
        this.snc = snc;
    }

    @JsonProperty("SNGLS")
    public Sngls getSngls() {
        return sngls;
    }

    @JsonProperty("SNGLS")
    public void setSngls(Sngls sngls) {
        this.sngls = sngls;
    }

    @JsonProperty("SNIP")
    public Snip getSnip() {
        return snip;
    }

    @JsonProperty("SNIP")
    public void setSnip(Snip snip) {
        this.snip = snip;
    }

    @JsonProperty("SNM")
    public Snm getSnm() {
        return snm;
    }

    @JsonProperty("SNM")
    public void setSnm(Snm snm) {
        this.snm = snm;
    }

    @JsonProperty("SNOV")
    public Snov getSnov() {
        return snov;
    }

    @JsonProperty("SNOV")
    public void setSnov(Snov snov) {
        this.snov = snov;
    }

    @JsonProperty("SNPC")
    public Snpc getSnpc() {
        return snpc;
    }

    @JsonProperty("SNPC")
    public void setSnpc(Snpc snpc) {
        this.snpc = snpc;
    }

    @JsonProperty("SNS")
    public Sns getSns() {
        return sns;
    }

    @JsonProperty("SNS")
    public void setSns(Sns sns) {
        this.sns = sns;
    }

    @JsonProperty("SNT")
    public Snt getSnt() {
        return snt;
    }

    @JsonProperty("SNT")
    public void setSnt(Snt snt) {
        this.snt = snt;
    }

    @JsonProperty("SNTR")
    public Sntr getSntr() {
        return sntr;
    }

    @JsonProperty("SNTR")
    public void setSntr(Sntr sntr) {
        this.sntr = sntr;
    }

    @JsonProperty("SNTVT")
    public Sntvt getSntvt() {
        return sntvt;
    }

    @JsonProperty("SNTVT")
    public void setSntvt(Sntvt sntvt) {
        this.sntvt = sntvt;
    }

    @JsonProperty("SNX")
    public Snx getSnx() {
        return snx;
    }

    @JsonProperty("SNX")
    public void setSnx(Snx snx) {
        this.snx = snx;
    }

    @JsonProperty("SOAR")
    public Soar getSoar() {
        return soar;
    }

    @JsonProperty("SOAR")
    public void setSoar(Soar soar) {
        this.soar = soar;
    }

    @JsonProperty("SOC")
    public Soc getSoc() {
        return soc;
    }

    @JsonProperty("SOC")
    public void setSoc(Soc soc) {
        this.soc = soc;
    }

    @JsonProperty("SOLVE")
    public Solve getSolve() {
        return solve;
    }

    @JsonProperty("SOLVE")
    public void setSolve(Solve solve) {
        this.solve = solve;
    }

    @JsonProperty("SOMA")
    public Soma getSoma() {
        return soma;
    }

    @JsonProperty("SOMA")
    public void setSoma(Soma soma) {
        this.soma = soma;
    }

    @JsonProperty("SPANK")
    public Spank getSpank() {
        return spank;
    }

    @JsonProperty("SPANK")
    public void setSpank(Spank spank) {
        this.spank = spank;
    }

    @JsonProperty("SPF")
    public Spf getSpf() {
        return spf;
    }

    @JsonProperty("SPF")
    public void setSpf(Spf spf) {
        this.spf = spf;
    }

    @JsonProperty("SPHTX")
    public Sphtx getSphtx() {
        return sphtx;
    }

    @JsonProperty("SPHTX")
    public void setSphtx(Sphtx sphtx) {
        this.sphtx = sphtx;
    }

    @JsonProperty("SPT")
    public Spt getSpt() {
        return spt;
    }

    @JsonProperty("SPT")
    public void setSpt(Spt spt) {
        this.spt = spt;
    }

    @JsonProperty("SPX")
    public Spx getSpx() {
        return spx;
    }

    @JsonProperty("SPX")
    public void setSpx(Spx spx) {
        this.spx = spx;
    }

    @JsonProperty("SRCH")
    public Srch getSrch() {
        return srch;
    }

    @JsonProperty("SRCH")
    public void setSrch(Srch srch) {
        this.srch = srch;
    }

    @JsonProperty("SRCOIN")
    public Srcoin getSrcoin() {
        return srcoin;
    }

    @JsonProperty("SRCOIN")
    public void setSrcoin(Srcoin srcoin) {
        this.srcoin = srcoin;
    }

    @JsonProperty("SRN")
    public Srn getSrn() {
        return srn;
    }

    @JsonProperty("SRN")
    public void setSrn(Srn srn) {
        this.srn = srn;
    }

    @JsonProperty("SS")
    public Ss getSs() {
        return ss;
    }

    @JsonProperty("SS")
    public void setSs(Ss ss) {
        this.ss = ss;
    }

    @JsonProperty("STAC")
    public Stac getStac() {
        return stac;
    }

    @JsonProperty("STAC")
    public void setStac(Stac stac) {
        this.stac = stac;
    }

    @JsonProperty("STACS")
    public Stacs getStacs() {
        return stacs;
    }

    @JsonProperty("STACS")
    public void setStacs(Stacs stacs) {
        this.stacs = stacs;
    }

    @JsonProperty("STAR")
    public Star getStar() {
        return star;
    }

    @JsonProperty("STAR")
    public void setStar(Star star) {
        this.star = star;
    }

    @JsonProperty("STASH")
    public Stash getStash() {
        return stash;
    }

    @JsonProperty("STASH")
    public void setStash(Stash stash) {
        this.stash = stash;
    }

    @JsonProperty("STC")
    public Stc getStc() {
        return stc;
    }

    @JsonProperty("STC")
    public void setStc(Stc stc) {
        this.stc = stc;
    }

    @JsonProperty("STK")
    public Stk getStk() {
        return stk;
    }

    @JsonProperty("STK")
    public void setStk(Stk stk) {
        this.stk = stk;
    }

    @JsonProperty("STORJ")
    public Storj getStorj() {
        return storj;
    }

    @JsonProperty("STORJ")
    public void setStorj(Storj storj) {
        this.storj = storj;
    }

    @JsonProperty("STORM")
    public Storm getStorm() {
        return storm;
    }

    @JsonProperty("STORM")
    public void setStorm(Storm storm) {
        this.storm = storm;
    }

    @JsonProperty("STQ")
    public Stq getStq() {
        return stq;
    }

    @JsonProperty("STQ")
    public void setStq(Stq stq) {
        this.stq = stq;
    }

    @JsonProperty("STU")
    public Stu getStu() {
        return stu;
    }

    @JsonProperty("STU")
    public void setStu(Stu stu) {
        this.stu = stu;
    }

    @JsonProperty("STX")
    public Stx getStx() {
        return stx;
    }

    @JsonProperty("STX")
    public void setStx(Stx stx) {
        this.stx = stx;
    }

    @JsonProperty("SUB")
    public Sub getSub() {
        return sub;
    }

    @JsonProperty("SUB")
    public void setSub(Sub sub) {
        this.sub = sub;
    }

    @JsonProperty("SUR")
    public Sur getSur() {
        return sur;
    }

    @JsonProperty("SUR")
    public void setSur(Sur sur) {
        this.sur = sur;
    }

    @JsonProperty("SUSD")
    public Susd getSusd() {
        return susd;
    }

    @JsonProperty("SUSD")
    public void setSusd(Susd susd) {
        this.susd = susd;
    }

    @JsonProperty("SVD")
    public Svd getSvd() {
        return svd;
    }

    @JsonProperty("SVD")
    public void setSvd(Svd svd) {
        this.svd = svd;
    }

    @JsonProperty("SWARM")
    public Swarm getSwarm() {
        return swarm;
    }

    @JsonProperty("SWARM")
    public void setSwarm(Swarm swarm) {
        this.swarm = swarm;
    }

    @JsonProperty("SWC")
    public Swc getSwc() {
        return swc;
    }

    @JsonProperty("SWC")
    public void setSwc(Swc swc) {
        this.swc = swc;
    }

    @JsonProperty("SWFTC")
    public Swftc getSwftc() {
        return swftc;
    }

    @JsonProperty("SWFTC")
    public void setSwftc(Swftc swftc) {
        this.swftc = swftc;
    }

    @JsonProperty("SWT")
    public Swt getSwt() {
        return swt;
    }

    @JsonProperty("SWT")
    public void setSwt(Swt swt) {
        this.swt = swt;
    }

    @JsonProperty("SXDT")
    public Sxdt getSxdt() {
        return sxdt;
    }

    @JsonProperty("SXDT")
    public void setSxdt(Sxdt sxdt) {
        this.sxdt = sxdt;
    }

    @JsonProperty("SXUT")
    public Sxut getSxut() {
        return sxut;
    }

    @JsonProperty("SXUT")
    public void setSxut(Sxut sxut) {
        this.sxut = sxut;
    }

    @JsonProperty("TAAS")
    public Taas getTaas() {
        return taas;
    }

    @JsonProperty("TAAS")
    public void setTaas(Taas taas) {
        this.taas = taas;
    }

    @JsonProperty("TBX")
    public Tbx getTbx() {
        return tbx;
    }

    @JsonProperty("TBX")
    public void setTbx(Tbx tbx) {
        this.tbx = tbx;
    }

    @JsonProperty("TCH")
    public Tch getTch() {
        return tch;
    }

    @JsonProperty("TCH")
    public void setTch(Tch tch) {
        this.tch = tch;
    }

    @JsonProperty("TCT")
    public Tct getTct() {
        return tct;
    }

    @JsonProperty("TCT")
    public void setTct(Tct tct) {
        this.tct = tct;
    }

    @JsonProperty("TDP")
    public Tdp getTdp() {
        return tdp;
    }

    @JsonProperty("TDP")
    public void setTdp(Tdp tdp) {
        this.tdp = tdp;
    }

    @JsonProperty("TDS")
    public Tds getTds() {
        return tds;
    }

    @JsonProperty("TDS")
    public void setTds(Tds tds) {
        this.tds = tds;
    }

    @JsonProperty("TEL")
    public Tel getTel() {
        return tel;
    }

    @JsonProperty("TEL")
    public void setTel(Tel tel) {
        this.tel = tel;
    }

    @JsonProperty("TEN")
    public Ten getTen() {
        return ten;
    }

    @JsonProperty("TEN")
    public void setTen(Ten ten) {
        this.ten = ten;
    }

    @JsonProperty("TFD")
    public Tfd getTfd() {
        return tfd;
    }

    @JsonProperty("TFD")
    public void setTfd(Tfd tfd) {
        this.tfd = tfd;
    }

    @JsonProperty("TFL")
    public Tfl getTfl() {
        return tfl;
    }

    @JsonProperty("TFL")
    public void setTfl(Tfl tfl) {
        this.tfl = tfl;
    }

    @JsonProperty("TFUEL")
    public Tfuel getTfuel() {
        return tfuel;
    }

    @JsonProperty("TFUEL")
    public void setTfuel(Tfuel tfuel) {
        this.tfuel = tfuel;
    }

    @JsonProperty("TGAME")
    public Tgame getTgame() {
        return tgame;
    }

    @JsonProperty("TGAME")
    public void setTgame(Tgame tgame) {
        this.tgame = tgame;
    }

    @JsonProperty("TGT")
    public Tgt getTgt() {
        return tgt;
    }

    @JsonProperty("TGT")
    public void setTgt(Tgt tgt) {
        this.tgt = tgt;
    }

    @JsonProperty("THETA")
    public Theta getTheta() {
        return theta;
    }

    @JsonProperty("THETA")
    public void setTheta(Theta theta) {
        this.theta = theta;
    }

    @JsonProperty("THR")
    public Thr getThr() {
        return thr;
    }

    @JsonProperty("THR")
    public void setThr(Thr thr) {
        this.thr = thr;
    }

    @JsonProperty("THRT")
    public Thrt getThrt() {
        return thrt;
    }

    @JsonProperty("THRT")
    public void setThrt(Thrt thrt) {
        this.thrt = thrt;
    }

    @JsonProperty("TIE")
    public Tie getTie() {
        return tie;
    }

    @JsonProperty("TIE")
    public void setTie(Tie tie) {
        this.tie = tie;
    }

    @JsonProperty("TIG")
    public Tig getTig() {
        return tig;
    }

    @JsonProperty("TIG")
    public void setTig(Tig tig) {
        this.tig = tig;
    }

    @JsonProperty("TIOX")
    public Tiox getTiox() {
        return tiox;
    }

    @JsonProperty("TIOX")
    public void setTiox(Tiox tiox) {
        this.tiox = tiox;
    }

    @JsonProperty("TIX")
    public Tix getTix() {
        return tix;
    }

    @JsonProperty("TIX")
    public void setTix(Tix tix) {
        this.tix = tix;
    }

    @JsonProperty("TKN")
    public Tkn getTkn() {
        return tkn;
    }

    @JsonProperty("TKN")
    public void setTkn(Tkn tkn) {
        this.tkn = tkn;
    }

    @JsonProperty("TMT")
    public Tmt getTmt() {
        return tmt;
    }

    @JsonProperty("TMT")
    public void setTmt(Tmt tmt) {
        this.tmt = tmt;
    }

    @JsonProperty("TMTG")
    public Tmtg getTmtg() {
        return tmtg;
    }

    @JsonProperty("TMTG")
    public void setTmtg(Tmtg tmtg) {
        this.tmtg = tmtg;
    }

    @JsonProperty("TNB")
    public Tnb getTnb() {
        return tnb;
    }

    @JsonProperty("TNB")
    public void setTnb(Tnb tnb) {
        this.tnb = tnb;
    }

    @JsonProperty("TNT")
    public Tnt getTnt() {
        return tnt;
    }

    @JsonProperty("TNT")
    public void setTnt(Tnt tnt) {
        this.tnt = tnt;
    }

    @JsonProperty("TOMO")
    public Tomo getTomo() {
        return tomo;
    }

    @JsonProperty("TOMO")
    public void setTomo(Tomo tomo) {
        this.tomo = tomo;
    }

    @JsonProperty("TOPC")
    public Topc getTopc() {
        return topc;
    }

    @JsonProperty("TOPC")
    public void setTopc(Topc topc) {
        this.topc = topc;
    }

    @JsonProperty("TRAC")
    public Trac getTrac() {
        return trac;
    }

    @JsonProperty("TRAC")
    public void setTrac(Trac trac) {
        this.trac = trac;
    }

    @JsonProperty("TRAK")
    public Trak getTrak() {
        return trak;
    }

    @JsonProperty("TRAK")
    public void setTrak(Trak trak) {
        this.trak = trak;
    }

    @JsonProperty("TRCT")
    public Trct getTrct() {
        return trct;
    }

    @JsonProperty("TRCT")
    public void setTrct(Trct trct) {
        this.trct = trct;
    }

    @JsonProperty("TRDT")
    public Trdt getTrdt() {
        return trdt;
    }

    @JsonProperty("TRDT")
    public void setTrdt(Trdt trdt) {
        this.trdt = trdt;
    }

    @JsonProperty("TRIO")
    public Trio getTrio() {
        return trio;
    }

    @JsonProperty("TRIO")
    public void setTrio(Trio trio) {
        this.trio = trio;
    }

    @JsonProperty("TRST")
    public Trst getTrst() {
        return trst;
    }

    @JsonProperty("TRST")
    public void setTrst(Trst trst) {
        this.trst = trst;
    }

    @JsonProperty("TRUE")
    public True getTrue() {
        return _true;
    }

    @JsonProperty("TRUE")
    public void setTrue(True _true) {
        this._true = _true;
    }

    @JsonProperty("TSL")
    public Tsl getTsl() {
        return tsl;
    }

    @JsonProperty("TSL")
    public void setTsl(Tsl tsl) {
        this.tsl = tsl;
    }

    @JsonProperty("TTC")
    public Ttc getTtc() {
        return ttc;
    }

    @JsonProperty("TTC")
    public void setTtc(Ttc ttc) {
        this.ttc = ttc;
    }

    @JsonProperty("TTV")
    public Ttv getTtv() {
        return ttv;
    }

    @JsonProperty("TTV")
    public void setTtv(Ttv ttv) {
        this.ttv = ttv;
    }

    @JsonProperty("TUSD")
    public Tusd getTusd() {
        return tusd;
    }

    @JsonProperty("TUSD")
    public void setTusd(Tusd tusd) {
        this.tusd = tusd;
    }

    @JsonProperty("UBC")
    public Ubc getUbc() {
        return ubc;
    }

    @JsonProperty("UBC")
    public void setUbc(Ubc ubc) {
        this.ubc = ubc;
    }

    @JsonProperty("UBEX")
    public Ubex getUbex() {
        return ubex;
    }

    @JsonProperty("UBEX")
    public void setUbex(Ubex ubex) {
        this.ubex = ubex;
    }

    @JsonProperty("UBT")
    public Ubt getUbt() {
        return ubt;
    }

    @JsonProperty("UBT")
    public void setUbt(Ubt ubt) {
        this.ubt = ubt;
    }

    @JsonProperty("UCT")
    public Uct getUct() {
        return uct;
    }

    @JsonProperty("UCT")
    public void setUct(Uct uct) {
        this.uct = uct;
    }

    @JsonProperty("UDOO")
    public Udoo getUdoo() {
        return udoo;
    }

    @JsonProperty("UDOO")
    public void setUdoo(Udoo udoo) {
        this.udoo = udoo;
    }

    @JsonProperty("UFR")
    public Ufr getUfr() {
        return ufr;
    }

    @JsonProperty("UFR")
    public void setUfr(Ufr ufr) {
        this.ufr = ufr;
    }

    @JsonProperty("UGAS")
    public Ugas getUgas() {
        return ugas;
    }

    @JsonProperty("UGAS")
    public void setUgas(Ugas ugas) {
        this.ugas = ugas;
    }

    @JsonProperty("UGC")
    public Ugc getUgc() {
        return ugc;
    }

    @JsonProperty("UGC")
    public void setUgc(Ugc ugc) {
        this.ugc = ugc;
    }

    @JsonProperty("UKG")
    public Ukg getUkg() {
        return ukg;
    }

    @JsonProperty("UKG")
    public void setUkg(Ukg ukg) {
        this.ukg = ukg;
    }

    @JsonProperty("UP")
    public Up getUp() {
        return up;
    }

    @JsonProperty("UP")
    public void setUp(Up up) {
        this.up = up;
    }

    @JsonProperty("UPP")
    public Upp getUpp() {
        return upp;
    }

    @JsonProperty("UPP")
    public void setUpp(Upp upp) {
        this.upp = upp;
    }

    @JsonProperty("UQC")
    public Uqc getUqc() {
        return uqc;
    }

    @JsonProperty("UQC")
    public void setUqc(Uqc uqc) {
        this.uqc = uqc;
    }

    @JsonProperty("USDC")
    public Usdc getUsdc() {
        return usdc;
    }

    @JsonProperty("USDC")
    public void setUsdc(Usdc usdc) {
        this.usdc = usdc;
    }

    @JsonProperty("USDS")
    public Usds getUsds() {
        return usds;
    }

    @JsonProperty("USDS")
    public void setUsds(Usds usds) {
        this.usds = usds;
    }

    @JsonProperty("USDT")
    public Usdt getUsdt() {
        return usdt;
    }

    @JsonProperty("USDT")
    public void setUsdt(Usdt usdt) {
        this.usdt = usdt;
    }

    @JsonProperty("USE")
    public Use getUse() {
        return use;
    }

    @JsonProperty("USE")
    public void setUse(Use use) {
        this.use = use;
    }

    @JsonProperty("UTK")
    public Utk getUtk() {
        return utk;
    }

    @JsonProperty("UTK")
    public void setUtk(Utk utk) {
        this.utk = utk;
    }

    @JsonProperty("UTNP")
    public Utnp getUtnp() {
        return utnp;
    }

    @JsonProperty("UTNP")
    public void setUtnp(Utnp utnp) {
        this.utnp = utnp;
    }

    @JsonProperty("UTT")
    public Utt getUtt() {
        return utt;
    }

    @JsonProperty("UTT")
    public void setUtt(Utt utt) {
        this.utt = utt;
    }

    @JsonProperty("UUU")
    public Uuu getUuu() {
        return uuu;
    }

    @JsonProperty("UUU")
    public void setUuu(Uuu uuu) {
        this.uuu = uuu;
    }

    @JsonProperty("VEE")
    public Vee getVee() {
        return vee;
    }

    @JsonProperty("VEE")
    public void setVee(Vee vee) {
        this.vee = vee;
    }

    @JsonProperty("VERI")
    public Veri getVeri() {
        return veri;
    }

    @JsonProperty("VERI")
    public void setVeri(Veri veri) {
        this.veri = veri;
    }

    @JsonProperty("VEST")
    public Vest getVest() {
        return vest;
    }

    @JsonProperty("VEST")
    public void setVest(Vest vest) {
        this.vest = vest;
    }

    @JsonProperty("VET")
    public Vet getVet() {
        return vet;
    }

    @JsonProperty("VET")
    public void setVet(Vet vet) {
        this.vet = vet;
    }

    @JsonProperty("VIBE")
    public Vibe getVibe() {
        return vibe;
    }

    @JsonProperty("VIBE")
    public void setVibe(Vibe vibe) {
        this.vibe = vibe;
    }

    @JsonProperty("VIDT")
    public Vidt getVidt() {
        return vidt;
    }

    @JsonProperty("VIDT")
    public void setVidt(Vidt vidt) {
        this.vidt = vidt;
    }

    @JsonProperty("VIN")
    public Vin getVin() {
        return vin;
    }

    @JsonProperty("VIN")
    public void setVin(Vin vin) {
        this.vin = vin;
    }

    @JsonProperty("VIT")
    public Vit getVit() {
        return vit;
    }

    @JsonProperty("VIT")
    public void setVit(Vit vit) {
        this.vit = vit;
    }

    @JsonProperty("VITE")
    public Vite getVite() {
        return vite;
    }

    @JsonProperty("VITE")
    public void setVite(Vite vite) {
        this.vite = vite;
    }

    @JsonProperty("VIU")
    public Viu getViu() {
        return viu;
    }

    @JsonProperty("VIU")
    public void setViu(Viu viu) {
        this.viu = viu;
    }

    @JsonProperty("VME")
    public Vme getVme() {
        return vme;
    }

    @JsonProperty("VME")
    public void setVme(Vme vme) {
        this.vme = vme;
    }

    @JsonProperty("VNX")
    public Vnx getVnx() {
        return vnx;
    }

    @JsonProperty("VNX")
    public void setVnx(Vnx vnx) {
        this.vnx = vnx;
    }

    @JsonProperty("VOISE")
    public Voise getVoise() {
        return voise;
    }

    @JsonProperty("VOISE")
    public void setVoise(Voise voise) {
        this.voise = voise;
    }

    @JsonProperty("VRA")
    public Vra getVra() {
        return vra;
    }

    @JsonProperty("VRA")
    public void setVra(Vra vra) {
        this.vra = vra;
    }

    @JsonProperty("VRS")
    public Vrs getVrs() {
        return vrs;
    }

    @JsonProperty("VRS")
    public void setVrs(Vrs vrs) {
        this.vrs = vrs;
    }

    @JsonProperty("VSL")
    public Vsl getVsl() {
        return vsl;
    }

    @JsonProperty("VSL")
    public void setVsl(Vsl vsl) {
        this.vsl = vsl;
    }

    @JsonProperty("VZT")
    public Vzt getVzt() {
        return vzt;
    }

    @JsonProperty("VZT")
    public void setVzt(Vzt vzt) {
        this.vzt = vzt;
    }

    @JsonProperty("WAB")
    public Wab getWab() {
        return wab;
    }

    @JsonProperty("WAB")
    public void setWab(Wab wab) {
        this.wab = wab;
    }

    @JsonProperty("WABI")
    public Wabi getWabi() {
        return wabi;
    }

    @JsonProperty("WABI")
    public void setWabi(Wabi wabi) {
        this.wabi = wabi;
    }

    @JsonProperty("WAN")
    public Wan getWan() {
        return wan;
    }

    @JsonProperty("WAN")
    public void setWan(Wan wan) {
        this.wan = wan;
    }

    @JsonProperty("WAND")
    public Wand getWand() {
        return wand;
    }

    @JsonProperty("WAND")
    public void setWand(Wand wand) {
        this.wand = wand;
    }

    @JsonProperty("WAX")
    public Wax getWax() {
        return wax;
    }

    @JsonProperty("WAX")
    public void setWax(Wax wax) {
        this.wax = wax;
    }

    @JsonProperty("WBTC")
    public Wbtc getWbtc() {
        return wbtc;
    }

    @JsonProperty("WBTC")
    public void setWbtc(Wbtc wbtc) {
        this.wbtc = wbtc;
    }

    @JsonProperty("WCOIN")
    public Wcoin getWcoin() {
        return wcoin;
    }

    @JsonProperty("WCOIN")
    public void setWcoin(Wcoin wcoin) {
        this.wcoin = wcoin;
    }

    @JsonProperty("WEB")
    public Web getWeb() {
        return web;
    }

    @JsonProperty("WEB")
    public void setWeb(Web web) {
        this.web = web;
    }

    @JsonProperty("WELL")
    public Well getWell() {
        return well;
    }

    @JsonProperty("WELL")
    public void setWell(Well well) {
        this.well = well;
    }

    @JsonProperty("WETH")
    public Weth getWeth() {
        return weth;
    }

    @JsonProperty("WETH")
    public void setWeth(Weth weth) {
        this.weth = weth;
    }

    @JsonProperty("WHEN")
    public When getWhen() {
        return when;
    }

    @JsonProperty("WHEN")
    public void setWhen(When when) {
        this.when = when;
    }

    @JsonProperty("WINGS")
    public Wings getWings() {
        return wings;
    }

    @JsonProperty("WINGS")
    public void setWings(Wings wings) {
        this.wings = wings;
    }

    @JsonProperty("WISH")
    public Wish getWish() {
        return wish;
    }

    @JsonProperty("WISH")
    public void setWish(Wish wish) {
        this.wish = wish;
    }

    @JsonProperty("WIZ")
    public Wiz getWiz() {
        return wiz;
    }

    @JsonProperty("WIZ")
    public void setWiz(Wiz wiz) {
        this.wiz = wiz;
    }

    @JsonProperty("WPP")
    public Wpp getWpp() {
        return wpp;
    }

    @JsonProperty("WPP")
    public void setWpp(Wpp wpp) {
        this.wpp = wpp;
    }

    @JsonProperty("WPR")
    public Wpr getWpr() {
        return wpr;
    }

    @JsonProperty("WPR")
    public void setWpr(Wpr wpr) {
        this.wpr = wpr;
    }

    @JsonProperty("WRC")
    public Wrc getWrc() {
        return wrc;
    }

    @JsonProperty("WRC")
    public void setWrc(Wrc wrc) {
        this.wrc = wrc;
    }

    @JsonProperty("WT")
    public Wt getWt() {
        return wt;
    }

    @JsonProperty("WT")
    public void setWt(Wt wt) {
        this.wt = wt;
    }

    @JsonProperty("WTC")
    public Wtc getWtc() {
        return wtc;
    }

    @JsonProperty("WTC")
    public void setWtc(Wtc wtc) {
        this.wtc = wtc;
    }

    @JsonProperty("WTL")
    public Wtl getWtl() {
        return wtl;
    }

    @JsonProperty("WTL")
    public void setWtl(Wtl wtl) {
        this.wtl = wtl;
    }

    @JsonProperty("WYS")
    public Wys getWys() {
        return wys;
    }

    @JsonProperty("WYS")
    public void setWys(Wys wys) {
        this.wys = wys;
    }

    @JsonProperty("X8X")
    public X8x getX8x() {
        return x8x;
    }

    @JsonProperty("X8X")
    public void setX8x(X8x x8x) {
        this.x8x = x8x;
    }

    @JsonProperty("XAUR")
    public Xaur getXaur() {
        return xaur;
    }

    @JsonProperty("XAUR")
    public void setXaur(Xaur xaur) {
        this.xaur = xaur;
    }

    @JsonProperty("XBASE")
    public Xbase getXbase() {
        return xbase;
    }

    @JsonProperty("XBASE")
    public void setXbase(Xbase xbase) {
        this.xbase = xbase;
    }

    @JsonProperty("XBB")
    public Xbb getXbb() {
        return xbb;
    }

    @JsonProperty("XBB")
    public void setXbb(Xbb xbb) {
        this.xbb = xbb;
    }

    @JsonProperty("XBL")
    public Xbl getXbl() {
        return xbl;
    }

    @JsonProperty("XBL")
    public void setXbl(Xbl xbl) {
        this.xbl = xbl;
    }

    @JsonProperty("XBX")
    public Xbx getXbx() {
        return xbx;
    }

    @JsonProperty("XBX")
    public void setXbx(Xbx xbx) {
        this.xbx = xbx;
    }

    @JsonProperty("XCD")
    public Xcd getXcd() {
        return xcd;
    }

    @JsonProperty("XCD")
    public void setXcd(Xcd xcd) {
        this.xcd = xcd;
    }

    @JsonProperty("XCLR")
    public Xclr getXclr() {
        return xclr;
    }

    @JsonProperty("XCLR")
    public void setXclr(Xclr xclr) {
        this.xclr = xclr;
    }

    @JsonProperty("XDCE")
    public Xdce getXdce() {
        return xdce;
    }

    @JsonProperty("XDCE")
    public void setXdce(Xdce xdce) {
        this.xdce = xdce;
    }

    @JsonProperty("XES")
    public Xes getXes() {
        return xes;
    }

    @JsonProperty("XES")
    public void setXes(Xes xes) {
        this.xes = xes;
    }

    @JsonProperty("XET")
    public Xet getXet() {
        return xet;
    }

    @JsonProperty("XET")
    public void setXet(Xet xet) {
        this.xet = xet;
    }

    @JsonProperty("XMX")
    public Xmx getXmx() {
        return xmx;
    }

    @JsonProperty("XMX")
    public void setXmx(Xmx xmx) {
        this.xmx = xmx;
    }

    @JsonProperty("XNG")
    public Xng getXng() {
        return xng;
    }

    @JsonProperty("XNG")
    public void setXng(Xng xng) {
        this.xng = xng;
    }

    @JsonProperty("XNK")
    public Xnk getXnk() {
        return xnk;
    }

    @JsonProperty("XNK")
    public void setXnk(Xnk xnk) {
        this.xnk = xnk;
    }

    @JsonProperty("XOV")
    public Xov getXov() {
        return xov;
    }

    @JsonProperty("XOV")
    public void setXov(Xov xov) {
        this.xov = xov;
    }

    @JsonProperty("XPAT")
    public Xpat getXpat() {
        return xpat;
    }

    @JsonProperty("XPAT")
    public void setXpat(Xpat xpat) {
        this.xpat = xpat;
    }

    @JsonProperty("XUC")
    public Xuc getXuc() {
        return xuc;
    }

    @JsonProperty("XUC")
    public void setXuc(Xuc xuc) {
        this.xuc = xuc;
    }

    @JsonProperty("XYO")
    public Xyo getXyo() {
        return xyo;
    }

    @JsonProperty("XYO")
    public void setXyo(Xyo xyo) {
        this.xyo = xyo;
    }

    @JsonProperty("XZC")
    public Xzc getXzc() {
        return xzc;
    }

    @JsonProperty("XZC")
    public void setXzc(Xzc xzc) {
        this.xzc = xzc;
    }

    @JsonProperty("YEE")
    public Yee getYee() {
        return yee;
    }

    @JsonProperty("YEE")
    public void setYee(Yee yee) {
        this.yee = yee;
    }

    @JsonProperty("YOYOW")
    public Yoyow getYoyow() {
        return yoyow;
    }

    @JsonProperty("YOYOW")
    public void setYoyow(Yoyow yoyow) {
        this.yoyow = yoyow;
    }

    @JsonProperty("YUP")
    public Yup getYup() {
        return yup;
    }

    @JsonProperty("YUP")
    public void setYup(Yup yup) {
        this.yup = yup;
    }

    @JsonProperty("ZAP")
    public Zap getZap() {
        return zap;
    }

    @JsonProperty("ZAP")
    public void setZap(Zap zap) {
        this.zap = zap;
    }

    @JsonProperty("ZCN")
    public Zcn getZcn() {
        return zcn;
    }

    @JsonProperty("ZCN")
    public void setZcn(Zcn zcn) {
        this.zcn = zcn;
    }

    @JsonProperty("ZCO")
    public Zco getZco() {
        return zco;
    }

    @JsonProperty("ZCO")
    public void setZco(Zco zco) {
        this.zco = zco;
    }

    @JsonProperty("ZEC")
    public Zec getZec() {
        return zec;
    }

    @JsonProperty("ZEC")
    public void setZec(Zec zec) {
        this.zec = zec;
    }

    @JsonProperty("ZEON")
    public Zeon getZeon() {
        return zeon;
    }

    @JsonProperty("ZEON")
    public void setZeon(Zeon zeon) {
        this.zeon = zeon;
    }

    @JsonProperty("ZIL")
    public Zil getZil() {
        return zil;
    }

    @JsonProperty("ZIL")
    public void setZil(Zil zil) {
        this.zil = zil;
    }

    @JsonProperty("ZINC")
    public Zinc getZinc() {
        return zinc;
    }

    @JsonProperty("ZINC")
    public void setZinc(Zinc zinc) {
        this.zinc = zinc;
    }

    @JsonProperty("ZIP")
    public Zip getZip() {
        return zip;
    }

    @JsonProperty("ZIP")
    public void setZip(Zip zip) {
        this.zip = zip;
    }

    @JsonProperty("ZIPT")
    public Zipt getZipt() {
        return zipt;
    }

    @JsonProperty("ZIPT")
    public void setZipt(Zipt zipt) {
        this.zipt = zipt;
    }

    @JsonProperty("ZLA")
    public Zla getZla() {
        return zla;
    }

    @JsonProperty("ZLA")
    public void setZla(Zla zla) {
        this.zla = zla;
    }

    @JsonProperty("ZMN")
    public Zmn getZmn() {
        return zmn;
    }

    @JsonProperty("ZMN")
    public void setZmn(Zmn zmn) {
        this.zmn = zmn;
    }

    @JsonProperty("ZPR")
    public Zpr getZpr() {
        return zpr;
    }

    @JsonProperty("ZPR")
    public void setZpr(Zpr zpr) {
        this.zpr = zpr;
    }

    @JsonProperty("ZRX")
    public Zrx getZrx() {
        return zrx;
    }

    @JsonProperty("ZRX")
    public void setZrx(Zrx zrx) {
        this.zrx = zrx;
    }

    @JsonProperty("ZSC")
    public Zsc getZsc() {
        return zsc;
    }

    @JsonProperty("ZSC")
    public void setZsc(Zsc zsc) {
        this.zsc = zsc;
    }

    @JsonProperty("ZT")
    public Zt getZt() {
        return zt;
    }

    @JsonProperty("ZT")
    public void setZt(Zt zt) {
        this.zt = zt;
    }

    @JsonProperty("ZXC")
    public Zxc getZxc() {
        return zxc;
    }

    @JsonProperty("ZXC")
    public void setZxc(Zxc zxc) {
        this.zxc = zxc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_0xbtc");
        sb.append('=');
        sb.append(((this._0xbtc == null)?"<null>":this._0xbtc));
        sb.append(',');
        sb.append("_1st");
        sb.append('=');
        sb.append(((this._1st == null)?"<null>":this._1st));
        sb.append(',');
        sb.append("_1wo");
        sb.append('=');
        sb.append(((this._1wo == null)?"<null>":this._1wo));
        sb.append(',');
        sb.append("aac");
        sb.append('=');
        sb.append(((this.aac == null)?"<null>":this.aac));
        sb.append(',');
        sb.append("abcc");
        sb.append('=');
        sb.append(((this.abcc == null)?"<null>":this.abcc));
        sb.append(',');
        sb.append("abt");
        sb.append('=');
        sb.append(((this.abt == null)?"<null>":this.abt));
        sb.append(',');
        sb.append("abyss");
        sb.append('=');
        sb.append(((this.abyss == null)?"<null>":this.abyss));
        sb.append(',');
        sb.append("accn");
        sb.append('=');
        sb.append(((this.accn == null)?"<null>":this.accn));
        sb.append(',');
        sb.append("ace");
        sb.append('=');
        sb.append(((this.ace == null)?"<null>":this.ace));
        sb.append(',');
        sb.append("ada");
        sb.append('=');
        sb.append(((this.ada == null)?"<null>":this.ada));
        sb.append(',');
        sb.append("adb");
        sb.append('=');
        sb.append(((this.adb == null)?"<null>":this.adb));
        sb.append(',');
        sb.append("adh");
        sb.append('=');
        sb.append(((this.adh == null)?"<null>":this.adh));
        sb.append(',');
        sb.append("adi");
        sb.append('=');
        sb.append(((this.adi == null)?"<null>":this.adi));
        sb.append(',');
        sb.append("adl");
        sb.append('=');
        sb.append(((this.adl == null)?"<null>":this.adl));
        sb.append(',');
        sb.append("adt");
        sb.append('=');
        sb.append(((this.adt == null)?"<null>":this.adt));
        sb.append(',');
        sb.append("adx");
        sb.append('=');
        sb.append(((this.adx == null)?"<null>":this.adx));
        sb.append(',');
        sb.append("ae");
        sb.append('=');
        sb.append(((this.ae == null)?"<null>":this.ae));
        sb.append(',');
        sb.append("aen");
        sb.append('=');
        sb.append(((this.aen == null)?"<null>":this.aen));
        sb.append(',');
        sb.append("aergo");
        sb.append('=');
        sb.append(((this.aergo == null)?"<null>":this.aergo));
        sb.append(',');
        sb.append("agi");
        sb.append('=');
        sb.append(((this.agi == null)?"<null>":this.agi));
        sb.append(',');
        sb.append("agvc");
        sb.append('=');
        sb.append(((this.agvc == null)?"<null>":this.agvc));
        sb.append(',');
        sb.append("aid");
        sb.append('=');
        sb.append(((this.aid == null)?"<null>":this.aid));
        sb.append(',');
        sb.append("aidoc");
        sb.append('=');
        sb.append(((this.aidoc == null)?"<null>":this.aidoc));
        sb.append(',');
        sb.append("ait");
        sb.append('=');
        sb.append(((this.ait == null)?"<null>":this.ait));
        sb.append(',');
        sb.append("aix");
        sb.append('=');
        sb.append(((this.aix == null)?"<null>":this.aix));
        sb.append(',');
        sb.append("alis");
        sb.append('=');
        sb.append(((this.alis == null)?"<null>":this.alis));
        sb.append(',');
        sb.append("alx");
        sb.append('=');
        sb.append(((this.alx == null)?"<null>":this.alx));
        sb.append(',');
        sb.append("amb");
        sb.append('=');
        sb.append(((this.amb == null)?"<null>":this.amb));
        sb.append(',');
        sb.append("amlt");
        sb.append('=');
        sb.append(((this.amlt == null)?"<null>":this.amlt));
        sb.append(',');
        sb.append("amm");
        sb.append('=');
        sb.append(((this.amm == null)?"<null>":this.amm));
        sb.append(',');
        sb.append("amn");
        sb.append('=');
        sb.append(((this.amn == null)?"<null>":this.amn));
        sb.append(',');
        sb.append("amo");
        sb.append('=');
        sb.append(((this.amo == null)?"<null>":this.amo));
        sb.append(',');
        sb.append("ankr");
        sb.append('=');
        sb.append(((this.ankr == null)?"<null>":this.ankr));
        sb.append(',');
        sb.append("ant");
        sb.append('=');
        sb.append(((this.ant == null)?"<null>":this.ant));
        sb.append(',');
        sb.append("aoa");
        sb.append('=');
        sb.append(((this.aoa == null)?"<null>":this.aoa));
        sb.append(',');
        sb.append("apis");
        sb.append('=');
        sb.append(((this.apis == null)?"<null>":this.apis));
        sb.append(',');
        sb.append("appc");
        sb.append('=');
        sb.append(((this.appc == null)?"<null>":this.appc));
        sb.append(',');
        sb.append("araw");
        sb.append('=');
        sb.append(((this.araw == null)?"<null>":this.araw));
        sb.append(',');
        sb.append("arbt");
        sb.append('=');
        sb.append(((this.arbt == null)?"<null>":this.arbt));
        sb.append(',');
        sb.append("arct");
        sb.append('=');
        sb.append(((this.arct == null)?"<null>":this.arct));
        sb.append(',');
        sb.append("arn");
        sb.append('=');
        sb.append(((this.arn == null)?"<null>":this.arn));
        sb.append(',');
        sb.append("art");
        sb.append('=');
        sb.append(((this.art == null)?"<null>":this.art));
        sb.append(',');
        sb.append("ary");
        sb.append('=');
        sb.append(((this.ary == null)?"<null>":this.ary));
        sb.append(',');
        sb.append("ast");
        sb.append('=');
        sb.append(((this.ast == null)?"<null>":this.ast));
        sb.append(',');
        sb.append("asto");
        sb.append('=');
        sb.append(((this.asto == null)?"<null>":this.asto));
        sb.append(',');
        sb.append("atl");
        sb.append('=');
        sb.append(((this.atl == null)?"<null>":this.atl));
        sb.append(',');
        sb.append("atm");
        sb.append('=');
        sb.append(((this.atm == null)?"<null>":this.atm));
        sb.append(',');
        sb.append("atmi");
        sb.append('=');
        sb.append(((this.atmi == null)?"<null>":this.atmi));
        sb.append(',');
        sb.append("ats");
        sb.append('=');
        sb.append(((this.ats == null)?"<null>":this.ats));
        sb.append(',');
        sb.append("auc");
        sb.append('=');
        sb.append(((this.auc == null)?"<null>":this.auc));
        sb.append(',');
        sb.append("avh");
        sb.append('=');
        sb.append(((this.avh == null)?"<null>":this.avh));
        sb.append(',');
        sb.append("avt");
        sb.append('=');
        sb.append(((this.avt == null)?"<null>":this.avt));
        sb.append(',');
        sb.append("awc");
        sb.append('=');
        sb.append(((this.awc == null)?"<null>":this.awc));
        sb.append(',');
        sb.append("axpr");
        sb.append('=');
        sb.append(((this.axpr == null)?"<null>":this.axpr));
        sb.append(',');
        sb.append("b2b");
        sb.append('=');
        sb.append(((this.b2b == null)?"<null>":this.b2b));
        sb.append(',');
        sb.append("baas");
        sb.append('=');
        sb.append(((this.baas == null)?"<null>":this.baas));
        sb.append(',');
        sb.append("banca");
        sb.append('=');
        sb.append(((this.banca == null)?"<null>":this.banca));
        sb.append(',');
        sb.append("bat");
        sb.append('=');
        sb.append(((this.bat == null)?"<null>":this.bat));
        sb.append(',');
        sb.append("bax");
        sb.append('=');
        sb.append(((this.bax == null)?"<null>":this.bax));
        sb.append(',');
        sb.append("bbc");
        sb.append('=');
        sb.append(((this.bbc == null)?"<null>":this.bbc));
        sb.append(',');
        sb.append("bbo");
        sb.append('=');
        sb.append(((this.bbo == null)?"<null>":this.bbo));
        sb.append(',');
        sb.append("bcap");
        sb.append('=');
        sb.append(((this.bcap == null)?"<null>":this.bcap));
        sb.append(',');
        sb.append("bcdn");
        sb.append('=');
        sb.append(((this.bcdn == null)?"<null>":this.bcdn));
        sb.append(',');
        sb.append("bcdt");
        sb.append('=');
        sb.append(((this.bcdt == null)?"<null>":this.bcdt));
        sb.append(',');
        sb.append("bch");
        sb.append('=');
        sb.append(((this.bch == null)?"<null>":this.bch));
        sb.append(',');
        sb.append("bcpt");
        sb.append('=');
        sb.append(((this.bcpt == null)?"<null>":this.bcpt));
        sb.append(',');
        sb.append("bdg");
        sb.append('=');
        sb.append(((this.bdg == null)?"<null>":this.bdg));
        sb.append(',');
        sb.append("beat");
        sb.append('=');
        sb.append(((this.beat == null)?"<null>":this.beat));
        sb.append(',');
        sb.append("bee");
        sb.append('=');
        sb.append(((this.bee == null)?"<null>":this.bee));
        sb.append(',');
        sb.append("bela");
        sb.append('=');
        sb.append(((this.bela == null)?"<null>":this.bela));
        sb.append(',');
        sb.append("berry");
        sb.append('=');
        sb.append(((this.berry == null)?"<null>":this.berry));
        sb.append(',');
        sb.append("bether");
        sb.append('=');
        sb.append(((this.bether == null)?"<null>":this.bether));
        sb.append(',');
        sb.append("betr");
        sb.append('=');
        sb.append(((this.betr == null)?"<null>":this.betr));
        sb.append(',');
        sb.append("bez");
        sb.append('=');
        sb.append(((this.bez == null)?"<null>":this.bez));
        sb.append(',');
        sb.append("bft");
        sb.append('=');
        sb.append(((this.bft == null)?"<null>":this.bft));
        sb.append(',');
        sb.append("bgg");
        sb.append('=');
        sb.append(((this.bgg == null)?"<null>":this.bgg));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("bitx");
        sb.append('=');
        sb.append(((this.bitx == null)?"<null>":this.bitx));
        sb.append(',');
        sb.append("bix");
        sb.append('=');
        sb.append(((this.bix == null)?"<null>":this.bix));
        sb.append(',');
        sb.append("bkx");
        sb.append('=');
        sb.append(((this.bkx == null)?"<null>":this.bkx));
        sb.append(',');
        sb.append("blnm");
        sb.append('=');
        sb.append(((this.blnm == null)?"<null>":this.blnm));
        sb.append(',');
        sb.append("bloc");
        sb.append('=');
        sb.append(((this.bloc == null)?"<null>":this.bloc));
        sb.append(',');
        sb.append("blt");
        sb.append('=');
        sb.append(((this.blt == null)?"<null>":this.blt));
        sb.append(',');
        sb.append("blz");
        sb.append('=');
        sb.append(((this.blz == null)?"<null>":this.blz));
        sb.append(',');
        sb.append("bmc");
        sb.append('=');
        sb.append(((this.bmc == null)?"<null>":this.bmc));
        sb.append(',');
        sb.append("bmh");
        sb.append('=');
        sb.append(((this.bmh == null)?"<null>":this.bmh));
        sb.append(',');
        sb.append("bmx");
        sb.append('=');
        sb.append(((this.bmx == null)?"<null>":this.bmx));
        sb.append(',');
        sb.append("bnk");
        sb.append('=');
        sb.append(((this.bnk == null)?"<null>":this.bnk));
        sb.append(',');
        sb.append("bnn");
        sb.append('=');
        sb.append(((this.bnn == null)?"<null>":this.bnn));
        sb.append(',');
        sb.append("bnt");
        sb.append('=');
        sb.append(((this.bnt == null)?"<null>":this.bnt));
        sb.append(',');
        sb.append("bnty");
        sb.append('=');
        sb.append(((this.bnty == null)?"<null>":this.bnty));
        sb.append(',');
        sb.append("bob");
        sb.append('=');
        sb.append(((this.bob == null)?"<null>":this.bob));
        sb.append(',');
        sb.append("boe");
        sb.append('=');
        sb.append(((this.boe == null)?"<null>":this.boe));
        sb.append(',');
        sb.append("bolt");
        sb.append('=');
        sb.append(((this.bolt == null)?"<null>":this.bolt));
        sb.append(',');
        sb.append("boltt");
        sb.append('=');
        sb.append(((this.boltt == null)?"<null>":this.boltt));
        sb.append(',');
        sb.append("bon");
        sb.append('=');
        sb.append(((this.bon == null)?"<null>":this.bon));
        sb.append(',');
        sb.append("bot");
        sb.append('=');
        sb.append(((this.bot == null)?"<null>":this.bot));
        sb.append(',');
        sb.append("bouts");
        sb.append('=');
        sb.append(((this.bouts == null)?"<null>":this.bouts));
        sb.append(',');
        sb.append("box");
        sb.append('=');
        sb.append(((this.box == null)?"<null>":this.box));
        sb.append(',');
        sb.append("bpt");
        sb.append('=');
        sb.append(((this.bpt == null)?"<null>":this.bpt));
        sb.append(',');
        sb.append("bpx");
        sb.append('=');
        sb.append(((this.bpx == null)?"<null>":this.bpx));
        sb.append(',');
        sb.append("bq");
        sb.append('=');
        sb.append(((this.bq == null)?"<null>":this.bq));
        sb.append(',');
        sb.append("bqtx");
        sb.append('=');
        sb.append(((this.bqtx == null)?"<null>":this.bqtx));
        sb.append(',');
        sb.append("brat");
        sb.append('=');
        sb.append(((this.brat == null)?"<null>":this.brat));
        sb.append(',');
        sb.append("brd");
        sb.append('=');
        sb.append(((this.brd == null)?"<null>":this.brd));
        sb.append(',');
        sb.append("bstn");
        sb.append('=');
        sb.append(((this.bstn == null)?"<null>":this.bstn));
        sb.append(',');
        sb.append("bsv");
        sb.append('=');
        sb.append(((this.bsv == null)?"<null>":this.bsv));
        sb.append(',');
        sb.append("btc");
        sb.append('=');
        sb.append(((this.btc == null)?"<null>":this.btc));
        sb.append(',');
        sb.append("btcl");
        sb.append('=');
        sb.append(((this.btcl == null)?"<null>":this.btcl));
        sb.append(',');
        sb.append("btcm");
        sb.append('=');
        sb.append(((this.btcm == null)?"<null>":this.btcm));
        sb.append(',');
        sb.append("btcred");
        sb.append('=');
        sb.append(((this.btcred == null)?"<null>":this.btcred));
        sb.append(',');
        sb.append("btm");
        sb.append('=');
        sb.append(((this.btm == null)?"<null>":this.btm));
        sb.append(',');
        sb.append("btmx");
        sb.append('=');
        sb.append(((this.btmx == null)?"<null>":this.btmx));
        sb.append(',');
        sb.append("bto");
        sb.append('=');
        sb.append(((this.bto == null)?"<null>":this.bto));
        sb.append(',');
        sb.append("btrn");
        sb.append('=');
        sb.append(((this.btrn == null)?"<null>":this.btrn));
        sb.append(',');
        sb.append("btu");
        sb.append('=');
        sb.append(((this.btu == null)?"<null>":this.btu));
        sb.append(',');
        sb.append("bubo");
        sb.append('=');
        sb.append(((this.bubo == null)?"<null>":this.bubo));
        sb.append(',');
        sb.append("bud");
        sb.append('=');
        sb.append(((this.bud == null)?"<null>":this.bud));
        sb.append(',');
        sb.append("bwt");
        sb.append('=');
        sb.append(((this.bwt == null)?"<null>":this.bwt));
        sb.append(',');
        sb.append("bz");
        sb.append('=');
        sb.append(((this.bz == null)?"<null>":this.bz));
        sb.append(',');
        sb.append("bzky");
        sb.append('=');
        sb.append(((this.bzky == null)?"<null>":this.bzky));
        sb.append(',');
        sb.append("bznt");
        sb.append('=');
        sb.append(((this.bznt == null)?"<null>":this.bznt));
        sb.append(',');
        sb.append("c20");
        sb.append('=');
        sb.append(((this.c20 == null)?"<null>":this.c20));
        sb.append(',');
        sb.append("cag");
        sb.append('=');
        sb.append(((this.cag == null)?"<null>":this.cag));
        sb.append(',');
        sb.append("can");
        sb.append('=');
        sb.append(((this.can == null)?"<null>":this.can));
        sb.append(',');
        sb.append("candy");
        sb.append('=');
        sb.append(((this.candy == null)?"<null>":this.candy));
        sb.append(',');
        sb.append("capp");
        sb.append('=');
        sb.append(((this.capp == null)?"<null>":this.capp));
        sb.append(',');
        sb.append("car");
        sb.append('=');
        sb.append(((this.car == null)?"<null>":this.car));
        sb.append(',');
        sb.append("carat");
        sb.append('=');
        sb.append(((this.carat == null)?"<null>":this.carat));
        sb.append(',');
        sb.append("card");
        sb.append('=');
        sb.append(((this.card == null)?"<null>":this.card));
        sb.append(',');
        sb.append("cbc");
        sb.append('=');
        sb.append(((this.cbc == null)?"<null>":this.cbc));
        sb.append(',');
        sb.append("cbt");
        sb.append('=');
        sb.append(((this.cbt == null)?"<null>":this.cbt));
        sb.append(',');
        sb.append("cccx");
        sb.append('=');
        sb.append(((this.cccx == null)?"<null>":this.cccx));
        sb.append(',');
        sb.append("ccl");
        sb.append('=');
        sb.append(((this.ccl == null)?"<null>":this.ccl));
        sb.append(',');
        sb.append("cco");
        sb.append('=');
        sb.append(((this.cco == null)?"<null>":this.cco));
        sb.append(',');
        sb.append("ccrb");
        sb.append('=');
        sb.append(((this.ccrb == null)?"<null>":this.ccrb));
        sb.append(',');
        sb.append("cct");
        sb.append('=');
        sb.append(((this.cct == null)?"<null>":this.cct));
        sb.append(',');
        sb.append("cdt");
        sb.append('=');
        sb.append(((this.cdt == null)?"<null>":this.cdt));
        sb.append(',');
        sb.append("cdx");
        sb.append('=');
        sb.append(((this.cdx == null)?"<null>":this.cdx));
        sb.append(',');
        sb.append("cedex");
        sb.append('=');
        sb.append(((this.cedex == null)?"<null>":this.cedex));
        sb.append(',');
        sb.append("ceek");
        sb.append('=');
        sb.append(((this.ceek == null)?"<null>":this.ceek));
        sb.append(',');
        sb.append("cel");
        sb.append('=');
        sb.append(((this.cel == null)?"<null>":this.cel));
        sb.append(',');
        sb.append("celr");
        sb.append('=');
        sb.append(((this.celr == null)?"<null>":this.celr));
        sb.append(',');
        sb.append("cen");
        sb.append('=');
        sb.append(((this.cen == null)?"<null>":this.cen));
        sb.append(',');
        sb.append("cennz");
        sb.append('=');
        sb.append(((this.cennz == null)?"<null>":this.cennz));
        sb.append(',');
        sb.append("cet");
        sb.append('=');
        sb.append(((this.cet == null)?"<null>":this.cet));
        sb.append(',');
        sb.append("chat");
        sb.append('=');
        sb.append(((this.chat == null)?"<null>":this.chat));
        sb.append(',');
        sb.append("chp");
        sb.append('=');
        sb.append(((this.chp == null)?"<null>":this.chp));
        sb.append(',');
        sb.append("chsb");
        sb.append('=');
        sb.append(((this.chsb == null)?"<null>":this.chsb));
        sb.append(',');
        sb.append("cht");
        sb.append('=');
        sb.append(((this.cht == null)?"<null>":this.cht));
        sb.append(',');
        sb.append("chx");
        sb.append('=');
        sb.append(((this.chx == null)?"<null>":this.chx));
        sb.append(',');
        sb.append("cjt");
        sb.append('=');
        sb.append(((this.cjt == null)?"<null>":this.cjt));
        sb.append(',');
        sb.append("cl");
        sb.append('=');
        sb.append(((this.cl == null)?"<null>":this.cl));
        sb.append(',');
        sb.append("cln");
        sb.append('=');
        sb.append(((this.cln == null)?"<null>":this.cln));
        sb.append(',');
        sb.append("cmct");
        sb.append('=');
        sb.append(((this.cmct == null)?"<null>":this.cmct));
        sb.append(',');
        sb.append("cms");
        sb.append('=');
        sb.append(((this.cms == null)?"<null>":this.cms));
        sb.append(',');
        sb.append("cmt");
        sb.append('=');
        sb.append(((this.cmt == null)?"<null>":this.cmt));
        sb.append(',');
        sb.append("cnd");
        sb.append('=');
        sb.append(((this.cnd == null)?"<null>":this.cnd));
        sb.append(',');
        sb.append("cnn");
        sb.append('=');
        sb.append(((this.cnn == null)?"<null>":this.cnn));
        sb.append(',');
        sb.append("cnx");
        sb.append('=');
        sb.append(((this.cnx == null)?"<null>":this.cnx));
        sb.append(',');
        sb.append("cob");
        sb.append('=');
        sb.append(((this.cob == null)?"<null>":this.cob));
        sb.append(',');
        sb.append("cofi");
        sb.append('=');
        sb.append(((this.cofi == null)?"<null>":this.cofi));
        sb.append(',');
        sb.append("coin");
        sb.append('=');
        sb.append(((this.coin == null)?"<null>":this.coin));
        sb.append(',');
        sb.append("coni");
        sb.append('=');
        sb.append(((this.coni == null)?"<null>":this.coni));
        sb.append(',');
        sb.append("cosm");
        sb.append('=');
        sb.append(((this.cosm == null)?"<null>":this.cosm));
        sb.append(',');
        sb.append("cot");
        sb.append('=');
        sb.append(((this.cot == null)?"<null>":this.cot));
        sb.append(',');
        sb.append("cou");
        sb.append('=');
        sb.append(((this.cou == null)?"<null>":this.cou));
        sb.append(',');
        sb.append("cov");
        sb.append('=');
        sb.append(((this.cov == null)?"<null>":this.cov));
        sb.append(',');
        sb.append("cova");
        sb.append('=');
        sb.append(((this.cova == null)?"<null>":this.cova));
        sb.append(',');
        sb.append("cpay");
        sb.append('=');
        sb.append(((this.cpay == null)?"<null>":this.cpay));
        sb.append(',');
        sb.append("cpch");
        sb.append('=');
        sb.append(((this.cpch == null)?"<null>":this.cpch));
        sb.append(',');
        sb.append("cpt");
        sb.append('=');
        sb.append(((this.cpt == null)?"<null>":this.cpt));
        sb.append(',');
        sb.append("cpy");
        sb.append('=');
        sb.append(((this.cpy == null)?"<null>":this.cpy));
        sb.append(',');
        sb.append("crb");
        sb.append('=');
        sb.append(((this.crb == null)?"<null>":this.crb));
        sb.append(',');
        sb.append("crds");
        sb.append('=');
        sb.append(((this.crds == null)?"<null>":this.crds));
        sb.append(',');
        sb.append("cred");
        sb.append('=');
        sb.append(((this.cred == null)?"<null>":this.cred));
        sb.append(',');
        sb.append("credo");
        sb.append('=');
        sb.append(((this.credo == null)?"<null>":this.credo));
        sb.append(',');
        sb.append("cro");
        sb.append('=');
        sb.append(((this.cro == null)?"<null>":this.cro));
        sb.append(',');
        sb.append("crpt");
        sb.append('=');
        sb.append(((this.crpt == null)?"<null>":this.crpt));
        sb.append(',');
        sb.append("cryc");
        sb.append('=');
        sb.append(((this.cryc == null)?"<null>":this.cryc));
        sb.append(',');
        sb.append("csen");
        sb.append('=');
        sb.append(((this.csen == null)?"<null>":this.csen));
        sb.append(',');
        sb.append("csm");
        sb.append('=');
        sb.append(((this.csm == null)?"<null>":this.csm));
        sb.append(',');
        sb.append("csno");
        sb.append('=');
        sb.append(((this.csno == null)?"<null>":this.csno));
        sb.append(',');
        sb.append("csp");
        sb.append('=');
        sb.append(((this.csp == null)?"<null>":this.csp));
        sb.append(',');
        sb.append("ctxc");
        sb.append('=');
        sb.append(((this.ctxc == null)?"<null>":this.ctxc));
        sb.append(',');
        sb.append("cube");
        sb.append('=');
        sb.append(((this.cube == null)?"<null>":this.cube));
        sb.append(',');
        sb.append("cv");
        sb.append('=');
        sb.append(((this.cv == null)?"<null>":this.cv));
        sb.append(',');
        sb.append("cvc");
        sb.append('=');
        sb.append(((this.cvc == null)?"<null>":this.cvc));
        sb.append(',');
        sb.append("cvt");
        sb.append('=');
        sb.append(((this.cvt == null)?"<null>":this.cvt));
        sb.append(',');
        sb.append("cxo");
        sb.append('=');
        sb.append(((this.cxo == null)?"<null>":this.cxo));
        sb.append(',');
        sb.append("dacc");
        sb.append('=');
        sb.append(((this.dacc == null)?"<null>":this.dacc));
        sb.append(',');
        sb.append("dadi");
        sb.append('=');
        sb.append(((this.dadi == null)?"<null>":this.dadi));
        sb.append(',');
        sb.append("dag");
        sb.append('=');
        sb.append(((this.dag == null)?"<null>":this.dag));
        sb.append(',');
        sb.append("dagt");
        sb.append('=');
        sb.append(((this.dagt == null)?"<null>":this.dagt));
        sb.append(',');
        sb.append("dai");
        sb.append('=');
        sb.append(((this.dai == null)?"<null>":this.dai));
        sb.append(',');
        sb.append("dan");
        sb.append('=');
        sb.append(((this.dan == null)?"<null>":this.dan));
        sb.append(',');
        sb.append("daoc");
        sb.append('=');
        sb.append(((this.daoc == null)?"<null>":this.daoc));
        sb.append(',');
        sb.append("daps");
        sb.append('=');
        sb.append(((this.daps == null)?"<null>":this.daps));
        sb.append(',');
        sb.append("dash");
        sb.append('=');
        sb.append(((this.dash == null)?"<null>":this.dash));
        sb.append(',');
        sb.append("dat");
        sb.append('=');
        sb.append(((this.dat == null)?"<null>":this.dat));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("datx");
        sb.append('=');
        sb.append(((this.datx == null)?"<null>":this.datx));
        sb.append(',');
        sb.append("dav");
        sb.append('=');
        sb.append(((this.dav == null)?"<null>":this.dav));
        sb.append(',');
        sb.append("dax");
        sb.append('=');
        sb.append(((this.dax == null)?"<null>":this.dax));
        sb.append(',');
        sb.append("day");
        sb.append('=');
        sb.append(((this.day == null)?"<null>":this.day));
        sb.append(',');
        sb.append("dbet");
        sb.append('=');
        sb.append(((this.dbet == null)?"<null>":this.dbet));
        sb.append(',');
        sb.append("dcn");
        sb.append('=');
        sb.append(((this.dcn == null)?"<null>":this.dcn));
        sb.append(',');
        sb.append("ddd");
        sb.append('=');
        sb.append(((this.ddd == null)?"<null>":this.ddd));
        sb.append(',');
        sb.append("deb");
        sb.append('=');
        sb.append(((this.deb == null)?"<null>":this.deb));
        sb.append(',');
        sb.append("dec");
        sb.append('=');
        sb.append(((this.dec == null)?"<null>":this.dec));
        sb.append(',');
        sb.append("dent");
        sb.append('=');
        sb.append(((this.dent == null)?"<null>":this.dent));
        sb.append(',');
        sb.append("dfxt");
        sb.append('=');
        sb.append(((this.dfxt == null)?"<null>":this.dfxt));
        sb.append(',');
        sb.append("dgd");
        sb.append('=');
        sb.append(((this.dgd == null)?"<null>":this.dgd));
        sb.append(',');
        sb.append("dgtx");
        sb.append('=');
        sb.append(((this.dgtx == null)?"<null>":this.dgtx));
        sb.append(',');
        sb.append("dgx");
        sb.append('=');
        sb.append(((this.dgx == null)?"<null>":this.dgx));
        sb.append(',');
        sb.append("dice");
        sb.append('=');
        sb.append(((this.dice == null)?"<null>":this.dice));
        sb.append(',');
        sb.append("dig");
        sb.append('=');
        sb.append(((this.dig == null)?"<null>":this.dig));
        sb.append(',');
        sb.append("dio");
        sb.append('=');
        sb.append(((this.dio == null)?"<null>":this.dio));
        sb.append(',');
        sb.append("dlt");
        sb.append('=');
        sb.append(((this.dlt == null)?"<null>":this.dlt));
        sb.append(',');
        sb.append("dml");
        sb.append('=');
        sb.append(((this.dml == null)?"<null>":this.dml));
        sb.append(',');
        sb.append("dmt");
        sb.append('=');
        sb.append(((this.dmt == null)?"<null>":this.dmt));
        sb.append(',');
        sb.append("dna");
        sb.append('=');
        sb.append(((this.dna == null)?"<null>":this.dna));
        sb.append(',');
        sb.append("dnt");
        sb.append('=');
        sb.append(((this.dnt == null)?"<null>":this.dnt));
        sb.append(',');
        sb.append("dock");
        sb.append('=');
        sb.append(((this.dock == null)?"<null>":this.dock));
        sb.append(',');
        sb.append("doge");
        sb.append('=');
        sb.append(((this.doge == null)?"<null>":this.doge));
        sb.append(',');
        sb.append("dooh");
        sb.append('=');
        sb.append(((this.dooh == null)?"<null>":this.dooh));
        sb.append(',');
        sb.append("dov");
        sb.append('=');
        sb.append(((this.dov == null)?"<null>":this.dov));
        sb.append(',');
        sb.append("dow");
        sb.append('=');
        sb.append(((this.dow == null)?"<null>":this.dow));
        sb.append(',');
        sb.append("dpy");
        sb.append('=');
        sb.append(((this.dpy == null)?"<null>":this.dpy));
        sb.append(',');
        sb.append("drg");
        sb.append('=');
        sb.append(((this.drg == null)?"<null>":this.drg));
        sb.append(',');
        sb.append("drgn");
        sb.append('=');
        sb.append(((this.drgn == null)?"<null>":this.drgn));
        sb.append(',');
        sb.append("drop");
        sb.append('=');
        sb.append(((this.drop == null)?"<null>":this.drop));
        sb.append(',');
        sb.append("drpu");
        sb.append('=');
        sb.append(((this.drpu == null)?"<null>":this.drpu));
        sb.append(',');
        sb.append("drt");
        sb.append('=');
        sb.append(((this.drt == null)?"<null>":this.drt));
        sb.append(',');
        sb.append("dth");
        sb.append('=');
        sb.append(((this.dth == null)?"<null>":this.dth));
        sb.append(',');
        sb.append("dtr");
        sb.append('=');
        sb.append(((this.dtr == null)?"<null>":this.dtr));
        sb.append(',');
        sb.append("dtrc");
        sb.append('=');
        sb.append(((this.dtrc == null)?"<null>":this.dtrc));
        sb.append(',');
        sb.append("dtx");
        sb.append('=');
        sb.append(((this.dtx == null)?"<null>":this.dtx));
        sb.append(',');
        sb.append("dxt");
        sb.append('=');
        sb.append(((this.dxt == null)?"<null>":this.dxt));
        sb.append(',');
        sb.append("earth");
        sb.append('=');
        sb.append(((this.earth == null)?"<null>":this.earth));
        sb.append(',');
        sb.append("ebc");
        sb.append('=');
        sb.append(((this.ebc == null)?"<null>":this.ebc));
        sb.append(',');
        sb.append("ebtc");
        sb.append('=');
        sb.append(((this.ebtc == null)?"<null>":this.ebtc));
        sb.append(',');
        sb.append("ecash");
        sb.append('=');
        sb.append(((this.ecash == null)?"<null>":this.ecash));
        sb.append(',');
        sb.append("echt");
        sb.append('=');
        sb.append(((this.echt == null)?"<null>":this.echt));
        sb.append(',');
        sb.append("ecom");
        sb.append('=');
        sb.append(((this.ecom == null)?"<null>":this.ecom));
        sb.append(',');
        sb.append("ecte");
        sb.append('=');
        sb.append(((this.ecte == null)?"<null>":this.ecte));
        sb.append(',');
        sb.append("edg");
        sb.append('=');
        sb.append(((this.edg == null)?"<null>":this.edg));
        sb.append(',');
        sb.append("edn");
        sb.append('=');
        sb.append(((this.edn == null)?"<null>":this.edn));
        sb.append(',');
        sb.append("edo");
        sb.append('=');
        sb.append(((this.edo == null)?"<null>":this.edo));
        sb.append(',');
        sb.append("edu");
        sb.append('=');
        sb.append(((this.edu == null)?"<null>":this.edu));
        sb.append(',');
        sb.append("egcc");
        sb.append('=');
        sb.append(((this.egcc == null)?"<null>":this.egcc));
        sb.append(',');
        sb.append("egt");
        sb.append('=');
        sb.append(((this.egt == null)?"<null>":this.egt));
        sb.append(',');
        sb.append("eko");
        sb.append('=');
        sb.append(((this.eko == null)?"<null>":this.eko));
        sb.append(',');
        sb.append("ekt");
        sb.append('=');
        sb.append(((this.ekt == null)?"<null>":this.ekt));
        sb.append(',');
        sb.append("elec");
        sb.append('=');
        sb.append(((this.elec == null)?"<null>":this.elec));
        sb.append(',');
        sb.append("elf");
        sb.append('=');
        sb.append(((this.elf == null)?"<null>":this.elf));
        sb.append(',');
        sb.append("eli");
        sb.append('=');
        sb.append(((this.eli == null)?"<null>":this.eli));
        sb.append(',');
        sb.append("elite");
        sb.append('=');
        sb.append(((this.elite == null)?"<null>":this.elite));
        sb.append(',');
        sb.append("elix");
        sb.append('=');
        sb.append(((this.elix == null)?"<null>":this.elix));
        sb.append(',');
        sb.append("eltcoin");
        sb.append('=');
        sb.append(((this.eltcoin == null)?"<null>":this.eltcoin));
        sb.append(',');
        sb.append("ely");
        sb.append('=');
        sb.append(((this.ely == null)?"<null>":this.ely));
        sb.append(',');
        sb.append("emph");
        sb.append('=');
        sb.append(((this.emph == null)?"<null>":this.emph));
        sb.append(',');
        sb.append("engt");
        sb.append('=');
        sb.append(((this.engt == null)?"<null>":this.engt));
        sb.append(',');
        sb.append("enj");
        sb.append('=');
        sb.append(((this.enj == null)?"<null>":this.enj));
        sb.append(',');
        sb.append("enter");
        sb.append('=');
        sb.append(((this.enter == null)?"<null>":this.enter));
        sb.append(',');
        sb.append("eosdac");
        sb.append('=');
        sb.append(((this.eosdac == null)?"<null>":this.eosdac));
        sb.append(',');
        sb.append("equal");
        sb.append('=');
        sb.append(((this.equal == null)?"<null>":this.equal));
        sb.append(',');
        sb.append("erc20");
        sb.append('=');
        sb.append(((this.erc20 == null)?"<null>":this.erc20));
        sb.append(',');
        sb.append("eris");
        sb.append('=');
        sb.append(((this.eris == null)?"<null>":this.eris));
        sb.append(',');
        sb.append("ero");
        sb.append('=');
        sb.append(((this.ero == null)?"<null>":this.ero));
        sb.append(',');
        sb.append("ess");
        sb.append('=');
        sb.append(((this.ess == null)?"<null>":this.ess));
        sb.append(',');
        sb.append("est");
        sb.append('=');
        sb.append(((this.est == null)?"<null>":this.est));
        sb.append(',');
        sb.append("esz");
        sb.append('=');
        sb.append(((this.esz == null)?"<null>":this.esz));
        sb.append(',');
        sb.append("etbs");
        sb.append('=');
        sb.append(((this.etbs == null)?"<null>":this.etbs));
        sb.append(',');
        sb.append("etc");
        sb.append('=');
        sb.append(((this.etc == null)?"<null>":this.etc));
        sb.append(',');
        sb.append("etg");
        sb.append('=');
        sb.append(((this.etg == null)?"<null>":this.etg));
        sb.append(',');
        sb.append("etgp");
        sb.append('=');
        sb.append(((this.etgp == null)?"<null>":this.etgp));
        sb.append(',');
        sb.append("eth");
        sb.append('=');
        sb.append(((this.eth == null)?"<null>":this.eth));
        sb.append(',');
        sb.append("ethm");
        sb.append('=');
        sb.append(((this.ethm == null)?"<null>":this.ethm));
        sb.append(',');
        sb.append("ethos");
        sb.append('=');
        sb.append(((this.ethos == null)?"<null>":this.ethos));
        sb.append(',');
        sb.append("etk");
        sb.append('=');
        sb.append(((this.etk == null)?"<null>":this.etk));
        sb.append(',');
        sb.append("etn");
        sb.append('=');
        sb.append(((this.etn == null)?"<null>":this.etn));
        sb.append(',');
        sb.append("eurs");
        sb.append('=');
        sb.append(((this.eurs == null)?"<null>":this.eurs));
        sb.append(',');
        sb.append("evc");
        sb.append('=');
        sb.append(((this.evc == null)?"<null>":this.evc));
        sb.append(',');
        sb.append("eve");
        sb.append('=');
        sb.append(((this.eve == null)?"<null>":this.eve));
        sb.append(',');
        sb.append("eved");
        sb.append('=');
        sb.append(((this.eved == null)?"<null>":this.eved));
        sb.append(',');
        sb.append("evr");
        sb.append('=');
        sb.append(((this.evr == null)?"<null>":this.evr));
        sb.append(',');
        sb.append("evx");
        sb.append('=');
        sb.append(((this.evx == null)?"<null>":this.evx));
        sb.append(',');
        sb.append("exc");
        sb.append('=');
        sb.append(((this.exc == null)?"<null>":this.exc));
        sb.append(',');
        sb.append("exmr");
        sb.append('=');
        sb.append(((this.exmr == null)?"<null>":this.exmr));
        sb.append(',');
        sb.append("exrn");
        sb.append('=');
        sb.append(((this.exrn == null)?"<null>":this.exrn));
        sb.append(',');
        sb.append("exy");
        sb.append('=');
        sb.append(((this.exy == null)?"<null>":this.exy));
        sb.append(',');
        sb.append("face");
        sb.append('=');
        sb.append(((this.face == null)?"<null>":this.face));
        sb.append(',');
        sb.append("fairg");
        sb.append('=');
        sb.append(((this.fairg == null)?"<null>":this.fairg));
        sb.append(',');
        sb.append("fat");
        sb.append('=');
        sb.append(((this.fat == null)?"<null>":this.fat));
        sb.append(',');
        sb.append("fdx");
        sb.append('=');
        sb.append(((this.fdx == null)?"<null>":this.fdx));
        sb.append(',');
        sb.append("fdz");
        sb.append('=');
        sb.append(((this.fdz == null)?"<null>":this.fdz));
        sb.append(',');
        sb.append("fet");
        sb.append('=');
        sb.append(((this.fet == null)?"<null>":this.fet));
        sb.append(',');
        sb.append("flik");
        sb.append('=');
        sb.append(((this.flik == null)?"<null>":this.flik));
        sb.append(',');
        sb.append("flixx");
        sb.append('=');
        sb.append(((this.flixx == null)?"<null>":this.flixx));
        sb.append(',');
        sb.append("flot");
        sb.append('=');
        sb.append(((this.flot == null)?"<null>":this.flot));
        sb.append(',');
        sb.append("fluz");
        sb.append('=');
        sb.append(((this.fluz == null)?"<null>":this.fluz));
        sb.append(',');
        sb.append("fnd");
        sb.append('=');
        sb.append(((this.fnd == null)?"<null>":this.fnd));
        sb.append(',');
        sb.append("fntb");
        sb.append('=');
        sb.append(((this.fntb == null)?"<null>":this.fntb));
        sb.append(',');
        sb.append("foam");
        sb.append('=');
        sb.append(((this.foam == null)?"<null>":this.foam));
        sb.append(',');
        sb.append("fota");
        sb.append('=');
        sb.append(((this.fota == null)?"<null>":this.fota));
        sb.append(',');
        sb.append("foxt");
        sb.append('=');
        sb.append(((this.foxt == null)?"<null>":this.foxt));
        sb.append(',');
        sb.append("frec");
        sb.append('=');
        sb.append(((this.frec == null)?"<null>":this.frec));
        sb.append(',');
        sb.append("free");
        sb.append('=');
        sb.append(((this.free == null)?"<null>":this.free));
        sb.append(',');
        sb.append("fsn");
        sb.append('=');
        sb.append(((this.fsn == null)?"<null>":this.fsn));
        sb.append(',');
        sb.append("ft");
        sb.append('=');
        sb.append(((this.ft == null)?"<null>":this.ft));
        sb.append(',');
        sb.append("ftm");
        sb.append('=');
        sb.append(((this.ftm == null)?"<null>":this.ftm));
        sb.append(',');
        sb.append("ftt");
        sb.append('=');
        sb.append(((this.ftt == null)?"<null>":this.ftt));
        sb.append(',');
        sb.append("ftx");
        sb.append('=');
        sb.append(((this.ftx == null)?"<null>":this.ftx));
        sb.append(',');
        sb.append("fuel");
        sb.append('=');
        sb.append(((this.fuel == null)?"<null>":this.fuel));
        sb.append(',');
        sb.append("fun");
        sb.append('=');
        sb.append(((this.fun == null)?"<null>":this.fun));
        sb.append(',');
        sb.append("fundz");
        sb.append('=');
        sb.append(((this.fundz == null)?"<null>":this.fundz));
        sb.append(',');
        sb.append("fxt");
        sb.append('=');
        sb.append(((this.fxt == null)?"<null>":this.fxt));
        sb.append(',');
        sb.append("fyp");
        sb.append('=');
        sb.append(((this.fyp == null)?"<null>":this.fyp));
        sb.append(',');
        sb.append("gamb");
        sb.append('=');
        sb.append(((this.gamb == null)?"<null>":this.gamb));
        sb.append(',');
        sb.append("gard");
        sb.append('=');
        sb.append(((this.gard == null)?"<null>":this.gard));
        sb.append(',');
        sb.append("gem");
        sb.append('=');
        sb.append(((this.gem == null)?"<null>":this.gem));
        sb.append(',');
        sb.append("gene");
        sb.append('=');
        sb.append(((this.gene == null)?"<null>":this.gene));
        sb.append(',');
        sb.append("gens");
        sb.append('=');
        sb.append(((this.gens == null)?"<null>":this.gens));
        sb.append(',');
        sb.append("getx");
        sb.append('=');
        sb.append(((this.getx == null)?"<null>":this.getx));
        sb.append(',');
        sb.append("gno");
        sb.append('=');
        sb.append(((this.gno == null)?"<null>":this.gno));
        sb.append(',');
        sb.append("gnt");
        sb.append('=');
        sb.append(((this.gnt == null)?"<null>":this.gnt));
        sb.append(',');
        sb.append("gnx");
        sb.append('=');
        sb.append(((this.gnx == null)?"<null>":this.gnx));
        sb.append(',');
        sb.append("good");
        sb.append('=');
        sb.append(((this.good == null)?"<null>":this.good));
        sb.append(',');
        sb.append("grid");
        sb.append('=');
        sb.append(((this.grid == null)?"<null>":this.grid));
        sb.append(',');
        sb.append("grmd");
        sb.append('=');
        sb.append(((this.grmd == null)?"<null>":this.grmd));
        sb.append(',');
        sb.append("grx");
        sb.append('=');
        sb.append(((this.grx == null)?"<null>":this.grx));
        sb.append(',');
        sb.append("gsc");
        sb.append('=');
        sb.append(((this.gsc == null)?"<null>":this.gsc));
        sb.append(',');
        sb.append("gst");
        sb.append('=');
        sb.append(((this.gst == null)?"<null>":this.gst));
        sb.append(',');
        sb.append("gtc");
        sb.append('=');
        sb.append(((this.gtc == null)?"<null>":this.gtc));
        sb.append(',');
        sb.append("gto");
        sb.append('=');
        sb.append(((this.gto == null)?"<null>":this.gto));
        sb.append(',');
        sb.append("guess");
        sb.append('=');
        sb.append(((this.guess == null)?"<null>":this.guess));
        sb.append(',');
        sb.append("gup");
        sb.append('=');
        sb.append(((this.gup == null)?"<null>":this.gup));
        sb.append(',');
        sb.append("gusd");
        sb.append('=');
        sb.append(((this.gusd == null)?"<null>":this.gusd));
        sb.append(',');
        sb.append("gve");
        sb.append('=');
        sb.append(((this.gve == null)?"<null>":this.gve));
        sb.append(',');
        sb.append("gvt");
        sb.append('=');
        sb.append(((this.gvt == null)?"<null>":this.gvt));
        sb.append(',');
        sb.append("hand");
        sb.append('=');
        sb.append(((this.hand == null)?"<null>":this.hand));
        sb.append(',');
        sb.append("hb");
        sb.append('=');
        sb.append(((this.hb == null)?"<null>":this.hb));
        sb.append(',');
        sb.append("hbt");
        sb.append('=');
        sb.append(((this.hbt == null)?"<null>":this.hbt));
        sb.append(',');
        sb.append("hbz");
        sb.append('=');
        sb.append(((this.hbz == null)?"<null>":this.hbz));
        sb.append(',');
        sb.append("hedg");
        sb.append('=');
        sb.append(((this.hedg == null)?"<null>":this.hedg));
        sb.append(',');
        sb.append("her");
        sb.append('=');
        sb.append(((this.her == null)?"<null>":this.her));
        sb.append(',');
        sb.append("hero");
        sb.append('=');
        sb.append(((this.hero == null)?"<null>":this.hero));
        sb.append(',');
        sb.append("hgt");
        sb.append('=');
        sb.append(((this.hgt == null)?"<null>":this.hgt));
        sb.append(',');
        sb.append("hit");
        sb.append('=');
        sb.append(((this.hit == null)?"<null>":this.hit));
        sb.append(',');
        sb.append("hkn");
        sb.append('=');
        sb.append(((this.hkn == null)?"<null>":this.hkn));
        sb.append(',');
        sb.append("hmc");
        sb.append('=');
        sb.append(((this.hmc == null)?"<null>":this.hmc));
        sb.append(',');
        sb.append("hmq");
        sb.append('=');
        sb.append(((this.hmq == null)?"<null>":this.hmq));
        sb.append(',');
        sb.append("horse");
        sb.append('=');
        sb.append(((this.horse == null)?"<null>":this.horse));
        sb.append(',');
        sb.append("hpb");
        sb.append('=');
        sb.append(((this.hpb == null)?"<null>":this.hpb));
        sb.append(',');
        sb.append("hpt");
        sb.append('=');
        sb.append(((this.hpt == null)?"<null>":this.hpt));
        sb.append(',');
        sb.append("hqt");
        sb.append('=');
        sb.append(((this.hqt == null)?"<null>":this.hqt));
        sb.append(',');
        sb.append("hqx");
        sb.append('=');
        sb.append(((this.hqx == null)?"<null>":this.hqx));
        sb.append(',');
        sb.append("hsc");
        sb.append('=');
        sb.append(((this.hsc == null)?"<null>":this.hsc));
        sb.append(',');
        sb.append("hst");
        sb.append('=');
        sb.append(((this.hst == null)?"<null>":this.hst));
        sb.append(',');
        sb.append("ht");
        sb.append('=');
        sb.append(((this.ht == null)?"<null>":this.ht));
        sb.append(',');
        sb.append("hur");
        sb.append('=');
        sb.append(((this.hur == null)?"<null>":this.hur));
        sb.append(',');
        sb.append("hvn");
        sb.append('=');
        sb.append(((this.hvn == null)?"<null>":this.hvn));
        sb.append(',');
        sb.append("hydro");
        sb.append('=');
        sb.append(((this.hydro == null)?"<null>":this.hydro));
        sb.append(',');
        sb.append("hyt");
        sb.append('=');
        sb.append(((this.hyt == null)?"<null>":this.hyt));
        sb.append(',');
        sb.append("ichx");
        sb.append('=');
        sb.append(((this.ichx == null)?"<null>":this.ichx));
        sb.append(',');
        sb.append("icn");
        sb.append('=');
        sb.append(((this.icn == null)?"<null>":this.icn));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("idex");
        sb.append('=');
        sb.append(((this.idex == null)?"<null>":this.idex));
        sb.append(',');
        sb.append("idh");
        sb.append('=');
        sb.append(((this.idh == null)?"<null>":this.idh));
        sb.append(',');
        sb.append("idt");
        sb.append('=');
        sb.append(((this.idt == null)?"<null>":this.idt));
        sb.append(',');
        sb.append("idxm");
        sb.append('=');
        sb.append(((this.idxm == null)?"<null>":this.idxm));
        sb.append(',');
        sb.append("ieth");
        sb.append('=');
        sb.append(((this.ieth == null)?"<null>":this.ieth));
        sb.append(',');
        sb.append("ift");
        sb.append('=');
        sb.append(((this.ift == null)?"<null>":this.ift));
        sb.append(',');
        sb.append("ig");
        sb.append('=');
        sb.append(((this.ig == null)?"<null>":this.ig));
        sb.append(',');
        sb.append("ihf");
        sb.append('=');
        sb.append(((this.ihf == null)?"<null>":this.ihf));
        sb.append(',');
        sb.append("iht");
        sb.append('=');
        sb.append(((this.iht == null)?"<null>":this.iht));
        sb.append(',');
        sb.append("imt");
        sb.append('=');
        sb.append(((this.imt == null)?"<null>":this.imt));
        sb.append(',');
        sb.append("ind");
        sb.append('=');
        sb.append(((this.ind == null)?"<null>":this.ind));
        sb.append(',');
        sb.append("ing");
        sb.append('=');
        sb.append(((this.ing == null)?"<null>":this.ing));
        sb.append(',');
        sb.append("ins");
        sb.append('=');
        sb.append(((this.ins == null)?"<null>":this.ins));
        sb.append(',');
        sb.append("instar");
        sb.append('=');
        sb.append(((this.instar == null)?"<null>":this.instar));
        sb.append(',');
        sb.append("_int");
        sb.append('=');
        sb.append(((this._int == null)?"<null>":this._int));
        sb.append(',');
        sb.append("invc");
        sb.append('=');
        sb.append(((this.invc == null)?"<null>":this.invc));
        sb.append(',');
        sb.append("inx");
        sb.append('=');
        sb.append(((this.inx == null)?"<null>":this.inx));
        sb.append(',');
        sb.append("inxt");
        sb.append('=');
        sb.append(((this.inxt == null)?"<null>":this.inxt));
        sb.append(',');
        sb.append("iost");
        sb.append('=');
        sb.append(((this.iost == null)?"<null>":this.iost));
        sb.append(',');
        sb.append("iotx");
        sb.append('=');
        sb.append(((this.iotx == null)?"<null>":this.iotx));
        sb.append(',');
        sb.append("ipc");
        sb.append('=');
        sb.append(((this.ipc == null)?"<null>":this.ipc));
        sb.append(',');
        sb.append("ipsx");
        sb.append('=');
        sb.append(((this.ipsx == null)?"<null>":this.ipsx));
        sb.append(',');
        sb.append("iqn");
        sb.append('=');
        sb.append(((this.iqn == null)?"<null>":this.iqn));
        sb.append(',');
        sb.append("isr");
        sb.append('=');
        sb.append(((this.isr == null)?"<null>":this.isr));
        sb.append(',');
        sb.append("itc");
        sb.append('=');
        sb.append(((this.itc == null)?"<null>":this.itc));
        sb.append(',');
        sb.append("itl");
        sb.append('=');
        sb.append(((this.itl == null)?"<null>":this.itl));
        sb.append(',');
        sb.append("itt");
        sb.append('=');
        sb.append(((this.itt == null)?"<null>":this.itt));
        sb.append(',');
        sb.append("ivy");
        sb.append('=');
        sb.append(((this.ivy == null)?"<null>":this.ivy));
        sb.append(',');
        sb.append("ixt");
        sb.append('=');
        sb.append(((this.ixt == null)?"<null>":this.ixt));
        sb.append(',');
        sb.append("j8t");
        sb.append('=');
        sb.append(((this.j8t == null)?"<null>":this.j8t));
        sb.append(',');
        sb.append("jc");
        sb.append('=');
        sb.append(((this.jc == null)?"<null>":this.jc));
        sb.append(',');
        sb.append("jet");
        sb.append('=');
        sb.append(((this.jet == null)?"<null>":this.jet));
        sb.append(',');
        sb.append("jnt");
        sb.append('=');
        sb.append(((this.jnt == null)?"<null>":this.jnt));
        sb.append(',');
        sb.append("joint");
        sb.append('=');
        sb.append(((this.joint == null)?"<null>":this.joint));
        sb.append(',');
        sb.append("jse");
        sb.append('=');
        sb.append(((this.jse == null)?"<null>":this.jse));
        sb.append(',');
        sb.append("kan");
        sb.append('=');
        sb.append(((this.kan == null)?"<null>":this.kan));
        sb.append(',');
        sb.append("kbc");
        sb.append('=');
        sb.append(((this.kbc == null)?"<null>":this.kbc));
        sb.append(',');
        sb.append("kcash");
        sb.append('=');
        sb.append(((this.kcash == null)?"<null>":this.kcash));
        sb.append(',');
        sb.append("kcs");
        sb.append('=');
        sb.append(((this.kcs == null)?"<null>":this.kcs));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("kick");
        sb.append('=');
        sb.append(((this.kick == null)?"<null>":this.kick));
        sb.append(',');
        sb.append("kin");
        sb.append('=');
        sb.append(((this.kin == null)?"<null>":this.kin));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("knc");
        sb.append('=');
        sb.append(((this.knc == null)?"<null>":this.knc));
        sb.append(',');
        sb.append("krl");
        sb.append('=');
        sb.append(((this.krl == null)?"<null>":this.krl));
        sb.append(',');
        sb.append("kue");
        sb.append('=');
        sb.append(((this.kue == null)?"<null>":this.kue));
        sb.append(',');
        sb.append("kwh");
        sb.append('=');
        sb.append(((this.kwh == null)?"<null>":this.kwh));
        sb.append(',');
        sb.append("la");
        sb.append('=');
        sb.append(((this.la == null)?"<null>":this.la));
        sb.append(',');
        sb.append("lala");
        sb.append('=');
        sb.append(((this.lala == null)?"<null>":this.lala));
        sb.append(',');
        sb.append("lamb");
        sb.append('=');
        sb.append(((this.lamb == null)?"<null>":this.lamb));
        sb.append(',');
        sb.append("latx");
        sb.append('=');
        sb.append(((this.latx == null)?"<null>":this.latx));
        sb.append(',');
        sb.append("lcs");
        sb.append('=');
        sb.append(((this.lcs == null)?"<null>":this.lcs));
        sb.append(',');
        sb.append("ldc");
        sb.append('=');
        sb.append(((this.ldc == null)?"<null>":this.ldc));
        sb.append(',');
        sb.append("ledu");
        sb.append('=');
        sb.append(((this.ledu == null)?"<null>":this.ledu));
        sb.append(',');
        sb.append("lend");
        sb.append('=');
        sb.append(((this.lend == null)?"<null>":this.lend));
        sb.append(',');
        sb.append("lev");
        sb.append('=');
        sb.append(((this.lev == null)?"<null>":this.lev));
        sb.append(',');
        sb.append("lgo");
        sb.append('=');
        sb.append(((this.lgo == null)?"<null>":this.lgo));
        sb.append(',');
        sb.append("lif");
        sb.append('=');
        sb.append(((this.lif == null)?"<null>":this.lif));
        sb.append(',');
        sb.append("life");
        sb.append('=');
        sb.append(((this.life == null)?"<null>":this.life));
        sb.append(',');
        sb.append("like");
        sb.append('=');
        sb.append(((this.like == null)?"<null>":this.like));
        sb.append(',');
        sb.append("lina");
        sb.append('=');
        sb.append(((this.lina == null)?"<null>":this.lina));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("lion");
        sb.append('=');
        sb.append(((this.lion == null)?"<null>":this.lion));
        sb.append(',');
        sb.append("lnc");
        sb.append('=');
        sb.append(((this.lnc == null)?"<null>":this.lnc));
        sb.append(',');
        sb.append("lnd");
        sb.append('=');
        sb.append(((this.lnd == null)?"<null>":this.lnd));
        sb.append(',');
        sb.append("loci");
        sb.append('=');
        sb.append(((this.loci == null)?"<null>":this.loci));
        sb.append(',');
        sb.append("lock");
        sb.append('=');
        sb.append(((this.lock == null)?"<null>":this.lock));
        sb.append(',');
        sb.append("loom");
        sb.append('=');
        sb.append(((this.loom == null)?"<null>":this.loom));
        sb.append(',');
        sb.append("lpt");
        sb.append('=');
        sb.append(((this.lpt == null)?"<null>":this.lpt));
        sb.append(',');
        sb.append("lqdn");
        sb.append('=');
        sb.append(((this.lqdn == null)?"<null>":this.lqdn));
        sb.append(',');
        sb.append("lrc");
        sb.append('=');
        sb.append(((this.lrc == null)?"<null>":this.lrc));
        sb.append(',');
        sb.append("lst");
        sb.append('=');
        sb.append(((this.lst == null)?"<null>":this.lst));
        sb.append(',');
        sb.append("ltc");
        sb.append('=');
        sb.append(((this.ltc == null)?"<null>":this.ltc));
        sb.append(',');
        sb.append("lto");
        sb.append('=');
        sb.append(((this.lto == null)?"<null>":this.lto));
        sb.append(',');
        sb.append("luc");
        sb.append('=');
        sb.append(((this.luc == null)?"<null>":this.luc));
        sb.append(',');
        sb.append("lun");
        sb.append('=');
        sb.append(((this.lun == null)?"<null>":this.lun));
        sb.append(',');
        sb.append("lym");
        sb.append('=');
        sb.append(((this.lym == null)?"<null>":this.lym));
        sb.append(',');
        sb.append("m2o");
        sb.append('=');
        sb.append(((this.m2o == null)?"<null>":this.m2o));
        sb.append(',');
        sb.append("mana");
        sb.append('=');
        sb.append(((this.mana == null)?"<null>":this.mana));
        sb.append(',');
        sb.append("matic");
        sb.append('=');
        sb.append(((this.matic == null)?"<null>":this.matic));
        sb.append(',');
        sb.append("mbtx");
        sb.append('=');
        sb.append(((this.mbtx == null)?"<null>":this.mbtx));
        sb.append(',');
        sb.append("mco");
        sb.append('=');
        sb.append(((this.mco == null)?"<null>":this.mco));
        sb.append(',');
        sb.append("mda");
        sb.append('=');
        sb.append(((this.mda == null)?"<null>":this.mda));
        sb.append(',');
        sb.append("mdcl");
        sb.append('=');
        sb.append(((this.mdcl == null)?"<null>":this.mdcl));
        sb.append(',');
        sb.append("mds");
        sb.append('=');
        sb.append(((this.mds == null)?"<null>":this.mds));
        sb.append(',');
        sb.append("medx");
        sb.append('=');
        sb.append(((this.medx == null)?"<null>":this.medx));
        sb.append(',');
        sb.append("mee");
        sb.append('=');
        sb.append(((this.mee == null)?"<null>":this.mee));
        sb.append(',');
        sb.append("menlo");
        sb.append('=');
        sb.append(((this.menlo == null)?"<null>":this.menlo));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("metal");
        sb.append('=');
        sb.append(((this.metal == null)?"<null>":this.metal));
        sb.append(',');
        sb.append("metm");
        sb.append('=');
        sb.append(((this.metm == null)?"<null>":this.metm));
        sb.append(',');
        sb.append("mfg");
        sb.append('=');
        sb.append(((this.mfg == null)?"<null>":this.mfg));
        sb.append(',');
        sb.append("mft");
        sb.append('=');
        sb.append(((this.mft == null)?"<null>":this.mft));
        sb.append(',');
        sb.append("mgo");
        sb.append('=');
        sb.append(((this.mgo == null)?"<null>":this.mgo));
        sb.append(',');
        sb.append("mic");
        sb.append('=');
        sb.append(((this.mic == null)?"<null>":this.mic));
        sb.append(',');
        sb.append("mith");
        sb.append('=');
        sb.append(((this.mith == null)?"<null>":this.mith));
        sb.append(',');
        sb.append("mitx");
        sb.append('=');
        sb.append(((this.mitx == null)?"<null>":this.mitx));
        sb.append(',');
        sb.append("mixi");
        sb.append('=');
        sb.append(((this.mixi == null)?"<null>":this.mixi));
        sb.append(',');
        sb.append("mkr");
        sb.append('=');
        sb.append(((this.mkr == null)?"<null>":this.mkr));
        sb.append(',');
        sb.append("mln");
        sb.append('=');
        sb.append(((this.mln == null)?"<null>":this.mln));
        sb.append(',');
        sb.append("mnc");
        sb.append('=');
        sb.append(((this.mnc == null)?"<null>":this.mnc));
        sb.append(',');
        sb.append("mne");
        sb.append('=');
        sb.append(((this.mne == null)?"<null>":this.mne));
        sb.append(',');
        sb.append("mntp");
        sb.append('=');
        sb.append(((this.mntp == null)?"<null>":this.mntp));
        sb.append(',');
        sb.append("moac");
        sb.append('=');
        sb.append(((this.moac == null)?"<null>":this.moac));
        sb.append(',');
        sb.append("mof");
        sb.append('=');
        sb.append(((this.mof == null)?"<null>":this.mof));
        sb.append(',');
        sb.append("molk");
        sb.append('=');
        sb.append(((this.molk == null)?"<null>":this.molk));
        sb.append(',');
        sb.append("mot");
        sb.append('=');
        sb.append(((this.mot == null)?"<null>":this.mot));
        sb.append(',');
        sb.append("mrk");
        sb.append('=');
        sb.append(((this.mrk == null)?"<null>":this.mrk));
        sb.append(',');
        sb.append("mrph");
        sb.append('=');
        sb.append(((this.mrph == null)?"<null>":this.mrph));
        sb.append(',');
        sb.append("mtc");
        sb.append('=');
        sb.append(((this.mtc == null)?"<null>":this.mtc));
        sb.append(',');
        sb.append("mth");
        sb.append('=');
        sb.append(((this.mth == null)?"<null>":this.mth));
        sb.append(',');
        sb.append("mtkn");
        sb.append('=');
        sb.append(((this.mtkn == null)?"<null>":this.mtkn));
        sb.append(',');
        sb.append("mtrc");
        sb.append('=');
        sb.append(((this.mtrc == null)?"<null>":this.mtrc));
        sb.append(',');
        sb.append("mtx");
        sb.append('=');
        sb.append(((this.mtx == null)?"<null>":this.mtx));
        sb.append(',');
        sb.append("mvl");
        sb.append('=');
        sb.append(((this.mvl == null)?"<null>":this.mvl));
        sb.append(',');
        sb.append("mwat");
        sb.append('=');
        sb.append(((this.mwat == null)?"<null>":this.mwat));
        sb.append(',');
        sb.append("mxai");
        sb.append('=');
        sb.append(((this.mxai == null)?"<null>":this.mxai));
        sb.append(',');
        sb.append("mxm");
        sb.append('=');
        sb.append(((this.mxm == null)?"<null>":this.mxm));
        sb.append(',');
        sb.append("myb");
        sb.append('=');
        sb.append(((this.myb == null)?"<null>":this.myb));
        sb.append(',');
        sb.append("myst");
        sb.append('=');
        sb.append(((this.myst == null)?"<null>":this.myst));
        sb.append(',');
        sb.append("nanj");
        sb.append('=');
        sb.append(((this.nanj == null)?"<null>":this.nanj));
        sb.append(',');
        sb.append("nas");
        sb.append('=');
        sb.append(((this.nas == null)?"<null>":this.nas));
        sb.append(',');
        sb.append("navi");
        sb.append('=');
        sb.append(((this.navi == null)?"<null>":this.navi));
        sb.append(',');
        sb.append("nbai");
        sb.append('=');
        sb.append(((this.nbai == null)?"<null>":this.nbai));
        sb.append(',');
        sb.append("nbc");
        sb.append('=');
        sb.append(((this.nbc == null)?"<null>":this.nbc));
        sb.append(',');
        sb.append("ncash");
        sb.append('=');
        sb.append(((this.ncash == null)?"<null>":this.ncash));
        sb.append(',');
        sb.append("ncc");
        sb.append('=');
        sb.append(((this.ncc == null)?"<null>":this.ncc));
        sb.append(',');
        sb.append("nct");
        sb.append('=');
        sb.append(((this.nct == null)?"<null>":this.nct));
        sb.append(',');
        sb.append("nec");
        sb.append('=');
        sb.append(((this.nec == null)?"<null>":this.nec));
        sb.append(',');
        sb.append("neu");
        sb.append('=');
        sb.append(((this.neu == null)?"<null>":this.neu));
        sb.append(',');
        sb.append("nexo");
        sb.append('=');
        sb.append(((this.nexo == null)?"<null>":this.nexo));
        sb.append(',');
        sb.append("next");
        sb.append('=');
        sb.append(((this.next == null)?"<null>":this.next));
        sb.append(',');
        sb.append("ngc");
        sb.append('=');
        sb.append(((this.ngc == null)?"<null>":this.ngc));
        sb.append(',');
        sb.append("nio");
        sb.append('=');
        sb.append(((this.nio == null)?"<null>":this.nio));
        sb.append(',');
        sb.append("nmr");
        sb.append('=');
        sb.append(((this.nmr == null)?"<null>":this.nmr));
        sb.append(',');
        sb.append("noah");
        sb.append('=');
        sb.append(((this.noah == null)?"<null>":this.noah));
        sb.append(',');
        sb.append("nobs");
        sb.append('=');
        sb.append(((this.nobs == null)?"<null>":this.nobs));
        sb.append(',');
        sb.append("noku");
        sb.append('=');
        sb.append(((this.noku == null)?"<null>":this.noku));
        sb.append(',');
        sb.append("nox");
        sb.append('=');
        sb.append(((this.nox == null)?"<null>":this.nox));
        sb.append(',');
        sb.append("nper");
        sb.append('=');
        sb.append(((this.nper == null)?"<null>":this.nper));
        sb.append(',');
        sb.append("npx");
        sb.append('=');
        sb.append(((this.npx == null)?"<null>":this.npx));
        sb.append(',');
        sb.append("npxs");
        sb.append('=');
        sb.append(((this.npxs == null)?"<null>":this.npxs));
        sb.append(',');
        sb.append("nrg");
        sb.append('=');
        sb.append(((this.nrg == null)?"<null>":this.nrg));
        sb.append(',');
        sb.append("nrp");
        sb.append('=');
        sb.append(((this.nrp == null)?"<null>":this.nrp));
        sb.append(',');
        sb.append("ntk");
        sb.append('=');
        sb.append(((this.ntk == null)?"<null>":this.ntk));
        sb.append(',');
        sb.append("nuls");
        sb.append('=');
        sb.append(((this.nuls == null)?"<null>":this.nuls));
        sb.append(',');
        sb.append("nxc");
        sb.append('=');
        sb.append(((this.nxc == null)?"<null>":this.nxc));
        sb.append(',');
        sb.append("oax");
        sb.append('=');
        sb.append(((this.oax == null)?"<null>":this.oax));
        sb.append(',');
        sb.append("ocn");
        sb.append('=');
        sb.append(((this.ocn == null)?"<null>":this.ocn));
        sb.append(',');
        sb.append("ode");
        sb.append('=');
        sb.append(((this.ode == null)?"<null>":this.ode));
        sb.append(',');
        sb.append("oio");
        sb.append('=');
        sb.append(((this.oio == null)?"<null>":this.oio));
        sb.append(',');
        sb.append("okb");
        sb.append('=');
        sb.append(((this.okb == null)?"<null>":this.okb));
        sb.append(',');
        sb.append("ole");
        sb.append('=');
        sb.append(((this.ole == null)?"<null>":this.ole));
        sb.append(',');
        sb.append("olt");
        sb.append('=');
        sb.append(((this.olt == null)?"<null>":this.olt));
        sb.append(',');
        sb.append("omg");
        sb.append('=');
        sb.append(((this.omg == null)?"<null>":this.omg));
        sb.append(',');
        sb.append("omx");
        sb.append('=');
        sb.append(((this.omx == null)?"<null>":this.omx));
        sb.append(',');
        sb.append("ong");
        sb.append('=');
        sb.append(((this.ong == null)?"<null>":this.ong));
        sb.append(',');
        sb.append("onl");
        sb.append('=');
        sb.append(((this.onl == null)?"<null>":this.onl));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("opt");
        sb.append('=');
        sb.append(((this.opt == null)?"<null>":this.opt));
        sb.append(',');
        sb.append("orbs");
        sb.append('=');
        sb.append(((this.orbs == null)?"<null>":this.orbs));
        sb.append(',');
        sb.append("ori");
        sb.append('=');
        sb.append(((this.ori == null)?"<null>":this.ori));
        sb.append(',');
        sb.append("orme");
        sb.append('=');
        sb.append(((this.orme == null)?"<null>":this.orme));
        sb.append(',');
        sb.append("ors");
        sb.append('=');
        sb.append(((this.ors == null)?"<null>":this.ors));
        sb.append(',');
        sb.append("osa");
        sb.append('=');
        sb.append(((this.osa == null)?"<null>":this.osa));
        sb.append(',');
        sb.append("ost");
        sb.append('=');
        sb.append(((this.ost == null)?"<null>":this.ost));
        sb.append(',');
        sb.append("pal");
        sb.append('=');
        sb.append(((this.pal == null)?"<null>":this.pal));
        sb.append(',');
        sb.append("pareto");
        sb.append('=');
        sb.append(((this.pareto == null)?"<null>":this.pareto));
        sb.append(',');
        sb.append("pass");
        sb.append('=');
        sb.append(((this.pass == null)?"<null>":this.pass));
        sb.append(',');
        sb.append("pat");
        sb.append('=');
        sb.append(((this.pat == null)?"<null>":this.pat));
        sb.append(',');
        sb.append("pax");
        sb.append('=');
        sb.append(((this.pax == null)?"<null>":this.pax));
        sb.append(',');
        sb.append("pay");
        sb.append('=');
        sb.append(((this.pay == null)?"<null>":this.pay));
        sb.append(',');
        sb.append("pch");
        sb.append('=');
        sb.append(((this.pch == null)?"<null>":this.pch));
        sb.append(',');
        sb.append("pcl");
        sb.append('=');
        sb.append(((this.pcl == null)?"<null>":this.pcl));
        sb.append(',');
        sb.append("pco");
        sb.append('=');
        sb.append(((this.pco == null)?"<null>":this.pco));
        sb.append(',');
        sb.append("pfr");
        sb.append('=');
        sb.append(((this.pfr == null)?"<null>":this.pfr));
        sb.append(',');
        sb.append("phi");
        sb.append('=');
        sb.append(((this.phi == null)?"<null>":this.phi));
        sb.append(',');
        sb.append("pix");
        sb.append('=');
        sb.append(((this.pix == null)?"<null>":this.pix));
        sb.append(',');
        sb.append("pkt");
        sb.append('=');
        sb.append(((this.pkt == null)?"<null>":this.pkt));
        sb.append(',');
        sb.append("pla");
        sb.append('=');
        sb.append(((this.pla == null)?"<null>":this.pla));
        sb.append(',');
        sb.append("play");
        sb.append('=');
        sb.append(((this.play == null)?"<null>":this.play));
        sb.append(',');
        sb.append("plbt");
        sb.append('=');
        sb.append(((this.plbt == null)?"<null>":this.plbt));
        sb.append(',');
        sb.append("plr");
        sb.append('=');
        sb.append(((this.plr == null)?"<null>":this.plr));
        sb.append(',');
        sb.append("plu");
        sb.append('=');
        sb.append(((this.plu == null)?"<null>":this.plu));
        sb.append(',');
        sb.append("pma");
        sb.append('=');
        sb.append(((this.pma == null)?"<null>":this.pma));
        sb.append(',');
        sb.append("pmnt");
        sb.append('=');
        sb.append(((this.pmnt == null)?"<null>":this.pmnt));
        sb.append(',');
        sb.append("pnt");
        sb.append('=');
        sb.append(((this.pnt == null)?"<null>":this.pnt));
        sb.append(',');
        sb.append("poe");
        sb.append('=');
        sb.append(((this.poe == null)?"<null>":this.poe));
        sb.append(',');
        sb.append("poll");
        sb.append('=');
        sb.append(((this.poll == null)?"<null>":this.poll));
        sb.append(',');
        sb.append("poly");
        sb.append('=');
        sb.append(((this.poly == null)?"<null>":this.poly));
        sb.append(',');
        sb.append("powr");
        sb.append('=');
        sb.append(((this.powr == null)?"<null>":this.powr));
        sb.append(',');
        sb.append("ppp");
        sb.append('=');
        sb.append(((this.ppp == null)?"<null>":this.ppp));
        sb.append(',');
        sb.append("ppt");
        sb.append('=');
        sb.append(((this.ppt == null)?"<null>":this.ppt));
        sb.append(',');
        sb.append("pra");
        sb.append('=');
        sb.append(((this.pra == null)?"<null>":this.pra));
        sb.append(',');
        sb.append("prg");
        sb.append('=');
        sb.append(((this.prg == null)?"<null>":this.prg));
        sb.append(',');
        sb.append("prix");
        sb.append('=');
        sb.append(((this.prix == null)?"<null>":this.prix));
        sb.append(',');
        sb.append("pro");
        sb.append('=');
        sb.append(((this.pro == null)?"<null>":this.pro));
        sb.append(',');
        sb.append("psm");
        sb.append('=');
        sb.append(((this.psm == null)?"<null>":this.psm));
        sb.append(',');
        sb.append("pst");
        sb.append('=');
        sb.append(((this.pst == null)?"<null>":this.pst));
        sb.append(',');
        sb.append("ptoy");
        sb.append('=');
        sb.append(((this.ptoy == null)?"<null>":this.ptoy));
        sb.append(',');
        sb.append("pxg");
        sb.append('=');
        sb.append(((this.pxg == null)?"<null>":this.pxg));
        sb.append(',');
        sb.append("pylnt");
        sb.append('=');
        sb.append(((this.pylnt == null)?"<null>":this.pylnt));
        sb.append(',');
        sb.append("pyn");
        sb.append('=');
        sb.append(((this.pyn == null)?"<null>":this.pyn));
        sb.append(',');
        sb.append("qash");
        sb.append('=');
        sb.append(((this.qash == null)?"<null>":this.qash));
        sb.append(',');
        sb.append("qbit");
        sb.append('=');
        sb.append(((this.qbit == null)?"<null>":this.qbit));
        sb.append(',');
        sb.append("qcx");
        sb.append('=');
        sb.append(((this.qcx == null)?"<null>":this.qcx));
        sb.append(',');
        sb.append("qkc");
        sb.append('=');
        sb.append(((this.qkc == null)?"<null>":this.qkc));
        sb.append(',');
        sb.append("qntu");
        sb.append('=');
        sb.append(((this.qntu == null)?"<null>":this.qntu));
        sb.append(',');
        sb.append("qsp");
        sb.append('=');
        sb.append(((this.qsp == null)?"<null>":this.qsp));
        sb.append(',');
        sb.append("quant");
        sb.append('=');
        sb.append(((this.quant == null)?"<null>":this.quant));
        sb.append(',');
        sb.append("qun");
        sb.append('=');
        sb.append(((this.qun == null)?"<null>":this.qun));
        sb.append(',');
        sb.append("qusd");
        sb.append('=');
        sb.append(((this.qusd == null)?"<null>":this.qusd));
        sb.append(',');
        sb.append("r");
        sb.append('=');
        sb.append(((this.r == null)?"<null>":this.r));
        sb.append(',');
        sb.append("rcn");
        sb.append('=');
        sb.append(((this.rcn == null)?"<null>":this.rcn));
        sb.append(',');
        sb.append("rct");
        sb.append('=');
        sb.append(((this.rct == null)?"<null>":this.rct));
        sb.append(',');
        sb.append("rdc");
        sb.append('=');
        sb.append(((this.rdc == null)?"<null>":this.rdc));
        sb.append(',');
        sb.append("rdd");
        sb.append('=');
        sb.append(((this.rdd == null)?"<null>":this.rdd));
        sb.append(',');
        sb.append("real");
        sb.append('=');
        sb.append(((this.real == null)?"<null>":this.real));
        sb.append(',');
        sb.append("rebl");
        sb.append('=');
        sb.append(((this.rebl == null)?"<null>":this.rebl));
        sb.append(',');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
        sb.append(',');
        sb.append("rem");
        sb.append('=');
        sb.append(((this.rem == null)?"<null>":this.rem));
        sb.append(',');
        sb.append("rep");
        sb.append('=');
        sb.append(((this.rep == null)?"<null>":this.rep));
        sb.append(',');
        sb.append("req");
        sb.append('=');
        sb.append(((this.req == null)?"<null>":this.req));
        sb.append(',');
        sb.append("rex");
        sb.append('=');
        sb.append(((this.rex == null)?"<null>":this.rex));
        sb.append(',');
        sb.append("rfr");
        sb.append('=');
        sb.append(((this.rfr == null)?"<null>":this.rfr));
        sb.append(',');
        sb.append("rhoc");
        sb.append('=');
        sb.append(((this.rhoc == null)?"<null>":this.rhoc));
        sb.append(',');
        sb.append("riya");
        sb.append('=');
        sb.append(((this.riya == null)?"<null>":this.riya));
        sb.append(',');
        sb.append("rlc");
        sb.append('=');
        sb.append(((this.rlc == null)?"<null>":this.rlc));
        sb.append(',');
        sb.append("rlx");
        sb.append('=');
        sb.append(((this.rlx == null)?"<null>":this.rlx));
        sb.append(',');
        sb.append("rmesh");
        sb.append('=');
        sb.append(((this.rmesh == null)?"<null>":this.rmesh));
        sb.append(',');
        sb.append("rnt");
        sb.append('=');
        sb.append(((this.rnt == null)?"<null>":this.rnt));
        sb.append(',');
        sb.append("rntb");
        sb.append('=');
        sb.append(((this.rntb == null)?"<null>":this.rntb));
        sb.append(',');
        sb.append("robet");
        sb.append('=');
        sb.append(((this.robet == null)?"<null>":this.robet));
        sb.append(',');
        sb.append("rock");
        sb.append('=');
        sb.append(((this.rock == null)?"<null>":this.rock));
        sb.append(',');
        sb.append("rox");
        sb.append('=');
        sb.append(((this.rox == null)?"<null>":this.rox));
        sb.append(',');
        sb.append("rrc");
        sb.append('=');
        sb.append(((this.rrc == null)?"<null>":this.rrc));
        sb.append(',');
        sb.append("rte");
        sb.append('=');
        sb.append(((this.rte == null)?"<null>":this.rte));
        sb.append(',');
        sb.append("ruff");
        sb.append('=');
        sb.append(((this.ruff == null)?"<null>":this.ruff));
        sb.append(',');
        sb.append("rvt");
        sb.append('=');
        sb.append(((this.rvt == null)?"<null>":this.rvt));
        sb.append(',');
        sb.append("sal");
        sb.append('=');
        sb.append(((this.sal == null)?"<null>":this.sal));
        sb.append(',');
        sb.append("salt");
        sb.append('=');
        sb.append(((this.salt == null)?"<null>":this.salt));
        sb.append(',');
        sb.append("san");
        sb.append('=');
        sb.append(((this.san == null)?"<null>":this.san));
        sb.append(',');
        sb.append("scc");
        sb.append('=');
        sb.append(((this.scc == null)?"<null>":this.scc));
        sb.append(',');
        sb.append("scl");
        sb.append('=');
        sb.append(((this.scl == null)?"<null>":this.scl));
        sb.append(',');
        sb.append("scrl");
        sb.append('=');
        sb.append(((this.scrl == null)?"<null>":this.scrl));
        sb.append(',');
        sb.append("seal");
        sb.append('=');
        sb.append(((this.seal == null)?"<null>":this.seal));
        sb.append(',');
        sb.append("seele");
        sb.append('=');
        sb.append(((this.seele == null)?"<null>":this.seele));
        sb.append(',');
        sb.append("senc");
        sb.append('=');
        sb.append(((this.senc == null)?"<null>":this.senc));
        sb.append(',');
        sb.append("sent");
        sb.append('=');
        sb.append(((this.sent == null)?"<null>":this.sent));
        sb.append(',');
        sb.append("seth");
        sb.append('=');
        sb.append(((this.seth == null)?"<null>":this.seth));
        sb.append(',');
        sb.append("sgn");
        sb.append('=');
        sb.append(((this.sgn == null)?"<null>":this.sgn));
        sb.append(',');
        sb.append("sgr");
        sb.append('=');
        sb.append(((this.sgr == null)?"<null>":this.sgr));
        sb.append(',');
        sb.append("she");
        sb.append('=');
        sb.append(((this.she == null)?"<null>":this.she));
        sb.append(',');
        sb.append("ship");
        sb.append('=');
        sb.append(((this.ship == null)?"<null>":this.ship));
        sb.append(',');
        sb.append("show");
        sb.append('=');
        sb.append(((this.show == null)?"<null>":this.show));
        sb.append(',');
        sb.append("shp");
        sb.append('=');
        sb.append(((this.shp == null)?"<null>":this.shp));
        sb.append(',');
        sb.append("shping");
        sb.append('=');
        sb.append(((this.shping == null)?"<null>":this.shping));
        sb.append(',');
        sb.append("skin");
        sb.append('=');
        sb.append(((this.skin == null)?"<null>":this.skin));
        sb.append(',');
        sb.append("skm");
        sb.append('=');
        sb.append(((this.skm == null)?"<null>":this.skm));
        sb.append(',');
        sb.append("skrb");
        sb.append('=');
        sb.append(((this.skrb == null)?"<null>":this.skrb));
        sb.append(',');
        sb.append("slt");
        sb.append('=');
        sb.append(((this.slt == null)?"<null>":this.slt));
        sb.append(',');
        sb.append("smt");
        sb.append('=');
        sb.append(((this.smt == null)?"<null>":this.smt));
        sb.append(',');
        sb.append("snc");
        sb.append('=');
        sb.append(((this.snc == null)?"<null>":this.snc));
        sb.append(',');
        sb.append("sngls");
        sb.append('=');
        sb.append(((this.sngls == null)?"<null>":this.sngls));
        sb.append(',');
        sb.append("snip");
        sb.append('=');
        sb.append(((this.snip == null)?"<null>":this.snip));
        sb.append(',');
        sb.append("snm");
        sb.append('=');
        sb.append(((this.snm == null)?"<null>":this.snm));
        sb.append(',');
        sb.append("snov");
        sb.append('=');
        sb.append(((this.snov == null)?"<null>":this.snov));
        sb.append(',');
        sb.append("snpc");
        sb.append('=');
        sb.append(((this.snpc == null)?"<null>":this.snpc));
        sb.append(',');
        sb.append("sns");
        sb.append('=');
        sb.append(((this.sns == null)?"<null>":this.sns));
        sb.append(',');
        sb.append("snt");
        sb.append('=');
        sb.append(((this.snt == null)?"<null>":this.snt));
        sb.append(',');
        sb.append("sntr");
        sb.append('=');
        sb.append(((this.sntr == null)?"<null>":this.sntr));
        sb.append(',');
        sb.append("sntvt");
        sb.append('=');
        sb.append(((this.sntvt == null)?"<null>":this.sntvt));
        sb.append(',');
        sb.append("snx");
        sb.append('=');
        sb.append(((this.snx == null)?"<null>":this.snx));
        sb.append(',');
        sb.append("soar");
        sb.append('=');
        sb.append(((this.soar == null)?"<null>":this.soar));
        sb.append(',');
        sb.append("soc");
        sb.append('=');
        sb.append(((this.soc == null)?"<null>":this.soc));
        sb.append(',');
        sb.append("solve");
        sb.append('=');
        sb.append(((this.solve == null)?"<null>":this.solve));
        sb.append(',');
        sb.append("soma");
        sb.append('=');
        sb.append(((this.soma == null)?"<null>":this.soma));
        sb.append(',');
        sb.append("spank");
        sb.append('=');
        sb.append(((this.spank == null)?"<null>":this.spank));
        sb.append(',');
        sb.append("spf");
        sb.append('=');
        sb.append(((this.spf == null)?"<null>":this.spf));
        sb.append(',');
        sb.append("sphtx");
        sb.append('=');
        sb.append(((this.sphtx == null)?"<null>":this.sphtx));
        sb.append(',');
        sb.append("spt");
        sb.append('=');
        sb.append(((this.spt == null)?"<null>":this.spt));
        sb.append(',');
        sb.append("spx");
        sb.append('=');
        sb.append(((this.spx == null)?"<null>":this.spx));
        sb.append(',');
        sb.append("srch");
        sb.append('=');
        sb.append(((this.srch == null)?"<null>":this.srch));
        sb.append(',');
        sb.append("srcoin");
        sb.append('=');
        sb.append(((this.srcoin == null)?"<null>":this.srcoin));
        sb.append(',');
        sb.append("srn");
        sb.append('=');
        sb.append(((this.srn == null)?"<null>":this.srn));
        sb.append(',');
        sb.append("ss");
        sb.append('=');
        sb.append(((this.ss == null)?"<null>":this.ss));
        sb.append(',');
        sb.append("stac");
        sb.append('=');
        sb.append(((this.stac == null)?"<null>":this.stac));
        sb.append(',');
        sb.append("stacs");
        sb.append('=');
        sb.append(((this.stacs == null)?"<null>":this.stacs));
        sb.append(',');
        sb.append("star");
        sb.append('=');
        sb.append(((this.star == null)?"<null>":this.star));
        sb.append(',');
        sb.append("stash");
        sb.append('=');
        sb.append(((this.stash == null)?"<null>":this.stash));
        sb.append(',');
        sb.append("stc");
        sb.append('=');
        sb.append(((this.stc == null)?"<null>":this.stc));
        sb.append(',');
        sb.append("stk");
        sb.append('=');
        sb.append(((this.stk == null)?"<null>":this.stk));
        sb.append(',');
        sb.append("storj");
        sb.append('=');
        sb.append(((this.storj == null)?"<null>":this.storj));
        sb.append(',');
        sb.append("storm");
        sb.append('=');
        sb.append(((this.storm == null)?"<null>":this.storm));
        sb.append(',');
        sb.append("stq");
        sb.append('=');
        sb.append(((this.stq == null)?"<null>":this.stq));
        sb.append(',');
        sb.append("stu");
        sb.append('=');
        sb.append(((this.stu == null)?"<null>":this.stu));
        sb.append(',');
        sb.append("stx");
        sb.append('=');
        sb.append(((this.stx == null)?"<null>":this.stx));
        sb.append(',');
        sb.append("sub");
        sb.append('=');
        sb.append(((this.sub == null)?"<null>":this.sub));
        sb.append(',');
        sb.append("sur");
        sb.append('=');
        sb.append(((this.sur == null)?"<null>":this.sur));
        sb.append(',');
        sb.append("susd");
        sb.append('=');
        sb.append(((this.susd == null)?"<null>":this.susd));
        sb.append(',');
        sb.append("svd");
        sb.append('=');
        sb.append(((this.svd == null)?"<null>":this.svd));
        sb.append(',');
        sb.append("swarm");
        sb.append('=');
        sb.append(((this.swarm == null)?"<null>":this.swarm));
        sb.append(',');
        sb.append("swc");
        sb.append('=');
        sb.append(((this.swc == null)?"<null>":this.swc));
        sb.append(',');
        sb.append("swftc");
        sb.append('=');
        sb.append(((this.swftc == null)?"<null>":this.swftc));
        sb.append(',');
        sb.append("swt");
        sb.append('=');
        sb.append(((this.swt == null)?"<null>":this.swt));
        sb.append(',');
        sb.append("sxdt");
        sb.append('=');
        sb.append(((this.sxdt == null)?"<null>":this.sxdt));
        sb.append(',');
        sb.append("sxut");
        sb.append('=');
        sb.append(((this.sxut == null)?"<null>":this.sxut));
        sb.append(',');
        sb.append("taas");
        sb.append('=');
        sb.append(((this.taas == null)?"<null>":this.taas));
        sb.append(',');
        sb.append("tbx");
        sb.append('=');
        sb.append(((this.tbx == null)?"<null>":this.tbx));
        sb.append(',');
        sb.append("tch");
        sb.append('=');
        sb.append(((this.tch == null)?"<null>":this.tch));
        sb.append(',');
        sb.append("tct");
        sb.append('=');
        sb.append(((this.tct == null)?"<null>":this.tct));
        sb.append(',');
        sb.append("tdp");
        sb.append('=');
        sb.append(((this.tdp == null)?"<null>":this.tdp));
        sb.append(',');
        sb.append("tds");
        sb.append('=');
        sb.append(((this.tds == null)?"<null>":this.tds));
        sb.append(',');
        sb.append("tel");
        sb.append('=');
        sb.append(((this.tel == null)?"<null>":this.tel));
        sb.append(',');
        sb.append("ten");
        sb.append('=');
        sb.append(((this.ten == null)?"<null>":this.ten));
        sb.append(',');
        sb.append("tfd");
        sb.append('=');
        sb.append(((this.tfd == null)?"<null>":this.tfd));
        sb.append(',');
        sb.append("tfl");
        sb.append('=');
        sb.append(((this.tfl == null)?"<null>":this.tfl));
        sb.append(',');
        sb.append("tfuel");
        sb.append('=');
        sb.append(((this.tfuel == null)?"<null>":this.tfuel));
        sb.append(',');
        sb.append("tgame");
        sb.append('=');
        sb.append(((this.tgame == null)?"<null>":this.tgame));
        sb.append(',');
        sb.append("tgt");
        sb.append('=');
        sb.append(((this.tgt == null)?"<null>":this.tgt));
        sb.append(',');
        sb.append("theta");
        sb.append('=');
        sb.append(((this.theta == null)?"<null>":this.theta));
        sb.append(',');
        sb.append("thr");
        sb.append('=');
        sb.append(((this.thr == null)?"<null>":this.thr));
        sb.append(',');
        sb.append("thrt");
        sb.append('=');
        sb.append(((this.thrt == null)?"<null>":this.thrt));
        sb.append(',');
        sb.append("tie");
        sb.append('=');
        sb.append(((this.tie == null)?"<null>":this.tie));
        sb.append(',');
        sb.append("tig");
        sb.append('=');
        sb.append(((this.tig == null)?"<null>":this.tig));
        sb.append(',');
        sb.append("tiox");
        sb.append('=');
        sb.append(((this.tiox == null)?"<null>":this.tiox));
        sb.append(',');
        sb.append("tix");
        sb.append('=');
        sb.append(((this.tix == null)?"<null>":this.tix));
        sb.append(',');
        sb.append("tkn");
        sb.append('=');
        sb.append(((this.tkn == null)?"<null>":this.tkn));
        sb.append(',');
        sb.append("tmt");
        sb.append('=');
        sb.append(((this.tmt == null)?"<null>":this.tmt));
        sb.append(',');
        sb.append("tmtg");
        sb.append('=');
        sb.append(((this.tmtg == null)?"<null>":this.tmtg));
        sb.append(',');
        sb.append("tnb");
        sb.append('=');
        sb.append(((this.tnb == null)?"<null>":this.tnb));
        sb.append(',');
        sb.append("tnt");
        sb.append('=');
        sb.append(((this.tnt == null)?"<null>":this.tnt));
        sb.append(',');
        sb.append("tomo");
        sb.append('=');
        sb.append(((this.tomo == null)?"<null>":this.tomo));
        sb.append(',');
        sb.append("topc");
        sb.append('=');
        sb.append(((this.topc == null)?"<null>":this.topc));
        sb.append(',');
        sb.append("trac");
        sb.append('=');
        sb.append(((this.trac == null)?"<null>":this.trac));
        sb.append(',');
        sb.append("trak");
        sb.append('=');
        sb.append(((this.trak == null)?"<null>":this.trak));
        sb.append(',');
        sb.append("trct");
        sb.append('=');
        sb.append(((this.trct == null)?"<null>":this.trct));
        sb.append(',');
        sb.append("trdt");
        sb.append('=');
        sb.append(((this.trdt == null)?"<null>":this.trdt));
        sb.append(',');
        sb.append("trio");
        sb.append('=');
        sb.append(((this.trio == null)?"<null>":this.trio));
        sb.append(',');
        sb.append("trst");
        sb.append('=');
        sb.append(((this.trst == null)?"<null>":this.trst));
        sb.append(',');
        sb.append("_true");
        sb.append('=');
        sb.append(((this._true == null)?"<null>":this._true));
        sb.append(',');
        sb.append("tsl");
        sb.append('=');
        sb.append(((this.tsl == null)?"<null>":this.tsl));
        sb.append(',');
        sb.append("ttc");
        sb.append('=');
        sb.append(((this.ttc == null)?"<null>":this.ttc));
        sb.append(',');
        sb.append("ttv");
        sb.append('=');
        sb.append(((this.ttv == null)?"<null>":this.ttv));
        sb.append(',');
        sb.append("tusd");
        sb.append('=');
        sb.append(((this.tusd == null)?"<null>":this.tusd));
        sb.append(',');
        sb.append("ubc");
        sb.append('=');
        sb.append(((this.ubc == null)?"<null>":this.ubc));
        sb.append(',');
        sb.append("ubex");
        sb.append('=');
        sb.append(((this.ubex == null)?"<null>":this.ubex));
        sb.append(',');
        sb.append("ubt");
        sb.append('=');
        sb.append(((this.ubt == null)?"<null>":this.ubt));
        sb.append(',');
        sb.append("uct");
        sb.append('=');
        sb.append(((this.uct == null)?"<null>":this.uct));
        sb.append(',');
        sb.append("udoo");
        sb.append('=');
        sb.append(((this.udoo == null)?"<null>":this.udoo));
        sb.append(',');
        sb.append("ufr");
        sb.append('=');
        sb.append(((this.ufr == null)?"<null>":this.ufr));
        sb.append(',');
        sb.append("ugas");
        sb.append('=');
        sb.append(((this.ugas == null)?"<null>":this.ugas));
        sb.append(',');
        sb.append("ugc");
        sb.append('=');
        sb.append(((this.ugc == null)?"<null>":this.ugc));
        sb.append(',');
        sb.append("ukg");
        sb.append('=');
        sb.append(((this.ukg == null)?"<null>":this.ukg));
        sb.append(',');
        sb.append("up");
        sb.append('=');
        sb.append(((this.up == null)?"<null>":this.up));
        sb.append(',');
        sb.append("upp");
        sb.append('=');
        sb.append(((this.upp == null)?"<null>":this.upp));
        sb.append(',');
        sb.append("uqc");
        sb.append('=');
        sb.append(((this.uqc == null)?"<null>":this.uqc));
        sb.append(',');
        sb.append("usdc");
        sb.append('=');
        sb.append(((this.usdc == null)?"<null>":this.usdc));
        sb.append(',');
        sb.append("usds");
        sb.append('=');
        sb.append(((this.usds == null)?"<null>":this.usds));
        sb.append(',');
        sb.append("usdt");
        sb.append('=');
        sb.append(((this.usdt == null)?"<null>":this.usdt));
        sb.append(',');
        sb.append("use");
        sb.append('=');
        sb.append(((this.use == null)?"<null>":this.use));
        sb.append(',');
        sb.append("utk");
        sb.append('=');
        sb.append(((this.utk == null)?"<null>":this.utk));
        sb.append(',');
        sb.append("utnp");
        sb.append('=');
        sb.append(((this.utnp == null)?"<null>":this.utnp));
        sb.append(',');
        sb.append("utt");
        sb.append('=');
        sb.append(((this.utt == null)?"<null>":this.utt));
        sb.append(',');
        sb.append("uuu");
        sb.append('=');
        sb.append(((this.uuu == null)?"<null>":this.uuu));
        sb.append(',');
        sb.append("vee");
        sb.append('=');
        sb.append(((this.vee == null)?"<null>":this.vee));
        sb.append(',');
        sb.append("veri");
        sb.append('=');
        sb.append(((this.veri == null)?"<null>":this.veri));
        sb.append(',');
        sb.append("vest");
        sb.append('=');
        sb.append(((this.vest == null)?"<null>":this.vest));
        sb.append(',');
        sb.append("vet");
        sb.append('=');
        sb.append(((this.vet == null)?"<null>":this.vet));
        sb.append(',');
        sb.append("vibe");
        sb.append('=');
        sb.append(((this.vibe == null)?"<null>":this.vibe));
        sb.append(',');
        sb.append("vidt");
        sb.append('=');
        sb.append(((this.vidt == null)?"<null>":this.vidt));
        sb.append(',');
        sb.append("vin");
        sb.append('=');
        sb.append(((this.vin == null)?"<null>":this.vin));
        sb.append(',');
        sb.append("vit");
        sb.append('=');
        sb.append(((this.vit == null)?"<null>":this.vit));
        sb.append(',');
        sb.append("vite");
        sb.append('=');
        sb.append(((this.vite == null)?"<null>":this.vite));
        sb.append(',');
        sb.append("viu");
        sb.append('=');
        sb.append(((this.viu == null)?"<null>":this.viu));
        sb.append(',');
        sb.append("vme");
        sb.append('=');
        sb.append(((this.vme == null)?"<null>":this.vme));
        sb.append(',');
        sb.append("vnx");
        sb.append('=');
        sb.append(((this.vnx == null)?"<null>":this.vnx));
        sb.append(',');
        sb.append("voise");
        sb.append('=');
        sb.append(((this.voise == null)?"<null>":this.voise));
        sb.append(',');
        sb.append("vra");
        sb.append('=');
        sb.append(((this.vra == null)?"<null>":this.vra));
        sb.append(',');
        sb.append("vrs");
        sb.append('=');
        sb.append(((this.vrs == null)?"<null>":this.vrs));
        sb.append(',');
        sb.append("vsl");
        sb.append('=');
        sb.append(((this.vsl == null)?"<null>":this.vsl));
        sb.append(',');
        sb.append("vzt");
        sb.append('=');
        sb.append(((this.vzt == null)?"<null>":this.vzt));
        sb.append(',');
        sb.append("wab");
        sb.append('=');
        sb.append(((this.wab == null)?"<null>":this.wab));
        sb.append(',');
        sb.append("wabi");
        sb.append('=');
        sb.append(((this.wabi == null)?"<null>":this.wabi));
        sb.append(',');
        sb.append("wan");
        sb.append('=');
        sb.append(((this.wan == null)?"<null>":this.wan));
        sb.append(',');
        sb.append("wand");
        sb.append('=');
        sb.append(((this.wand == null)?"<null>":this.wand));
        sb.append(',');
        sb.append("wax");
        sb.append('=');
        sb.append(((this.wax == null)?"<null>":this.wax));
        sb.append(',');
        sb.append("wbtc");
        sb.append('=');
        sb.append(((this.wbtc == null)?"<null>":this.wbtc));
        sb.append(',');
        sb.append("wcoin");
        sb.append('=');
        sb.append(((this.wcoin == null)?"<null>":this.wcoin));
        sb.append(',');
        sb.append("web");
        sb.append('=');
        sb.append(((this.web == null)?"<null>":this.web));
        sb.append(',');
        sb.append("well");
        sb.append('=');
        sb.append(((this.well == null)?"<null>":this.well));
        sb.append(',');
        sb.append("weth");
        sb.append('=');
        sb.append(((this.weth == null)?"<null>":this.weth));
        sb.append(',');
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
        sb.append(',');
        sb.append("wings");
        sb.append('=');
        sb.append(((this.wings == null)?"<null>":this.wings));
        sb.append(',');
        sb.append("wish");
        sb.append('=');
        sb.append(((this.wish == null)?"<null>":this.wish));
        sb.append(',');
        sb.append("wiz");
        sb.append('=');
        sb.append(((this.wiz == null)?"<null>":this.wiz));
        sb.append(',');
        sb.append("wpp");
        sb.append('=');
        sb.append(((this.wpp == null)?"<null>":this.wpp));
        sb.append(',');
        sb.append("wpr");
        sb.append('=');
        sb.append(((this.wpr == null)?"<null>":this.wpr));
        sb.append(',');
        sb.append("wrc");
        sb.append('=');
        sb.append(((this.wrc == null)?"<null>":this.wrc));
        sb.append(',');
        sb.append("wt");
        sb.append('=');
        sb.append(((this.wt == null)?"<null>":this.wt));
        sb.append(',');
        sb.append("wtc");
        sb.append('=');
        sb.append(((this.wtc == null)?"<null>":this.wtc));
        sb.append(',');
        sb.append("wtl");
        sb.append('=');
        sb.append(((this.wtl == null)?"<null>":this.wtl));
        sb.append(',');
        sb.append("wys");
        sb.append('=');
        sb.append(((this.wys == null)?"<null>":this.wys));
        sb.append(',');
        sb.append("x8x");
        sb.append('=');
        sb.append(((this.x8x == null)?"<null>":this.x8x));
        sb.append(',');
        sb.append("xaur");
        sb.append('=');
        sb.append(((this.xaur == null)?"<null>":this.xaur));
        sb.append(',');
        sb.append("xbase");
        sb.append('=');
        sb.append(((this.xbase == null)?"<null>":this.xbase));
        sb.append(',');
        sb.append("xbb");
        sb.append('=');
        sb.append(((this.xbb == null)?"<null>":this.xbb));
        sb.append(',');
        sb.append("xbl");
        sb.append('=');
        sb.append(((this.xbl == null)?"<null>":this.xbl));
        sb.append(',');
        sb.append("xbx");
        sb.append('=');
        sb.append(((this.xbx == null)?"<null>":this.xbx));
        sb.append(',');
        sb.append("xcd");
        sb.append('=');
        sb.append(((this.xcd == null)?"<null>":this.xcd));
        sb.append(',');
        sb.append("xclr");
        sb.append('=');
        sb.append(((this.xclr == null)?"<null>":this.xclr));
        sb.append(',');
        sb.append("xdce");
        sb.append('=');
        sb.append(((this.xdce == null)?"<null>":this.xdce));
        sb.append(',');
        sb.append("xes");
        sb.append('=');
        sb.append(((this.xes == null)?"<null>":this.xes));
        sb.append(',');
        sb.append("xet");
        sb.append('=');
        sb.append(((this.xet == null)?"<null>":this.xet));
        sb.append(',');
        sb.append("xmx");
        sb.append('=');
        sb.append(((this.xmx == null)?"<null>":this.xmx));
        sb.append(',');
        sb.append("xng");
        sb.append('=');
        sb.append(((this.xng == null)?"<null>":this.xng));
        sb.append(',');
        sb.append("xnk");
        sb.append('=');
        sb.append(((this.xnk == null)?"<null>":this.xnk));
        sb.append(',');
        sb.append("xov");
        sb.append('=');
        sb.append(((this.xov == null)?"<null>":this.xov));
        sb.append(',');
        sb.append("xpat");
        sb.append('=');
        sb.append(((this.xpat == null)?"<null>":this.xpat));
        sb.append(',');
        sb.append("xuc");
        sb.append('=');
        sb.append(((this.xuc == null)?"<null>":this.xuc));
        sb.append(',');
        sb.append("xyo");
        sb.append('=');
        sb.append(((this.xyo == null)?"<null>":this.xyo));
        sb.append(',');
        sb.append("xzc");
        sb.append('=');
        sb.append(((this.xzc == null)?"<null>":this.xzc));
        sb.append(',');
        sb.append("yee");
        sb.append('=');
        sb.append(((this.yee == null)?"<null>":this.yee));
        sb.append(',');
        sb.append("yoyow");
        sb.append('=');
        sb.append(((this.yoyow == null)?"<null>":this.yoyow));
        sb.append(',');
        sb.append("yup");
        sb.append('=');
        sb.append(((this.yup == null)?"<null>":this.yup));
        sb.append(',');
        sb.append("zap");
        sb.append('=');
        sb.append(((this.zap == null)?"<null>":this.zap));
        sb.append(',');
        sb.append("zcn");
        sb.append('=');
        sb.append(((this.zcn == null)?"<null>":this.zcn));
        sb.append(',');
        sb.append("zco");
        sb.append('=');
        sb.append(((this.zco == null)?"<null>":this.zco));
        sb.append(',');
        sb.append("zec");
        sb.append('=');
        sb.append(((this.zec == null)?"<null>":this.zec));
        sb.append(',');
        sb.append("zeon");
        sb.append('=');
        sb.append(((this.zeon == null)?"<null>":this.zeon));
        sb.append(',');
        sb.append("zil");
        sb.append('=');
        sb.append(((this.zil == null)?"<null>":this.zil));
        sb.append(',');
        sb.append("zinc");
        sb.append('=');
        sb.append(((this.zinc == null)?"<null>":this.zinc));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("zipt");
        sb.append('=');
        sb.append(((this.zipt == null)?"<null>":this.zipt));
        sb.append(',');
        sb.append("zla");
        sb.append('=');
        sb.append(((this.zla == null)?"<null>":this.zla));
        sb.append(',');
        sb.append("zmn");
        sb.append('=');
        sb.append(((this.zmn == null)?"<null>":this.zmn));
        sb.append(',');
        sb.append("zpr");
        sb.append('=');
        sb.append(((this.zpr == null)?"<null>":this.zpr));
        sb.append(',');
        sb.append("zrx");
        sb.append('=');
        sb.append(((this.zrx == null)?"<null>":this.zrx));
        sb.append(',');
        sb.append("zsc");
        sb.append('=');
        sb.append(((this.zsc == null)?"<null>":this.zsc));
        sb.append(',');
        sb.append("zt");
        sb.append('=');
        sb.append(((this.zt == null)?"<null>":this.zt));
        sb.append(',');
        sb.append("zxc");
        sb.append('=');
        sb.append(((this.zxc == null)?"<null>":this.zxc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.tdp == null)? 0 :this.tdp.hashCode()));
        result = ((result* 31)+((this.tds == null)? 0 :this.tds.hashCode()));
        result = ((result* 31)+((this.fairg == null)? 0 :this.fairg.hashCode()));
        result = ((result* 31)+((this.araw == null)? 0 :this.araw.hashCode()));
        result = ((result* 31)+((this.kcash == null)? 0 :this.kcash.hashCode()));
        result = ((result* 31)+((this.ccl == null)? 0 :this.ccl.hashCode()));
        result = ((result* 31)+((this.theta == null)? 0 :this.theta.hashCode()));
        result = ((result* 31)+((this.cco == null)? 0 :this.cco.hashCode()));
        result = ((result* 31)+((this.egt == null)? 0 :this.egt.hashCode()));
        result = ((result* 31)+((this.cct == null)? 0 :this.cct.hashCode()));
        result = ((result* 31)+((this.tel == null)? 0 :this.tel.hashCode()));
        result = ((result* 31)+((this.vin == null)? 0 :this.vin.hashCode()));
        result = ((result* 31)+((this.ten == null)? 0 :this.ten.hashCode()));
        result = ((result* 31)+((this.ipc == null)? 0 :this.ipc.hashCode()));
        result = ((result* 31)+((this.accn == null)? 0 :this.accn.hashCode()));
        result = ((result* 31)+((this.vit == null)? 0 :this.vit.hashCode()));
        result = ((result* 31)+((this.xmx == null)? 0 :this.xmx.hashCode()));
        result = ((result* 31)+((this.mxm == null)? 0 :this.mxm.hashCode()));
        result = ((result* 31)+((this.viu == null)? 0 :this.viu.hashCode()));
        result = ((result* 31)+((this.lion == null)? 0 :this.lion.hashCode()));
        result = ((result* 31)+((this.xng == null)? 0 :this.xng.hashCode()));
        result = ((result* 31)+((this.cdt == null)? 0 :this.cdt.hashCode()));
        result = ((result* 31)+((this.tfd == null)? 0 :this.tfd.hashCode()));
        result = ((result* 31)+((this.xnk == null)? 0 :this.xnk.hashCode()));
        result = ((result* 31)+((this.guess == null)? 0 :this.guess.hashCode()));
        result = ((result* 31)+((this.cdx == null)? 0 :this.cdx.hashCode()));
        result = ((result* 31)+((this.myb == null)? 0 :this.myb.hashCode()));
        result = ((result* 31)+((this.cova == null)? 0 :this.cova.hashCode()));
        result = ((result* 31)+((this.kue == null)? 0 :this.kue.hashCode()));
        result = ((result* 31)+((this.tfl == null)? 0 :this.tfl.hashCode()));
        result = ((result* 31)+((this.zrx == null)? 0 :this.zrx.hashCode()));
        result = ((result* 31)+((this.aac == null)? 0 :this.aac.hashCode()));
        result = ((result* 31)+((this.iqn == null)? 0 :this.iqn.hashCode()));
        result = ((result* 31)+((this.cel == null)? 0 :this.cel.hashCode()));
        result = ((result* 31)+((this.zsc == null)? 0 :this.zsc.hashCode()));
        result = ((result* 31)+((this.cen == null)? 0 :this.cen.hashCode()));
        result = ((result* 31)+((this.arct == null)? 0 :this.arct.hashCode()));
        result = ((result* 31)+((this.qash == null)? 0 :this.qash.hashCode()));
        result = ((result* 31)+((this.cet == null)? 0 :this.cet.hashCode()));
        result = ((result* 31)+((this.axpr == null)? 0 :this.axpr.hashCode()));
        result = ((result* 31)+((this.flik == null)? 0 :this.flik.hashCode()));
        result = ((result* 31)+((this.rcn == null)? 0 :this.rcn.hashCode()));
        result = ((result* 31)+((this.xov == null)? 0 :this.xov.hashCode()));
        result = ((result* 31)+((this.hand == null)? 0 :this.hand.hashCode()));
        result = ((result* 31)+((this.tgt == null)? 0 :this.tgt.hashCode()));
        result = ((result* 31)+((this.rct == null)? 0 :this.rct.hashCode()));
        result = ((result* 31)+((this.salt == null)? 0 :this.salt.hashCode()));
        result = ((result* 31)+((this.gno == null)? 0 :this.gno.hashCode()));
        result = ((result* 31)+((this.gnt == null)? 0 :this.gnt.hashCode()));
        result = ((result* 31)+((this.arbt == null)? 0 :this.arbt.hashCode()));
        result = ((result* 31)+((this.gnx == null)? 0 :this.gnx.hashCode()));
        result = ((result* 31)+((this.rdc == null)? 0 :this.rdc.hashCode()));
        result = ((result* 31)+((this.abt == null)? 0 :this.abt.hashCode()));
        result = ((result* 31)+((this.r == null)? 0 :this.r.hashCode()));
        result = ((result* 31)+((this.mdcl == null)? 0 :this.mdcl.hashCode()));
        result = ((result* 31)+((this.rdd == null)? 0 :this.rdd.hashCode()));
        result = ((result* 31)+((this.seth == null)? 0 :this.seth.hashCode()));
        result = ((result* 31)+((this.xdce == null)? 0 :this.xdce.hashCode()));
        result = ((result* 31)+((this.kwh == null)? 0 :this.kwh.hashCode()));
        result = ((result* 31)+((this.thr == null)? 0 :this.thr.hashCode()));
        result = ((result* 31)+((this.ace == null)? 0 :this.ace.hashCode()));
        result = ((result* 31)+((this.eko == null)? 0 :this.eko.hashCode()));
        result = ((result* 31)+((this.isr == null)? 0 :this.isr.hashCode()));
        result = ((result* 31)+((this.good == null)? 0 :this.good.hashCode()));
        result = ((result* 31)+((this.ekt == null)? 0 :this.ekt.hashCode()));
        result = ((result* 31)+((this.emph == null)? 0 :this.emph.hashCode()));
        result = ((result* 31)+((this.vme == null)? 0 :this.vme.hashCode()));
        result = ((result* 31)+((this.wish == null)? 0 :this.wish.hashCode()));
        result = ((result* 31)+((this.tie == null)? 0 :this.tie.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        result = ((result* 31)+((this.tig == null)? 0 :this.tig.hashCode()));
        result = ((result* 31)+((this.utnp == null)? 0 :this.utnp.hashCode()));
        result = ((result* 31)+((this.itc == null)? 0 :this.itc.hashCode()));
        result = ((result* 31)+((this.pal == null)? 0 :this.pal.hashCode()));
        result = ((result* 31)+((this.rem == null)? 0 :this.rem.hashCode()));
        result = ((result* 31)+((this.rep == null)? 0 :this.rep.hashCode()));
        result = ((result* 31)+((this.adb == null)? 0 :this.adb.hashCode()));
        result = ((result* 31)+((this.elf == null)? 0 :this.elf.hashCode()));
        result = ((result* 31)+((this.ada == null)? 0 :this.ada.hashCode()));
        result = ((result* 31)+((this.req == null)? 0 :this.req.hashCode()));
        result = ((result* 31)+((this.itl == null)? 0 :this.itl.hashCode()));
        result = ((result* 31)+((this.pat == null)? 0 :this.pat.hashCode()));
        result = ((result* 31)+((this.tix == null)? 0 :this.tix.hashCode()));
        result = ((result* 31)+((this.eli == null)? 0 :this.eli.hashCode()));
        result = ((result* 31)+((this.adh == null)? 0 :this.adh.hashCode()));
        result = ((result* 31)+((this.rex == null)? 0 :this.rex.hashCode()));
        result = ((result* 31)+((this.tusd == null)? 0 :this.tusd.hashCode()));
        result = ((result* 31)+((this.ceek == null)? 0 :this.ceek.hashCode()));
        result = ((result* 31)+((this.pax == null)? 0 :this.pax.hashCode()));
        result = ((result* 31)+((this.wabi == null)? 0 :this.wabi.hashCode()));
        result = ((result* 31)+((this.adi == null)? 0 :this.adi.hashCode()));
        result = ((result* 31)+((this.adl == null)? 0 :this.adl.hashCode()));
        result = ((result* 31)+((this.itt == null)? 0 :this.itt.hashCode()));
        result = ((result* 31)+((this.pay == null)? 0 :this.pay.hashCode()));
        result = ((result* 31)+((this.chp == null)? 0 :this.chp.hashCode()));
        result = ((result* 31)+((this.egcc == null)? 0 :this.egcc.hashCode()));
        result = ((result* 31)+((this.cht == null)? 0 :this.cht.hashCode()));
        result = ((result* 31)+((this.adt == null)? 0 :this.adt.hashCode()));
        result = ((result* 31)+((this.chx == null)? 0 :this.chx.hashCode()));
        result = ((result* 31)+((this.ely == null)? 0 :this.ely.hashCode()));
        result = ((result* 31)+((this.adx == null)? 0 :this.adx.hashCode()));
        result = ((result* 31)+((this.pmnt == null)? 0 :this.pmnt.hashCode()));
        result = ((result* 31)+((this.rfr == null)? 0 :this.rfr.hashCode()));
        result = ((result* 31)+((this.scrl == null)? 0 :this.scrl.hashCode()));
        result = ((result* 31)+((this.vnx == null)? 0 :this.vnx.hashCode()));
        result = ((result* 31)+((this.aen == null)? 0 :this.aen.hashCode()));
        result = ((result* 31)+((this.pch == null)? 0 :this.pch.hashCode()));
        result = ((result* 31)+((this.tkn == null)? 0 :this.tkn.hashCode()));
        result = ((result* 31)+((this.pcl == null)? 0 :this.pcl.hashCode()));
        result = ((result* 31)+((this.lend == null)? 0 :this.lend.hashCode()));
        result = ((result* 31)+((this.pco == null)? 0 :this.pco.hashCode()));
        result = ((result* 31)+((this.enj == null)? 0 :this.enj.hashCode()));
        result = ((result* 31)+((this.zxc == null)? 0 :this.zxc.hashCode()));
        result = ((result* 31)+((this.cjt == null)? 0 :this.cjt.hashCode()));
        result = ((result* 31)+((this.grx == null)? 0 :this.grx.hashCode()));
        result = ((result* 31)+((this.ivy == null)? 0 :this.ivy.hashCode()));
        result = ((result* 31)+((this.gsc == null)? 0 :this.gsc.hashCode()));
        result = ((result* 31)+((this.snip == null)? 0 :this.snip.hashCode()));
        result = ((result* 31)+((this.ethos == null)? 0 :this.ethos.hashCode()));
        result = ((result* 31)+((this.well == null)? 0 :this.well.hashCode()));
        result = ((result* 31)+((this.cccx == null)? 0 :this.cccx.hashCode()));
        result = ((result* 31)+((this.agi == null)? 0 :this.agi.hashCode()));
        result = ((result* 31)+((this.fntb == null)? 0 :this.fntb.hashCode()));
        result = ((result* 31)+((this.xuc == null)? 0 :this.xuc.hashCode()));
        result = ((result* 31)+((this.gst == null)? 0 :this.gst.hashCode()));
        result = ((result* 31)+((this.crds == null)? 0 :this.crds.hashCode()));
        result = ((result* 31)+((this.gtc == null)? 0 :this.gtc.hashCode()));
        result = ((result* 31)+((this.tmt == null)? 0 :this.tmt.hashCode()));
        result = ((result* 31)+((this.flot == null)? 0 :this.flot.hashCode()));
        result = ((result* 31)+((this.nas == null)? 0 :this.nas.hashCode()));
        result = ((result* 31)+((this.atmi == null)? 0 :this.atmi.hashCode()));
        result = ((result* 31)+((this.gto == null)? 0 :this.gto.hashCode()));
        result = ((result* 31)+((this.cln == null)? 0 :this.cln.hashCode()));
        result = ((result* 31)+((this.ixt == null)? 0 :this.ixt.hashCode()));
        result = ((result* 31)+((this.vra == null)? 0 :this.vra.hashCode()));
        result = ((result* 31)+((this.tnb == null)? 0 :this.tnb.hashCode()));
        result = ((result* 31)+((this.nbc == null)? 0 :this.nbc.hashCode()));
        result = ((result* 31)+((this.powr == null)? 0 :this.powr.hashCode()));
        result = ((result* 31)+((this.vrs == null)? 0 :this.vrs.hashCode()));
        result = ((result* 31)+((this.tnt == null)? 0 :this.tnt.hashCode()));
        result = ((result* 31)+((this.aid == null)? 0 :this.aid.hashCode()));
        result = ((result* 31)+((this.pfr == null)? 0 :this.pfr.hashCode()));
        result = ((result* 31)+((this.myst == null)? 0 :this.myst.hashCode()));
        result = ((result* 31)+((this.eved == null)? 0 :this.eved.hashCode()));
        result = ((result* 31)+((this.gup == null)? 0 :this.gup.hashCode()));
        result = ((result* 31)+((this.celr == null)? 0 :this.celr.hashCode()));
        result = ((result* 31)+((this.cms == null)? 0 :this.cms.hashCode()));
        result = ((result* 31)+((this.cmt == null)? 0 :this.cmt.hashCode()));
        result = ((result* 31)+((this.cpay == null)? 0 :this.cpay.hashCode()));
        result = ((result* 31)+((this.ait == null)? 0 :this.ait.hashCode()));
        result = ((result* 31)+((this.vsl == null)? 0 :this.vsl.hashCode()));
        result = ((result* 31)+((this.ncc == null)? 0 :this.ncc.hashCode()));
        result = ((result* 31)+((this.aix == null)? 0 :this.aix.hashCode()));
        result = ((result* 31)+((this.gve == null)? 0 :this.gve.hashCode()));
        result = ((result* 31)+((this.cnd == null)? 0 :this.cnd.hashCode()));
        result = ((result* 31)+((this.nct == null)? 0 :this.nct.hashCode()));
        result = ((result* 31)+((this.cred == null)? 0 :this.cred.hashCode()));
        result = ((result* 31)+((this.idxm == null)? 0 :this.idxm.hashCode()));
        result = ((result* 31)+((this.cnn == null)? 0 :this.cnn.hashCode()));
        result = ((result* 31)+((this.ero == null)? 0 :this.ero.hashCode()));
        result = ((result* 31)+((this.gvt == null)? 0 :this.gvt.hashCode()));
        result = ((result* 31)+((this.rlc == null)? 0 :this.rlc.hashCode()));
        result = ((result* 31)+((this.qntu == null)? 0 :this.qntu.hashCode()));
        result = ((result* 31)+((this.tomo == null)? 0 :this.tomo.hashCode()));
        result = ((result* 31)+((this.btcred == null)? 0 :this.btcred.hashCode()));
        result = ((result* 31)+((this.cnx == null)? 0 :this.cnx.hashCode()));
        result = ((result* 31)+((this.etbs == null)? 0 :this.etbs.hashCode()));
        result = ((result* 31)+((this.phi == null)? 0 :this.phi.hashCode()));
        result = ((result* 31)+((this.cob == null)? 0 :this.cob.hashCode()));
        result = ((result* 31)+((this.moac == null)? 0 :this.moac.hashCode()));
        result = ((result* 31)+((this.sngls == null)? 0 :this.sngls.hashCode()));
        result = ((result* 31)+((this.agvc == null)? 0 :this.agvc.hashCode()));
        result = ((result* 31)+((this.rlx == null)? 0 :this.rlx.hashCode()));
        result = ((result* 31)+((this.dbet == null)? 0 :this.dbet.hashCode()));
        result = ((result* 31)+((this.ess == null)? 0 :this.ess.hashCode()));
        result = ((result* 31)+((this.fuel == null)? 0 :this.fuel.hashCode()));
        result = ((result* 31)+((this.est == null)? 0 :this.est.hashCode()));
        result = ((result* 31)+((this.instar == null)? 0 :this.instar.hashCode()));
        result = ((result* 31)+((this.cou == null)? 0 :this.cou.hashCode()));
        result = ((result* 31)+((this.rebl == null)? 0 :this.rebl.hashCode()));
        result = ((result* 31)+((this.cot == null)? 0 :this.cot.hashCode()));
        result = ((result* 31)+((this.cov == null)? 0 :this.cov.hashCode()));
        result = ((result* 31)+((this.esz == null)? 0 :this.esz.hashCode()));
        result = ((result* 31)+((this.nec == null)? 0 :this.nec.hashCode()));
        result = ((result* 31)+((this.xyo == null)? 0 :this.xyo.hashCode()));
        result = ((result* 31)+((this.etc == null)? 0 :this.etc.hashCode()));
        result = ((result* 31)+((this.eth == null)? 0 :this.eth.hashCode()));
        result = ((result* 31)+((this.lala == null)? 0 :this.lala.hashCode()));
        result = ((result* 31)+((this.topc == null)? 0 :this.topc.hashCode()));
        result = ((result* 31)+((this.etg == null)? 0 :this.etg.hashCode()));
        result = ((result* 31)+((this.etk == null)? 0 :this.etk.hashCode()));
        result = ((result* 31)+((this.etn == null)? 0 :this.etn.hashCode()));
        result = ((result* 31)+((this.pix == null)? 0 :this.pix.hashCode()));
        result = ((result* 31)+((this.neu == null)? 0 :this.neu.hashCode()));
        result = ((result* 31)+((this.xzc == null)? 0 :this.xzc.hashCode()));
        result = ((result* 31)+((this.cpt == null)? 0 :this.cpt.hashCode()));
        result = ((result* 31)+((this.real == null)? 0 :this.real.hashCode()));
        result = ((result* 31)+((this.alx == null)? 0 :this.alx.hashCode()));
        result = ((result* 31)+((this.cpy == null)? 0 :this.cpy.hashCode()));
        result = ((result* 31)+((this.apis == null)? 0 :this.apis.hashCode()));
        result = ((result* 31)+((this.amb == null)? 0 :this.amb.hashCode()));
        result = ((result* 31)+((this.exmr == null)? 0 :this.exmr.hashCode()));
        result = ((result* 31)+((this.snov == null)? 0 :this.snov.hashCode()));
        result = ((result* 31)+((this.rnt == null)? 0 :this.rnt.hashCode()));
        result = ((result* 31)+((this.x8x == null)? 0 :this.x8x.hashCode()));
        result = ((result* 31)+((this.snpc == null)? 0 :this.snpc.hashCode()));
        result = ((result* 31)+((this.cpch == null)? 0 :this.cpch.hashCode()));
        result = ((result* 31)+((this.amm == null)? 0 :this.amm.hashCode()));
        result = ((result* 31)+((this.amo == null)? 0 :this.amo.hashCode()));
        result = ((result* 31)+((this.amn == null)? 0 :this.amn.hashCode()));
        result = ((result* 31)+((this.ngc == null)? 0 :this.ngc.hashCode()));
        result = ((result* 31)+((this.tsl == null)? 0 :this.tsl.hashCode()));
        result = ((result* 31)+((this.crb == null)? 0 :this.crb.hashCode()));
        result = ((result* 31)+((this.evc == null)? 0 :this.evc.hashCode()));
        result = ((result* 31)+((this.eve == null)? 0 :this.eve.hashCode()));
        result = ((result* 31)+((this.cedex == null)? 0 :this.cedex.hashCode()));
        result = ((result* 31)+((this.pkt == null)? 0 :this.pkt.hashCode()));
        result = ((result* 31)+((this.rox == null)? 0 :this.rox.hashCode()));
        result = ((result* 31)+((this.ethm == null)? 0 :this.ethm.hashCode()));
        result = ((result* 31)+((this.fluz == null)? 0 :this.fluz.hashCode()));
        result = ((result* 31)+((this.nper == null)? 0 :this.nper.hashCode()));
        result = ((result* 31)+((this.lcs == null)? 0 :this.lcs.hashCode()));
        result = ((result* 31)+((this.c20 == null)? 0 :this.c20 .hashCode()));
        result = ((result* 31)+((this.evr == null)? 0 :this.evr.hashCode()));
        result = ((result* 31)+((this.cro == null)? 0 :this.cro.hashCode()));
        result = ((result* 31)+((this.ttc == null)? 0 :this.ttc.hashCode()));
        result = ((result* 31)+((this.pla == null)? 0 :this.pla.hashCode()));
        result = ((result* 31)+((this.ant == null)? 0 :this.ant.hashCode()));
        result = ((result* 31)+((this.evx == null)? 0 :this.evx.hashCode()));
        result = ((result* 31)+((this.ldc == null)? 0 :this.ldc.hashCode()));
        result = ((result* 31)+((this.aoa == null)? 0 :this.aoa.hashCode()));
        result = ((result* 31)+((this.weth == null)? 0 :this.weth.hashCode()));
        result = ((result* 31)+((this.etgp == null)? 0 :this.etgp.hashCode()));
        result = ((result* 31)+((this.plr == null)? 0 :this.plr.hashCode()));
        result = ((result* 31)+((this.ttv == null)? 0 :this.ttv.hashCode()));
        result = ((result* 31)+((this.lamb == null)? 0 :this.lamb.hashCode()));
        result = ((result* 31)+((this.plu == null)? 0 :this.plu.hashCode()));
        result = ((result* 31)+((this.csm == null)? 0 :this.csm.hashCode()));
        result = ((result* 31)+((this.exrn == null)? 0 :this.exrn.hashCode()));
        result = ((result* 31)+((this.csp == null)? 0 :this.csp.hashCode()));
        result = ((result* 31)+((this.vibe == null)? 0 :this.vibe.hashCode()));
        result = ((result* 31)+((this.echt == null)? 0 :this.echt.hashCode()));
        result = ((result* 31)+((this.pma == null)? 0 :this.pma.hashCode()));
        result = ((result* 31)+((this.ship == null)? 0 :this.ship.hashCode()));
        result = ((result* 31)+((this.exc == null)? 0 :this.exc.hashCode()));
        result = ((result* 31)+((this.nio == null)? 0 :this.nio.hashCode()));
        result = ((result* 31)+((this.iotx == null)? 0 :this.iotx.hashCode()));
        result = ((result* 31)+((this.dock == null)? 0 :this.dock.hashCode()));
        result = ((result* 31)+((this.lev == null)? 0 :this.lev.hashCode()));
        result = ((result* 31)+((this.rrc == null)? 0 :this.rrc.hashCode()));
        result = ((result* 31)+((this.exy == null)? 0 :this.exy.hashCode()));
        result = ((result* 31)+((this.sntr == null)? 0 :this.sntr.hashCode()));
        result = ((result* 31)+((this.vzt == null)? 0 :this.vzt.hashCode()));
        result = ((result* 31)+((this.iost == null)? 0 :this.iost.hashCode()));
        result = ((result* 31)+((this.pnt == null)? 0 :this.pnt.hashCode()));
        result = ((result* 31)+((this.wand == null)? 0 :this.wand.hashCode()));
        result = ((result* 31)+((this.poe == null)? 0 :this.poe.hashCode()));
        result = ((result* 31)+((this.appc == null)? 0 :this.appc.hashCode()));
        result = ((result* 31)+((this.cvc == null)? 0 :this.cvc.hashCode()));
        result = ((result* 31)+((this.lgo == null)? 0 :this.lgo.hashCode()));
        result = ((result* 31)+((this.arn == null)? 0 :this.arn.hashCode()));
        result = ((result* 31)+((this.cvt == null)? 0 :this.cvt.hashCode()));
        result = ((result* 31)+((this.art == null)? 0 :this.art.hashCode()));
        result = ((result* 31)+((this.rte == null)? 0 :this.rte.hashCode()));
        result = ((result* 31)+((this.ary == null)? 0 :this.ary.hashCode()));
        result = ((result* 31)+((this.ppp == null)? 0 :this.ppp.hashCode()));
        result = ((result* 31)+((this.kick == null)? 0 :this.kick.hashCode()));
        result = ((result* 31)+((this.ppt == null)? 0 :this.ppt.hashCode()));
        result = ((result* 31)+((this.ankr == null)? 0 :this.ankr.hashCode()));
        result = ((result* 31)+((this.ast == null)? 0 :this.ast.hashCode()));
        result = ((result* 31)+((this.foam == null)? 0 :this.foam.hashCode()));
        result = ((result* 31)+((this.prix == null)? 0 :this.prix.hashCode()));
        result = ((result* 31)+((this.doge == null)? 0 :this.doge.hashCode()));
        result = ((result* 31)+((this.lif == null)? 0 :this.lif.hashCode()));
        result = ((result* 31)+((this.latx == null)? 0 :this.latx.hashCode()));
        result = ((result* 31)+((this.molk == null)? 0 :this.molk.hashCode()));
        result = ((result* 31)+((this.nmr == null)? 0 :this.nmr.hashCode()));
        result = ((result* 31)+((this.atl == null)? 0 :this.atl.hashCode()));
        result = ((result* 31)+((this.jet == null)? 0 :this.jet.hashCode()));
        result = ((result* 31)+((this.tmtg == null)? 0 :this.tmtg.hashCode()));
        result = ((result* 31)+((this.atm == null)? 0 :this.atm.hashCode()));
        result = ((result* 31)+((this.cxo == null)? 0 :this.cxo.hashCode()));
        result = ((result* 31)+((this.nanj == null)? 0 :this.nanj.hashCode()));
        result = ((result* 31)+((this.crpt == null)? 0 :this.crpt.hashCode()));
        result = ((result* 31)+((this.ncash == null)? 0 :this.ncash.hashCode()));
        result = ((result* 31)+((this.pra == null)? 0 :this.pra.hashCode()));
        result = ((result* 31)+((this.ats == null)? 0 :this.ats.hashCode()));
        result = ((result* 31)+((this.prg == null)? 0 :this.prg.hashCode()));
        result = ((result* 31)+((this.bstn == null)? 0 :this.bstn.hashCode()));
        result = ((result* 31)+((this.carat == null)? 0 :this.carat.hashCode()));
        result = ((result* 31)+((this.pro == null)? 0 :this.pro.hashCode()));
        result = ((result* 31)+((this.auc == null)? 0 :this.auc.hashCode()));
        result = ((result* 31)+((this.rvt == null)? 0 :this.rvt.hashCode()));
        result = ((result* 31)+((this.vidt == null)? 0 :this.vidt.hashCode()));
        result = ((result* 31)+((this.alis == null)? 0 :this.alis.hashCode()));
        result = ((result* 31)+((this.eris == null)? 0 :this.eris.hashCode()));
        result = ((result* 31)+((this.bolt == null)? 0 :this.bolt.hashCode()));
        result = ((result* 31)+((this.hbt == null)? 0 :this.hbt.hashCode()));
        result = ((result* 31)+((this.ccrb == null)? 0 :this.ccrb.hashCode()));
        result = ((result* 31)+((this.next == null)? 0 :this.next.hashCode()));
        result = ((result* 31)+((this.hbz == null)? 0 :this.hbz.hashCode()));
        result = ((result* 31)+((this.qbit == null)? 0 :this.qbit.hashCode()));
        result = ((result* 31)+((this.show == null)? 0 :this.show.hashCode()));
        result = ((result* 31)+((this.psm == null)? 0 :this.psm.hashCode()));
        result = ((result* 31)+((this.pst == null)? 0 :this.pst.hashCode()));
        result = ((result* 31)+((this.dfxt == null)? 0 :this.dfxt.hashCode()));
        result = ((result* 31)+((this.avh == null)? 0 :this.avh.hashCode()));
        result = ((result* 31)+((this.ecom == null)? 0 :this.ecom.hashCode()));
        result = ((result* 31)+((this.nox == null)? 0 :this.nox.hashCode()));
        result = ((result* 31)+((this.yee == null)? 0 :this.yee.hashCode()));
        result = ((result* 31)+((this.wab == null)? 0 :this.wab.hashCode()));
        result = ((result* 31)+((this.ptoy == null)? 0 :this.ptoy.hashCode()));
        result = ((result* 31)+((this.nexo == null)? 0 :this.nexo.hashCode()));
        result = ((result* 31)+((this.avt == null)? 0 :this.avt.hashCode()));
        result = ((result* 31)+((this.wan == null)? 0 :this.wan.hashCode()));
        result = ((result* 31)+((this.mbtx == null)? 0 :this.mbtx.hashCode()));
        result = ((result* 31)+((this.pylnt == null)? 0 :this.pylnt.hashCode()));
        result = ((result* 31)+((this.awc == null)? 0 :this.awc.hashCode()));
        result = ((result* 31)+((this.wax == null)? 0 :this.wax.hashCode()));
        result = ((result* 31)+((this.capp == null)? 0 :this.capp.hashCode()));
        result = ((result* 31)+((this.equal == null)? 0 :this.equal.hashCode()));
        result = ((result* 31)+((this._0xbtc == null)? 0 :this._0xbtc.hashCode()));
        result = ((result* 31)+((this.npx == null)? 0 :this.npx.hashCode()));
        result = ((result* 31)+((this.swftc == null)? 0 :this.swftc.hashCode()));
        result = ((result* 31)+((this.stash == null)? 0 :this.stash.hashCode()));
        result = ((result* 31)+((this.play == null)? 0 :this.play.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this.gens == null)? 0 :this.gens.hashCode()));
        result = ((result* 31)+((this.her == null)? 0 :this.her.hashCode()));
        result = ((result* 31)+((this.trac == null)? 0 :this.trac.hashCode()));
        result = ((result* 31)+((this.fat == null)? 0 :this.fat.hashCode()));
        result = ((result* 31)+((this.enter == null)? 0 :this.enter.hashCode()));
        result = ((result* 31)+((this._true == null)? 0 :this._true.hashCode()));
        result = ((result* 31)+((this.trak == null)? 0 :this.trak.hashCode()));
        result = ((result* 31)+((this.lnc == null)? 0 :this.lnc.hashCode()));
        result = ((result* 31)+((this.mxai == null)? 0 :this.mxai.hashCode()));
        result = ((result* 31)+((this.nrg == null)? 0 :this.nrg.hashCode()));
        result = ((result* 31)+((this.lnd == null)? 0 :this.lnd.hashCode()));
        result = ((result* 31)+((this.gene == null)? 0 :this.gene.hashCode()));
        result = ((result* 31)+((this.rmesh == null)? 0 :this.rmesh.hashCode()));
        result = ((result* 31)+((this.tiox == null)? 0 :this.tiox.hashCode()));
        result = ((result* 31)+((this.nrp == null)? 0 :this.nrp.hashCode()));
        result = ((result* 31)+((this.ctxc == null)? 0 :this.ctxc.hashCode()));
        result = ((result* 31)+((this.bqtx == null)? 0 :this.bqtx.hashCode()));
        result = ((result* 31)+((this.card == null)? 0 :this.card.hashCode()));
        result = ((result* 31)+((this.qusd == null)? 0 :this.qusd.hashCode()));
        result = ((result* 31)+((this.riya == null)? 0 :this.riya.hashCode()));
        result = ((result* 31)+((this.elite == null)? 0 :this.elite.hashCode()));
        result = ((result* 31)+((this.hgt == null)? 0 :this.hgt.hashCode()));
        result = ((result* 31)+((this.web == null)? 0 :this.web.hashCode()));
        result = ((result* 31)+((this.trct == null)? 0 :this.trct.hashCode()));
        result = ((result* 31)+((this.pxg == null)? 0 :this.pxg.hashCode()));
        result = ((result* 31)+((this.ntk == null)? 0 :this.ntk.hashCode()));
        result = ((result* 31)+((this.taas == null)? 0 :this.taas.hashCode()));
        result = ((result* 31)+((this.lpt == null)? 0 :this.lpt.hashCode()));
        result = ((result* 31)+((this.flixx == null)? 0 :this.flixx.hashCode()));
        result = ((result* 31)+((this.chat == null)? 0 :this.chat.hashCode()));
        result = ((result* 31)+((this.eosdac == null)? 0 :this.eosdac.hashCode()));
        result = ((result* 31)+((this.grid == null)? 0 :this.grid.hashCode()));
        result = ((result* 31)+((this.ubc == null)? 0 :this.ubc.hashCode()));
        result = ((result* 31)+((this.engt == null)? 0 :this.engt.hashCode()));
        result = ((result* 31)+((this.plbt == null)? 0 :this.plbt.hashCode()));
        result = ((result* 31)+((this.fdx == null)? 0 :this.fdx.hashCode()));
        result = ((result* 31)+((this.fdz == null)? 0 :this.fdz.hashCode()));
        result = ((result* 31)+((this.fundz == null)? 0 :this.fundz.hashCode()));
        result = ((result* 31)+((this.pyn == null)? 0 :this.pyn.hashCode()));
        result = ((result* 31)+((this.ubt == null)? 0 :this.ubt.hashCode()));
        result = ((result* 31)+((this.dice == null)? 0 :this.dice.hashCode()));
        result = ((result* 31)+((this.dag == null)? 0 :this.dag.hashCode()));
        result = ((result* 31)+((this.dooh == null)? 0 :this.dooh.hashCode()));
        result = ((result* 31)+((this.dai == null)? 0 :this.dai.hashCode()));
        result = ((result* 31)+((this.dan == null)? 0 :this.dan.hashCode()));
        result = ((result* 31)+((this.hit == null)? 0 :this.hit.hashCode()));
        result = ((result* 31)+((this.fet == null)? 0 :this.fet.hashCode()));
        result = ((result* 31)+((this.navi == null)? 0 :this.navi.hashCode()));
        result = ((result* 31)+((this.dat == null)? 0 :this.dat.hashCode()));
        result = ((result* 31)+((this.yoyow == null)? 0 :this.yoyow.hashCode()));
        result = ((result* 31)+((this.cryc == null)? 0 :this.cryc.hashCode()));
        result = ((result* 31)+((this.beat == null)? 0 :this.beat.hashCode()));
        result = ((result* 31)+((this.dav == null)? 0 :this.dav.hashCode()));
        result = ((result* 31)+((this.usdt == null)? 0 :this.usdt.hashCode()));
        result = ((result* 31)+((this.dax == null)? 0 :this.dax.hashCode()));
        result = ((result* 31)+((this.ichx == null)? 0 :this.ichx.hashCode()));
        result = ((result* 31)+((this.usds == null)? 0 :this.usds.hashCode()));
        result = ((result* 31)+((this.lrc == null)? 0 :this.lrc.hashCode()));
        result = ((result* 31)+((this.day == null)? 0 :this.day.hashCode()));
        result = ((result* 31)+((this.ecte == null)? 0 :this.ecte.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.uct == null)? 0 :this.uct.hashCode()));
        result = ((result* 31)+((this.elec == null)? 0 :this.elec.hashCode()));
        result = ((result* 31)+((this.usdc == null)? 0 :this.usdc.hashCode()));
        result = ((result* 31)+((this.jnt == null)? 0 :this.jnt.hashCode()));
        result = ((result* 31)+((this.soar == null)? 0 :this.soar.hashCode()));
        result = ((result* 31)+((this.trdt == null)? 0 :this.trdt.hashCode()));
        result = ((result* 31)+((this.hkn == null)? 0 :this.hkn.hashCode()));
        result = ((result* 31)+((this.lst == null)? 0 :this.lst.hashCode()));
        result = ((result* 31)+((this.dcn == null)? 0 :this.dcn.hashCode()));
        result = ((result* 31)+((this.getx == null)? 0 :this.getx.hashCode()));
        result = ((result* 31)+((this.nxc == null)? 0 :this.nxc.hashCode()));
        result = ((result* 31)+((this.ltc == null)? 0 :this.ltc.hashCode()));
        result = ((result* 31)+((this.gamb == null)? 0 :this.gamb.hashCode()));
        result = ((result* 31)+((this.sal == null)? 0 :this.sal.hashCode()));
        result = ((result* 31)+((this.san == null)? 0 :this.san.hashCode()));
        result = ((result* 31)+((this.ddd == null)? 0 :this.ddd.hashCode()));
        result = ((result* 31)+((this.lto == null)? 0 :this.lto.hashCode()));
        result = ((result* 31)+((this.sphtx == null)? 0 :this.sphtx.hashCode()));
        result = ((result* 31)+((this.bzky == null)? 0 :this.bzky.hashCode()));
        result = ((result* 31)+((this.wiz == null)? 0 :this.wiz.hashCode()));
        result = ((result* 31)+((this.grmd == null)? 0 :this.grmd.hashCode()));
        result = ((result* 31)+((this.menlo == null)? 0 :this.menlo.hashCode()));
        result = ((result* 31)+((this.luc == null)? 0 :this.luc.hashCode()));
        result = ((result* 31)+((this.hmc == null)? 0 :this.hmc.hashCode()));
        result = ((result* 31)+((this.deb == null)? 0 :this.deb.hashCode()));
        result = ((result* 31)+((this.ufr == null)? 0 :this.ufr.hashCode()));
        result = ((result* 31)+((this.dec == null)? 0 :this.dec.hashCode()));
        result = ((result* 31)+((this.lun == null)? 0 :this.lun.hashCode()));
        result = ((result* 31)+((this.susd == null)? 0 :this.susd.hashCode()));
        result = ((result* 31)+((this.hmq == null)? 0 :this.hmq.hashCode()));
        result = ((result* 31)+((this.npxs == null)? 0 :this.npxs.hashCode()));
        result = ((result* 31)+((this.ugc == null)? 0 :this.ugc.hashCode()));
        result = ((result* 31)+((this.btcm == null)? 0 :this.btcm.hashCode()));
        result = ((result* 31)+((this.scc == null)? 0 :this.scc.hashCode()));
        result = ((result* 31)+((this.trio == null)? 0 :this.trio.hashCode()));
        result = ((result* 31)+((this.bat == null)? 0 :this.bat.hashCode()));
        result = ((result* 31)+((this.btcl == null)? 0 :this.btcl.hashCode()));
        result = ((result* 31)+((this.bax == null)? 0 :this.bax.hashCode()));
        result = ((result* 31)+((this.stacs == null)? 0 :this.stacs.hashCode()));
        result = ((result* 31)+((this.cube == null)? 0 :this.cube.hashCode()));
        result = ((result* 31)+((this.scl == null)? 0 :this.scl.hashCode()));
        result = ((result* 31)+((this.bcap == null)? 0 :this.bcap.hashCode()));
        result = ((result* 31)+((this.medx == null)? 0 :this.medx.hashCode()));
        result = ((result* 31)+((this.bbc == null)? 0 :this.bbc.hashCode()));
        result = ((result* 31)+((this.ae == null)? 0 :this.ae.hashCode()));
        result = ((result* 31)+((this.pass == null)? 0 :this.pass.hashCode()));
        result = ((result* 31)+((this.bbo == null)? 0 :this.bbo.hashCode()));
        result = ((result* 31)+((this.bznt == null)? 0 :this.bznt.hashCode()));
        result = ((result* 31)+((this.ubex == null)? 0 :this.ubex.hashCode()));
        result = ((result* 31)+((this.elix == null)? 0 :this.elix.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.jse == null)? 0 :this.jse.hashCode()));
        result = ((result* 31)+((this.dgd == null)? 0 :this.dgd.hashCode()));
        result = ((result* 31)+((this.bch == null)? 0 :this.bch.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.bq == null)? 0 :this.bq.hashCode()));
        result = ((result* 31)+((this.vite == null)? 0 :this.vite.hashCode()));
        result = ((result* 31)+((this.dgx == null)? 0 :this.dgx.hashCode()));
        result = ((result* 31)+((this.matic == null)? 0 :this.matic.hashCode()));
        result = ((result* 31)+((this.bz == null)? 0 :this.bz.hashCode()));
        result = ((result* 31)+((this.hpb == null)? 0 :this.hpb.hashCode()));
        result = ((result* 31)+((this.bdg == null)? 0 :this.bdg.hashCode()));
        result = ((result* 31)+((this.cl == null)? 0 :this.cl.hashCode()));
        result = ((result* 31)+((this.abcc == null)? 0 :this.abcc.hashCode()));
        result = ((result* 31)+((this.hpt == null)? 0 :this.hpt.hashCode()));
        result = ((result* 31)+((this.cv == null)? 0 :this.cv.hashCode()));
        result = ((result* 31)+((this.lym == null)? 0 :this.lym.hashCode()));
        result = ((result* 31)+((this.bee == null)? 0 :this.bee.hashCode()));
        result = ((result* 31)+((this.dig == null)? 0 :this.dig.hashCode()));
        result = ((result* 31)+((this.hqt == null)? 0 :this.hqt.hashCode()));
        result = ((result* 31)+((this.dio == null)? 0 :this.dio.hashCode()));
        result = ((result* 31)+((this.hqx == null)? 0 :this.hqx.hashCode()));
        result = ((result* 31)+((this.ukg == null)? 0 :this.ukg.hashCode()));
        result = ((result* 31)+((this.bez == null)? 0 :this.bez.hashCode()));
        result = ((result* 31)+((this.udoo == null)? 0 :this.udoo.hashCode()));
        result = ((result* 31)+((this.sgn == null)? 0 :this.sgn.hashCode()));
        result = ((result* 31)+((this.fnd == null)? 0 :this.fnd.hashCode()));
        result = ((result* 31)+((this.baas == null)? 0 :this.baas.hashCode()));
        result = ((result* 31)+((this.sgr == null)? 0 :this.sgr.hashCode()));
        result = ((result* 31)+((this.ieth == null)? 0 :this.ieth.hashCode()));
        result = ((result* 31)+((this.bcdn == null)? 0 :this.bcdn.hashCode()));
        result = ((result* 31)+((this.ecash == null)? 0 :this.ecash.hashCode()));
        result = ((result* 31)+((this.qcx == null)? 0 :this.qcx.hashCode()));
        result = ((result* 31)+((this.brat == null)? 0 :this.brat.hashCode()));
        result = ((result* 31)+((this.bft == null)? 0 :this.bft.hashCode()));
        result = ((result* 31)+((this.she == null)? 0 :this.she.hashCode()));
        result = ((result* 31)+((this.wpp == null)? 0 :this.wpp.hashCode()));
        result = ((result* 31)+((this.wpr == null)? 0 :this.wpr.hashCode()));
        result = ((result* 31)+((this.hsc == null)? 0 :this.hsc.hashCode()));
        result = ((result* 31)+((this.shp == null)? 0 :this.shp.hashCode()));
        result = ((result* 31)+((this.gard == null)? 0 :this.gard.hashCode()));
        result = ((result* 31)+((this.bcdt == null)? 0 :this.bcdt.hashCode()));
        result = ((result* 31)+((this.bgg == null)? 0 :this.bgg.hashCode()));
        result = ((result* 31)+((this.soma == null)? 0 :this.soma.hashCode()));
        result = ((result* 31)+((this.fota == null)? 0 :this.fota.hashCode()));
        result = ((result* 31)+((this.hst == null)? 0 :this.hst.hashCode()));
        result = ((result* 31)+((this.ft == null)? 0 :this.ft.hashCode()));
        result = ((result* 31)+((this.yup == null)? 0 :this.yup.hashCode()));
        result = ((result* 31)+((this.bela == null)? 0 :this.bela.hashCode()));
        result = ((result* 31)+((this.oax == null)? 0 :this.oax.hashCode()));
        result = ((result* 31)+((this.spank == null)? 0 :this.spank.hashCode()));
        result = ((result* 31)+((this.wrc == null)? 0 :this.wrc.hashCode()));
        result = ((result* 31)+((this.dlt == null)? 0 :this.dlt.hashCode()));
        result = ((result* 31)+((this.nbai == null)? 0 :this.nbai.hashCode()));
        result = ((result* 31)+((this.tgame == null)? 0 :this.tgame.hashCode()));
        result = ((result* 31)+((this.hb == null)? 0 :this.hb.hashCode()));
        result = ((result* 31)+((this.lqdn == null)? 0 :this.lqdn.hashCode()));
        result = ((result* 31)+((this.dml == null)? 0 :this.dml.hashCode()));
        result = ((result* 31)+((this.hur == null)? 0 :this.hur.hashCode()));
        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
        result = ((result* 31)+((this.dmt == null)? 0 :this.dmt.hashCode()));
        result = ((result* 31)+((this.eltcoin == null)? 0 :this.eltcoin.hashCode()));
        result = ((result* 31)+((this.ht == null)? 0 :this.ht.hashCode()));
        result = ((result* 31)+((this.bix == null)? 0 :this.bix.hashCode()));
        result = ((result* 31)+((this.veri == null)? 0 :this.veri.hashCode()));
        result = ((result* 31)+((this.mitx == null)? 0 :this.mitx.hashCode()));
        result = ((result* 31)+((this.xpat == null)? 0 :this.xpat.hashCode()));
        result = ((result* 31)+((this.skm == null)? 0 :this.skm.hashCode()));
        result = ((result* 31)+((this.dna == null)? 0 :this.dna.hashCode()));
        result = ((result* 31)+((this.lock == null)? 0 :this.lock.hashCode()));
        result = ((result* 31)+((this.loci == null)? 0 :this.loci.hashCode()));
        result = ((result* 31)+((this.ocn == null)? 0 :this.ocn.hashCode()));
        result = ((result* 31)+((this.zinc == null)? 0 :this.zinc.hashCode()));
        result = ((result* 31)+((this.ig == null)? 0 :this.ig.hashCode()));
        result = ((result* 31)+((this.hvn == null)? 0 :this.hvn.hashCode()));
        result = ((result* 31)+((this.mith == null)? 0 :this.mith.hashCode()));
        result = ((result* 31)+((this.bitx == null)? 0 :this.bitx.hashCode()));
        result = ((result* 31)+((this.j8t == null)? 0 :this.j8t.hashCode()));
        result = ((result* 31)+((this.wtc == null)? 0 :this.wtc.hashCode()));
        result = ((result* 31)+((this.metal == null)? 0 :this.metal.hashCode()));
        result = ((result* 31)+((this.dnt == null)? 0 :this.dnt.hashCode()));
        result = ((result* 31)+((this.wtl == null)? 0 :this.wtl.hashCode()));
        result = ((result* 31)+((this.ode == null)? 0 :this.ode.hashCode()));
        result = ((result* 31)+((this.wcoin == null)? 0 :this.wcoin.hashCode()));
        result = ((result* 31)+((this.upp == null)? 0 :this.upp.hashCode()));
        result = ((result* 31)+((this.csen == null)? 0 :this.csen.hashCode()));
        result = ((result* 31)+((this.jc == null)? 0 :this.jc.hashCode()));
        result = ((result* 31)+((this.slt == null)? 0 :this.slt.hashCode()));
        result = ((result* 31)+((this.banca == null)? 0 :this.banca.hashCode()));
        result = ((result* 31)+((this.fsn == null)? 0 :this.fsn.hashCode()));
        result = ((result* 31)+((this.orbs == null)? 0 :this.orbs.hashCode()));
        result = ((result* 31)+((this.uqc == null)? 0 :this.uqc.hashCode()));
        result = ((result* 31)+((this.skin == null)? 0 :this.skin.hashCode()));
        result = ((result* 31)+((this.credo == null)? 0 :this.credo.hashCode()));
        result = ((result* 31)+((this.dov == null)? 0 :this.dov.hashCode()));
        result = ((result* 31)+((this.zipt == null)? 0 :this.zipt.hashCode()));
        result = ((result* 31)+((this.dow == null)? 0 :this.dow.hashCode()));
        result = ((result* 31)+((this.bkx == null)? 0 :this.bkx.hashCode()));
        result = ((result* 31)+((this.btmx == null)? 0 :this.btmx.hashCode()));
        result = ((result* 31)+((this.chsb == null)? 0 :this.chsb.hashCode()));
        result = ((result* 31)+((this.smt == null)? 0 :this.smt.hashCode()));
        result = ((result* 31)+((this.abyss == null)? 0 :this.abyss.hashCode()));
        result = ((result* 31)+((this.ftm == null)? 0 :this.ftm.hashCode()));
        result = ((result* 31)+((this.ftt == null)? 0 :this.ftt.hashCode()));
        result = ((result* 31)+((this.vest == null)? 0 :this.vest.hashCode()));
        result = ((result* 31)+((this.snc == null)? 0 :this.snc.hashCode()));
        result = ((result* 31)+((this.trst == null)? 0 :this.trst.hashCode()));
        result = ((result* 31)+((this.blt == null)? 0 :this.blt.hashCode()));
        result = ((result* 31)+((this.ftx == null)? 0 :this.ftx.hashCode()));
        result = ((result* 31)+((this.dpy == null)? 0 :this.dpy.hashCode()));
        result = ((result* 31)+((this.blz == null)? 0 :this.blz.hashCode()));
        result = ((result* 31)+((this.snm == null)? 0 :this.snm.hashCode()));
        result = ((result* 31)+((this.la == null)? 0 :this.la.hashCode()));
        result = ((result* 31)+((this.snt == null)? 0 :this.snt.hashCode()));
        result = ((result* 31)+((this.bmc == null)? 0 :this.bmc.hashCode()));
        result = ((result* 31)+((this.mtkn == null)? 0 :this.mtkn.hashCode()));
        result = ((result* 31)+((this.sns == null)? 0 :this.sns.hashCode()));
        result = ((result* 31)+((this.bmh == null)? 0 :this.bmh.hashCode()));
        result = ((result* 31)+((this.snx == null)? 0 :this.snx.hashCode()));
        result = ((result* 31)+((this.fun == null)? 0 :this.fun.hashCode()));
        result = ((result* 31)+((this.xbase == null)? 0 :this.xbase.hashCode()));
        result = ((result* 31)+((this.hyt == null)? 0 :this.hyt.hashCode()));
        result = ((result* 31)+((this.sxdt == null)? 0 :this.sxdt.hashCode()));
        result = ((result* 31)+((this.soc == null)? 0 :this.soc.hashCode()));
        result = ((result* 31)+((this.use == null)? 0 :this.use.hashCode()));
        result = ((result* 31)+((this.qkc == null)? 0 :this.qkc.hashCode()));
        result = ((result* 31)+((this.xclr == null)? 0 :this.xclr.hashCode()));
        result = ((result* 31)+((this.bmx == null)? 0 :this.bmx.hashCode()));
        result = ((result* 31)+((this.voise == null)? 0 :this.voise.hashCode()));
        result = ((result* 31)+((this.aidoc == null)? 0 :this.aidoc.hashCode()));
        result = ((result* 31)+((this.drg == null)? 0 :this.drg.hashCode()));
        result = ((result* 31)+((this.mco == null)? 0 :this.mco.hashCode()));
        result = ((result* 31)+((this.noah == null)? 0 :this.noah.hashCode()));
        result = ((result* 31)+((this.bnk == null)? 0 :this.bnk.hashCode()));
        result = ((result* 31)+((this.rntb == null)? 0 :this.rntb.hashCode()));
        result = ((result* 31)+((this.bnn == null)? 0 :this.bnn.hashCode()));
        result = ((result* 31)+((this.drt == null)? 0 :this.drt.hashCode()));
        result = ((result* 31)+((this.spf == null)? 0 :this.spf.hashCode()));
        result = ((result* 31)+((this.bnt == null)? 0 :this.bnt.hashCode()));
        result = ((result* 31)+((this.mda == null)? 0 :this.mda.hashCode()));
        result = ((result* 31)+((this.utk == null)? 0 :this.utk.hashCode()));
        result = ((result* 31)+((this.dacc == null)? 0 :this.dacc.hashCode()));
        result = ((result* 31)+((this.bob == null)? 0 :this.bob.hashCode()));
        result = ((result* 31)+((this.utt == null)? 0 :this.utt.hashCode()));
        result = ((result* 31)+((this.foxt == null)? 0 :this.foxt.hashCode()));
        result = ((result* 31)+((this.spt == null)? 0 :this.spt.hashCode()));
        result = ((result* 31)+((this._1st == null)? 0 :this._1st.hashCode()));
        result = ((result* 31)+((this.boe == null)? 0 :this.boe.hashCode()));
        result = ((result* 31)+((this.spx == null)? 0 :this.spx.hashCode()));
        result = ((result* 31)+((this.mds == null)? 0 :this.mds.hashCode()));
        result = ((result* 31)+((this.nuls == null)? 0 :this.nuls.hashCode()));
        result = ((result* 31)+((this.mixi == null)? 0 :this.mixi.hashCode()));
        result = ((result* 31)+((this.bon == null)? 0 :this.bon.hashCode()));
        result = ((result* 31)+((this.candy == null)? 0 :this.candy.hashCode()));
        result = ((result* 31)+((this.bot == null)? 0 :this.bot.hashCode()));
        result = ((result* 31)+((this.seal == null)? 0 :this.seal.hashCode()));
        result = ((result* 31)+((this.box == null)? 0 :this.box.hashCode()));
        result = ((result* 31)+((this.mee == null)? 0 :this.mee.hashCode()));
        result = ((result* 31)+((this.wys == null)? 0 :this.wys.hashCode()));
        result = ((result* 31)+((this.oio == null)? 0 :this.oio.hashCode()));
        result = ((result* 31)+((this.uuu == null)? 0 :this.uuu.hashCode()));
        result = ((result* 31)+((this.dth == null)? 0 :this.dth.hashCode()));
        result = ((result* 31)+((this.kan == null)? 0 :this.kan.hashCode()));
        result = ((result* 31)+((this.drgn == null)? 0 :this.drgn.hashCode()));
        result = ((result* 31)+((this.nobs == null)? 0 :this.nobs.hashCode()));
        result = ((result* 31)+((this.dtr == null)? 0 :this.dtr.hashCode()));
        result = ((result* 31)+((this.fxt == null)? 0 :this.fxt.hashCode()));
        result = ((result* 31)+((this.bether == null)? 0 :this.bether.hashCode()));
        result = ((result* 31)+((this.boltt == null)? 0 :this.boltt.hashCode()));
        result = ((result* 31)+((this.bpt == null)? 0 :this.bpt.hashCode()));
        result = ((result* 31)+((this.dtx == null)? 0 :this.dtx.hashCode()));
        result = ((result* 31)+((this.bpx == null)? 0 :this.bpx.hashCode()));
        result = ((result* 31)+((this.dadi == null)? 0 :this.dadi.hashCode()));
        result = ((result* 31)+((this.kbc == null)? 0 :this.kbc.hashCode()));
        result = ((result* 31)+((this.srn == null)? 0 :this.srn.hashCode()));
        result = ((result* 31)+((this.mfg == null)? 0 :this.mfg.hashCode()));
        result = ((result* 31)+((this.pareto == null)? 0 :this.pareto.hashCode()));
        result = ((result* 31)+((this.earth == null)? 0 :this.earth.hashCode()));
        result = ((result* 31)+((this.mft == null)? 0 :this.mft.hashCode()));
        result = ((result* 31)+((this.fyp == null)? 0 :this.fyp.hashCode()));
        result = ((result* 31)+((this.ipsx == null)? 0 :this.ipsx.hashCode()));
        result = ((result* 31)+((this.asto == null)? 0 :this.asto.hashCode()));
        result = ((result* 31)+((this.cofi == null)? 0 :this.cofi.hashCode()));
        result = ((result* 31)+((this.dagt == null)? 0 :this.dagt.hashCode()));
        result = ((result* 31)+((this.okb == null)? 0 :this.okb.hashCode()));
        result = ((result* 31)+((this.mgo == null)? 0 :this.mgo.hashCode()));
        result = ((result* 31)+((this.brd == null)? 0 :this.brd.hashCode()));
        result = ((result* 31)+((this.kcs == null)? 0 :this.kcs.hashCode()));
        result = ((result* 31)+((this.csno == null)? 0 :this.csno.hashCode()));
        result = ((result* 31)+((this.btrn == null)? 0 :this.btrn.hashCode()));
        result = ((result* 31)+((this._1wo == null)? 0 :this._1wo.hashCode()));
        result = ((result* 31)+((this.metm == null)? 0 :this.metm.hashCode()));
        result = ((result* 31)+((this.stc == null)? 0 :this.stc.hashCode()));
        result = ((result* 31)+((this.zap == null)? 0 :this.zap.hashCode()));
        result = ((result* 31)+((this.dent == null)? 0 :this.dent.hashCode()));
        result = ((result* 31)+((this.ole == null)? 0 :this.ole.hashCode()));
        result = ((result* 31)+((this.bcpt == null)? 0 :this.bcpt.hashCode()));
        result = ((result* 31)+((this.mtrc == null)? 0 :this.mtrc.hashCode()));
        result = ((result* 31)+((this.stk == null)? 0 :this.stk.hashCode()));
        result = ((result* 31)+((this.betr == null)? 0 :this.betr.hashCode()));
        result = ((result* 31)+((this.horse == null)? 0 :this.horse.hashCode()));
        result = ((result* 31)+((this.stq == null)? 0 :this.stq.hashCode()));
        result = ((result* 31)+((this.stu == null)? 0 :this.stu.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        result = ((result* 31)+((this.olt == null)? 0 :this.olt.hashCode()));
        result = ((result* 31)+((this.stx == null)? 0 :this.stx.hashCode()));
        result = ((result* 31)+((this.sub == null)? 0 :this.sub.hashCode()));
        result = ((result* 31)+((this.bsv == null)? 0 :this.bsv.hashCode()));
        result = ((result* 31)+((this.mic == null)? 0 :this.mic.hashCode()));
        result = ((result* 31)+((this.omg == null)? 0 :this.omg.hashCode()));
        result = ((result* 31)+((this.wbtc == null)? 0 :this.wbtc.hashCode()));
        result = ((result* 31)+((this.btc == null)? 0 :this.btc.hashCode()));
        result = ((result* 31)+((this.sur == null)? 0 :this.sur.hashCode()));
        result = ((result* 31)+((this.b2b == null)? 0 :this.b2b.hashCode()));
        result = ((result* 31)+((this.btm == null)? 0 :this.btm.hashCode()));
        result = ((result* 31)+((this.frec == null)? 0 :this.frec.hashCode()));
        result = ((result* 31)+((this.omx == null)? 0 :this.omx.hashCode()));
        result = ((result* 31)+((this.bto == null)? 0 :this.bto.hashCode()));
        result = ((result* 31)+((this.free == null)? 0 :this.free.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.ss == null)? 0 :this.ss.hashCode()));
        result = ((result* 31)+((this.svd == null)? 0 :this.svd.hashCode()));
        result = ((result* 31)+((this.dxt == null)? 0 :this.dxt.hashCode()));
        result = ((result* 31)+((this.btu == null)? 0 :this.btu.hashCode()));
        result = ((result* 31)+((this.storm == null)? 0 :this.storm.hashCode()));
        result = ((result* 31)+((this.star == null)? 0 :this.star.hashCode()));
        result = ((result* 31)+((this.zcn == null)? 0 :this.zcn.hashCode()));
        result = ((result* 31)+((this.zco == null)? 0 :this.zco.hashCode()));
        result = ((result* 31)+((this.dgtx == null)? 0 :this.dgtx.hashCode()));
        result = ((result* 31)+((this.ong == null)? 0 :this.ong.hashCode()));
        result = ((result* 31)+((this.onl == null)? 0 :this.onl.hashCode()));
        result = ((result* 31)+((this.storj == null)? 0 :this.storj.hashCode()));
        result = ((result* 31)+((this.mrph == null)? 0 :this.mrph.hashCode()));
        result = ((result* 31)+((this.bud == null)? 0 :this.bud.hashCode()));
        result = ((result* 31)+((this.hedg == null)? 0 :this.hedg.hashCode()));
        result = ((result* 31)+((this.face == null)? 0 :this.face.hashCode()));
        result = ((result* 31)+((this.ugas == null)? 0 :this.ugas.hashCode()));
        result = ((result* 31)+((this.zeon == null)? 0 :this.zeon.hashCode()));
        result = ((result* 31)+((this.mana == null)? 0 :this.mana.hashCode()));
        result = ((result* 31)+((this.cmct == null)? 0 :this.cmct.hashCode()));
        result = ((result* 31)+((this.stac == null)? 0 :this.stac.hashCode()));
        result = ((result* 31)+((this.ruff == null)? 0 :this.ruff.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.swc == null)? 0 :this.swc.hashCode()));
        result = ((result* 31)+((this.berry == null)? 0 :this.berry.hashCode()));
        result = ((result* 31)+((this.joint == null)? 0 :this.joint.hashCode()));
        result = ((result* 31)+((this.orme == null)? 0 :this.orme.hashCode()));
        result = ((result* 31)+((this.qsp == null)? 0 :this.qsp.hashCode()));
        result = ((result* 31)+((this.swt == null)? 0 :this.swt.hashCode()));
        result = ((result* 31)+((this.loom == null)? 0 :this.loom.hashCode()));
        result = ((result* 31)+((this.icn == null)? 0 :this.icn.hashCode()));
        result = ((result* 31)+((this.mkr == null)? 0 :this.mkr.hashCode()));
        result = ((result* 31)+((this.amlt == null)? 0 :this.amlt.hashCode()));
        result = ((result* 31)+((this.zec == null)? 0 :this.zec.hashCode()));
        result = ((result* 31)+((this.up == null)? 0 :this.up.hashCode()));
        result = ((result* 31)+((this.invc == null)? 0 :this.invc.hashCode()));
        result = ((result* 31)+((this.idh == null)? 0 :this.idh.hashCode()));
        result = ((result* 31)+((this.mln == null)? 0 :this.mln.hashCode()));
        result = ((result* 31)+((this.opt == null)? 0 :this.opt.hashCode()));
        result = ((result* 31)+((this.solve == null)? 0 :this.solve.hashCode()));
        result = ((result* 31)+((this.idt == null)? 0 :this.idt.hashCode()));
        result = ((result* 31)+((this.tfuel == null)? 0 :this.tfuel.hashCode()));
        result = ((result* 31)+((this.xbb == null)? 0 :this.xbb.hashCode()));
        result = ((result* 31)+((this.cennz == null)? 0 :this.cennz.hashCode()));
        result = ((result* 31)+((this.skrb == null)? 0 :this.skrb.hashCode()));
        result = ((result* 31)+((this.bwt == null)? 0 :this.bwt.hashCode()));
        result = ((result* 31)+((this.coin == null)? 0 :this.coin.hashCode()));
        result = ((result* 31)+((this.rhoc == null)? 0 :this.rhoc.hashCode()));
        result = ((result* 31)+((this.drop == null)? 0 :this.drop.hashCode()));
        result = ((result* 31)+((this.xbl == null)? 0 :this.xbl.hashCode()));
        result = ((result* 31)+((this.qun == null)? 0 :this.qun.hashCode()));
        result = ((result* 31)+((this.life == null)? 0 :this.life.hashCode()));
        result = ((result* 31)+((this.xbx == null)? 0 :this.xbx.hashCode()));
        result = ((result* 31)+((this.inxt == null)? 0 :this.inxt.hashCode()));
        result = ((result* 31)+((this.kin == null)? 0 :this.kin.hashCode()));
        result = ((result* 31)+((this.noku == null)? 0 :this.noku.hashCode()));
        result = ((result* 31)+((this.xcd == null)? 0 :this.xcd.hashCode()));
        result = ((result* 31)+((this.wt == null)? 0 :this.wt.hashCode()));
        result = ((result* 31)+((this.eurs == null)? 0 :this.eurs.hashCode()));
        result = ((result* 31)+((this.mnc == null)? 0 :this.mnc.hashCode()));
        result = ((result* 31)+((this.mne == null)? 0 :this.mne.hashCode()));
        result = ((result* 31)+((this.ori == null)? 0 :this.ori.hashCode()));
        result = ((result* 31)+((this.dtrc == null)? 0 :this.dtrc.hashCode()));
        result = ((result* 31)+((this.ors == null)? 0 :this.ors.hashCode()));
        result = ((result* 31)+((this.ift == null)? 0 :this.ift.hashCode()));
        result = ((result* 31)+((this.osa == null)? 0 :this.osa.hashCode()));
        result = ((result* 31)+((this.hydro == null)? 0 :this.hydro.hashCode()));
        result = ((result* 31)+((this.mof == null)? 0 :this.mof.hashCode()));
        result = ((result* 31)+((this.coni == null)? 0 :this.coni.hashCode()));
        result = ((result* 31)+((this.ost == null)? 0 :this.ost.hashCode()));
        result = ((result* 31)+((this.mot == null)? 0 :this.mot.hashCode()));
        result = ((result* 31)+((this._int == null)? 0 :this._int.hashCode()));
        result = ((result* 31)+((this.zil == null)? 0 :this.zil.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.ihf == null)? 0 :this.ihf.hashCode()));
        result = ((result* 31)+((this.xet == null)? 0 :this.xet.hashCode()));
        result = ((result* 31)+((this.xes == null)? 0 :this.xes.hashCode()));
        result = ((result* 31)+((this.quant == null)? 0 :this.quant.hashCode()));
        result = ((result* 31)+((this.srch == null)? 0 :this.srch.hashCode()));
        result = ((result* 31)+((this.iht == null)? 0 :this.iht.hashCode()));
        result = ((result* 31)+((this.zt == null)? 0 :this.zt.hashCode()));
        result = ((result* 31)+((this.drpu == null)? 0 :this.drpu.hashCode()));
        result = ((result* 31)+((this.daoc == null)? 0 :this.daoc.hashCode()));
        result = ((result* 31)+((this.idex == null)? 0 :this.idex.hashCode()));
        result = ((result* 31)+((this.gem == null)? 0 :this.gem.hashCode()));
        result = ((result* 31)+((this.robet == null)? 0 :this.robet.hashCode()));
        result = ((result* 31)+((this.rock == null)? 0 :this.rock.hashCode()));
        result = ((result* 31)+((this.knc == null)? 0 :this.knc.hashCode()));
        result = ((result* 31)+((this.ebc == null)? 0 :this.ebc.hashCode()));
        result = ((result* 31)+((this.mrk == null)? 0 :this.mrk.hashCode()));
        result = ((result* 31)+((this.shping == null)? 0 :this.shping.hashCode()));
        result = ((result* 31)+((this.daps == null)? 0 :this.daps.hashCode()));
        result = ((result* 31)+((this.mwat == null)? 0 :this.mwat.hashCode()));
        result = ((result* 31)+((this.zla == null)? 0 :this.zla.hashCode()));
        result = ((result* 31)+((this.wings == null)? 0 :this.wings.hashCode()));
        result = ((result* 31)+((this.xaur == null)? 0 :this.xaur.hashCode()));
        result = ((result* 31)+((this.sntvt == null)? 0 :this.sntvt.hashCode()));
        result = ((result* 31)+((this.thrt == null)? 0 :this.thrt.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.seele == null)? 0 :this.seele.hashCode()));
        result = ((result* 31)+((this.poll == null)? 0 :this.poll.hashCode()));
        result = ((result* 31)+((this.gusd == null)? 0 :this.gusd.hashCode()));
        result = ((result* 31)+((this.vee == null)? 0 :this.vee.hashCode()));
        result = ((result* 31)+((this.zmn == null)? 0 :this.zmn.hashCode()));
        result = ((result* 31)+((this.mtc == null)? 0 :this.mtc.hashCode()));
        result = ((result* 31)+((this.mth == null)? 0 :this.mth.hashCode()));
        result = ((result* 31)+((this.vet == null)? 0 :this.vet.hashCode()));
        result = ((result* 31)+((this.like == null)? 0 :this.like.hashCode()));
        result = ((result* 31)+((this.blnm == null)? 0 :this.blnm.hashCode()));
        result = ((result* 31)+((this.edg == null)? 0 :this.edg.hashCode()));
        result = ((result* 31)+((this.m2o == null)? 0 :this.m2o.hashCode()));
        result = ((result* 31)+((this.sent == null)? 0 :this.sent.hashCode()));
        result = ((result* 31)+((this.edn == null)? 0 :this.edn.hashCode()));
        result = ((result* 31)+((this.aergo == null)? 0 :this.aergo.hashCode()));
        result = ((result* 31)+((this.bloc == null)? 0 :this.bloc.hashCode()));
        result = ((result* 31)+((this.mtx == null)? 0 :this.mtx.hashCode()));
        result = ((result* 31)+((this.edo == null)? 0 :this.edo.hashCode()));
        result = ((result* 31)+((this.senc == null)? 0 :this.senc.hashCode()));
        result = ((result* 31)+((this.edu == null)? 0 :this.edu.hashCode()));
        result = ((result* 31)+((this.dash == null)? 0 :this.dash.hashCode()));
        result = ((result* 31)+((this.lina == null)? 0 :this.lina.hashCode()));
        result = ((result* 31)+((this.srcoin == null)? 0 :this.srcoin.hashCode()));
        result = ((result* 31)+((this.cag == null)? 0 :this.cag.hashCode()));
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.hero == null)? 0 :this.hero.hashCode()));
        result = ((result* 31)+((this.tbx == null)? 0 :this.tbx.hashCode()));
        result = ((result* 31)+((this.bubo == null)? 0 :this.bubo.hashCode()));
        result = ((result* 31)+((this.erc20 == null)? 0 :this.erc20 .hashCode()));
        result = ((result* 31)+((this.can == null)? 0 :this.can.hashCode()));
        result = ((result* 31)+((this.imt == null)? 0 :this.imt.hashCode()));
        result = ((result* 31)+((this.car == null)? 0 :this.car.hashCode()));
        result = ((result* 31)+((this.tch == null)? 0 :this.tch.hashCode()));
        result = ((result* 31)+((this.bouts == null)? 0 :this.bouts.hashCode()));
        result = ((result* 31)+((this.ind == null)? 0 :this.ind.hashCode()));
        result = ((result* 31)+((this.mvl == null)? 0 :this.mvl.hashCode()));
        result = ((result* 31)+((this.ebtc == null)? 0 :this.ebtc.hashCode()));
        result = ((result* 31)+((this.ing == null)? 0 :this.ing.hashCode()));
        result = ((result* 31)+((this.krl == null)? 0 :this.krl.hashCode()));
        result = ((result* 31)+((this.tct == null)? 0 :this.tct.hashCode()));
        result = ((result* 31)+((this.cbc == null)? 0 :this.cbc.hashCode()));
        result = ((result* 31)+((this.cosm == null)? 0 :this.cosm.hashCode()));
        result = ((result* 31)+((this.mntp == null)? 0 :this.mntp.hashCode()));
        result = ((result* 31)+((this.datx == null)? 0 :this.datx.hashCode()));
        result = ((result* 31)+((this.ins == null)? 0 :this.ins.hashCode()));
        result = ((result* 31)+((this.inx == null)? 0 :this.inx.hashCode()));
        result = ((result* 31)+((this.sxut == null)? 0 :this.sxut.hashCode()));
        result = ((result* 31)+((this.cbt == null)? 0 :this.cbt.hashCode()));
        result = ((result* 31)+((this.swarm == null)? 0 :this.swarm.hashCode()));
        result = ((result* 31)+((this.ledu == null)? 0 :this.ledu.hashCode()));
        result = ((result* 31)+((this.poly == null)? 0 :this.poly.hashCode()));
        result = ((result* 31)+((this.zpr == null)? 0 :this.zpr.hashCode()));
        result = ((result* 31)+((this.bnty == null)? 0 :this.bnty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.tdp == rhs.tdp)||((this.tdp!= null)&&this.tdp.equals(rhs.tdp)))&&((this.tds == rhs.tds)||((this.tds!= null)&&this.tds.equals(rhs.tds))))&&((this.fairg == rhs.fairg)||((this.fairg!= null)&&this.fairg.equals(rhs.fairg))))&&((this.araw == rhs.araw)||((this.araw!= null)&&this.araw.equals(rhs.araw))))&&((this.kcash == rhs.kcash)||((this.kcash!= null)&&this.kcash.equals(rhs.kcash))))&&((this.ccl == rhs.ccl)||((this.ccl!= null)&&this.ccl.equals(rhs.ccl))))&&((this.theta == rhs.theta)||((this.theta!= null)&&this.theta.equals(rhs.theta))))&&((this.cco == rhs.cco)||((this.cco!= null)&&this.cco.equals(rhs.cco))))&&((this.egt == rhs.egt)||((this.egt!= null)&&this.egt.equals(rhs.egt))))&&((this.cct == rhs.cct)||((this.cct!= null)&&this.cct.equals(rhs.cct))))&&((this.tel == rhs.tel)||((this.tel!= null)&&this.tel.equals(rhs.tel))))&&((this.vin == rhs.vin)||((this.vin!= null)&&this.vin.equals(rhs.vin))))&&((this.ten == rhs.ten)||((this.ten!= null)&&this.ten.equals(rhs.ten))))&&((this.ipc == rhs.ipc)||((this.ipc!= null)&&this.ipc.equals(rhs.ipc))))&&((this.accn == rhs.accn)||((this.accn!= null)&&this.accn.equals(rhs.accn))))&&((this.vit == rhs.vit)||((this.vit!= null)&&this.vit.equals(rhs.vit))))&&((this.xmx == rhs.xmx)||((this.xmx!= null)&&this.xmx.equals(rhs.xmx))))&&((this.mxm == rhs.mxm)||((this.mxm!= null)&&this.mxm.equals(rhs.mxm))))&&((this.viu == rhs.viu)||((this.viu!= null)&&this.viu.equals(rhs.viu))))&&((this.lion == rhs.lion)||((this.lion!= null)&&this.lion.equals(rhs.lion))))&&((this.xng == rhs.xng)||((this.xng!= null)&&this.xng.equals(rhs.xng))))&&((this.cdt == rhs.cdt)||((this.cdt!= null)&&this.cdt.equals(rhs.cdt))))&&((this.tfd == rhs.tfd)||((this.tfd!= null)&&this.tfd.equals(rhs.tfd))))&&((this.xnk == rhs.xnk)||((this.xnk!= null)&&this.xnk.equals(rhs.xnk))))&&((this.guess == rhs.guess)||((this.guess!= null)&&this.guess.equals(rhs.guess))))&&((this.cdx == rhs.cdx)||((this.cdx!= null)&&this.cdx.equals(rhs.cdx))))&&((this.myb == rhs.myb)||((this.myb!= null)&&this.myb.equals(rhs.myb))))&&((this.cova == rhs.cova)||((this.cova!= null)&&this.cova.equals(rhs.cova))))&&((this.kue == rhs.kue)||((this.kue!= null)&&this.kue.equals(rhs.kue))))&&((this.tfl == rhs.tfl)||((this.tfl!= null)&&this.tfl.equals(rhs.tfl))))&&((this.zrx == rhs.zrx)||((this.zrx!= null)&&this.zrx.equals(rhs.zrx))))&&((this.aac == rhs.aac)||((this.aac!= null)&&this.aac.equals(rhs.aac))))&&((this.iqn == rhs.iqn)||((this.iqn!= null)&&this.iqn.equals(rhs.iqn))))&&((this.cel == rhs.cel)||((this.cel!= null)&&this.cel.equals(rhs.cel))))&&((this.zsc == rhs.zsc)||((this.zsc!= null)&&this.zsc.equals(rhs.zsc))))&&((this.cen == rhs.cen)||((this.cen!= null)&&this.cen.equals(rhs.cen))))&&((this.arct == rhs.arct)||((this.arct!= null)&&this.arct.equals(rhs.arct))))&&((this.qash == rhs.qash)||((this.qash!= null)&&this.qash.equals(rhs.qash))))&&((this.cet == rhs.cet)||((this.cet!= null)&&this.cet.equals(rhs.cet))))&&((this.axpr == rhs.axpr)||((this.axpr!= null)&&this.axpr.equals(rhs.axpr))))&&((this.flik == rhs.flik)||((this.flik!= null)&&this.flik.equals(rhs.flik))))&&((this.rcn == rhs.rcn)||((this.rcn!= null)&&this.rcn.equals(rhs.rcn))))&&((this.xov == rhs.xov)||((this.xov!= null)&&this.xov.equals(rhs.xov))))&&((this.hand == rhs.hand)||((this.hand!= null)&&this.hand.equals(rhs.hand))))&&((this.tgt == rhs.tgt)||((this.tgt!= null)&&this.tgt.equals(rhs.tgt))))&&((this.rct == rhs.rct)||((this.rct!= null)&&this.rct.equals(rhs.rct))))&&((this.salt == rhs.salt)||((this.salt!= null)&&this.salt.equals(rhs.salt))))&&((this.gno == rhs.gno)||((this.gno!= null)&&this.gno.equals(rhs.gno))))&&((this.gnt == rhs.gnt)||((this.gnt!= null)&&this.gnt.equals(rhs.gnt))))&&((this.arbt == rhs.arbt)||((this.arbt!= null)&&this.arbt.equals(rhs.arbt))))&&((this.gnx == rhs.gnx)||((this.gnx!= null)&&this.gnx.equals(rhs.gnx))))&&((this.rdc == rhs.rdc)||((this.rdc!= null)&&this.rdc.equals(rhs.rdc))))&&((this.abt == rhs.abt)||((this.abt!= null)&&this.abt.equals(rhs.abt))))&&((this.r == rhs.r)||((this.r!= null)&&this.r.equals(rhs.r))))&&((this.mdcl == rhs.mdcl)||((this.mdcl!= null)&&this.mdcl.equals(rhs.mdcl))))&&((this.rdd == rhs.rdd)||((this.rdd!= null)&&this.rdd.equals(rhs.rdd))))&&((this.seth == rhs.seth)||((this.seth!= null)&&this.seth.equals(rhs.seth))))&&((this.xdce == rhs.xdce)||((this.xdce!= null)&&this.xdce.equals(rhs.xdce))))&&((this.kwh == rhs.kwh)||((this.kwh!= null)&&this.kwh.equals(rhs.kwh))))&&((this.thr == rhs.thr)||((this.thr!= null)&&this.thr.equals(rhs.thr))))&&((this.ace == rhs.ace)||((this.ace!= null)&&this.ace.equals(rhs.ace))))&&((this.eko == rhs.eko)||((this.eko!= null)&&this.eko.equals(rhs.eko))))&&((this.isr == rhs.isr)||((this.isr!= null)&&this.isr.equals(rhs.isr))))&&((this.good == rhs.good)||((this.good!= null)&&this.good.equals(rhs.good))))&&((this.ekt == rhs.ekt)||((this.ekt!= null)&&this.ekt.equals(rhs.ekt))))&&((this.emph == rhs.emph)||((this.emph!= null)&&this.emph.equals(rhs.emph))))&&((this.vme == rhs.vme)||((this.vme!= null)&&this.vme.equals(rhs.vme))))&&((this.wish == rhs.wish)||((this.wish!= null)&&this.wish.equals(rhs.wish))))&&((this.tie == rhs.tie)||((this.tie!= null)&&this.tie.equals(rhs.tie))))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))))&&((this.tig == rhs.tig)||((this.tig!= null)&&this.tig.equals(rhs.tig))))&&((this.utnp == rhs.utnp)||((this.utnp!= null)&&this.utnp.equals(rhs.utnp))))&&((this.itc == rhs.itc)||((this.itc!= null)&&this.itc.equals(rhs.itc))))&&((this.pal == rhs.pal)||((this.pal!= null)&&this.pal.equals(rhs.pal))))&&((this.rem == rhs.rem)||((this.rem!= null)&&this.rem.equals(rhs.rem))))&&((this.rep == rhs.rep)||((this.rep!= null)&&this.rep.equals(rhs.rep))))&&((this.adb == rhs.adb)||((this.adb!= null)&&this.adb.equals(rhs.adb))))&&((this.elf == rhs.elf)||((this.elf!= null)&&this.elf.equals(rhs.elf))))&&((this.ada == rhs.ada)||((this.ada!= null)&&this.ada.equals(rhs.ada))))&&((this.req == rhs.req)||((this.req!= null)&&this.req.equals(rhs.req))))&&((this.itl == rhs.itl)||((this.itl!= null)&&this.itl.equals(rhs.itl))))&&((this.pat == rhs.pat)||((this.pat!= null)&&this.pat.equals(rhs.pat))))&&((this.tix == rhs.tix)||((this.tix!= null)&&this.tix.equals(rhs.tix))))&&((this.eli == rhs.eli)||((this.eli!= null)&&this.eli.equals(rhs.eli))))&&((this.adh == rhs.adh)||((this.adh!= null)&&this.adh.equals(rhs.adh))))&&((this.rex == rhs.rex)||((this.rex!= null)&&this.rex.equals(rhs.rex))))&&((this.tusd == rhs.tusd)||((this.tusd!= null)&&this.tusd.equals(rhs.tusd))))&&((this.ceek == rhs.ceek)||((this.ceek!= null)&&this.ceek.equals(rhs.ceek))))&&((this.pax == rhs.pax)||((this.pax!= null)&&this.pax.equals(rhs.pax))))&&((this.wabi == rhs.wabi)||((this.wabi!= null)&&this.wabi.equals(rhs.wabi))))&&((this.adi == rhs.adi)||((this.adi!= null)&&this.adi.equals(rhs.adi))))&&((this.adl == rhs.adl)||((this.adl!= null)&&this.adl.equals(rhs.adl))))&&((this.itt == rhs.itt)||((this.itt!= null)&&this.itt.equals(rhs.itt))))&&((this.pay == rhs.pay)||((this.pay!= null)&&this.pay.equals(rhs.pay))))&&((this.chp == rhs.chp)||((this.chp!= null)&&this.chp.equals(rhs.chp))))&&((this.egcc == rhs.egcc)||((this.egcc!= null)&&this.egcc.equals(rhs.egcc))))&&((this.cht == rhs.cht)||((this.cht!= null)&&this.cht.equals(rhs.cht))))&&((this.adt == rhs.adt)||((this.adt!= null)&&this.adt.equals(rhs.adt))))&&((this.chx == rhs.chx)||((this.chx!= null)&&this.chx.equals(rhs.chx))))&&((this.ely == rhs.ely)||((this.ely!= null)&&this.ely.equals(rhs.ely))))&&((this.adx == rhs.adx)||((this.adx!= null)&&this.adx.equals(rhs.adx))))&&((this.pmnt == rhs.pmnt)||((this.pmnt!= null)&&this.pmnt.equals(rhs.pmnt))))&&((this.rfr == rhs.rfr)||((this.rfr!= null)&&this.rfr.equals(rhs.rfr))))&&((this.scrl == rhs.scrl)||((this.scrl!= null)&&this.scrl.equals(rhs.scrl))))&&((this.vnx == rhs.vnx)||((this.vnx!= null)&&this.vnx.equals(rhs.vnx))))&&((this.aen == rhs.aen)||((this.aen!= null)&&this.aen.equals(rhs.aen))))&&((this.pch == rhs.pch)||((this.pch!= null)&&this.pch.equals(rhs.pch))))&&((this.tkn == rhs.tkn)||((this.tkn!= null)&&this.tkn.equals(rhs.tkn))))&&((this.pcl == rhs.pcl)||((this.pcl!= null)&&this.pcl.equals(rhs.pcl))))&&((this.lend == rhs.lend)||((this.lend!= null)&&this.lend.equals(rhs.lend))))&&((this.pco == rhs.pco)||((this.pco!= null)&&this.pco.equals(rhs.pco))))&&((this.enj == rhs.enj)||((this.enj!= null)&&this.enj.equals(rhs.enj))))&&((this.zxc == rhs.zxc)||((this.zxc!= null)&&this.zxc.equals(rhs.zxc))))&&((this.cjt == rhs.cjt)||((this.cjt!= null)&&this.cjt.equals(rhs.cjt))))&&((this.grx == rhs.grx)||((this.grx!= null)&&this.grx.equals(rhs.grx))))&&((this.ivy == rhs.ivy)||((this.ivy!= null)&&this.ivy.equals(rhs.ivy))))&&((this.gsc == rhs.gsc)||((this.gsc!= null)&&this.gsc.equals(rhs.gsc))))&&((this.snip == rhs.snip)||((this.snip!= null)&&this.snip.equals(rhs.snip))))&&((this.ethos == rhs.ethos)||((this.ethos!= null)&&this.ethos.equals(rhs.ethos))))&&((this.well == rhs.well)||((this.well!= null)&&this.well.equals(rhs.well))))&&((this.cccx == rhs.cccx)||((this.cccx!= null)&&this.cccx.equals(rhs.cccx))))&&((this.agi == rhs.agi)||((this.agi!= null)&&this.agi.equals(rhs.agi))))&&((this.fntb == rhs.fntb)||((this.fntb!= null)&&this.fntb.equals(rhs.fntb))))&&((this.xuc == rhs.xuc)||((this.xuc!= null)&&this.xuc.equals(rhs.xuc))))&&((this.gst == rhs.gst)||((this.gst!= null)&&this.gst.equals(rhs.gst))))&&((this.crds == rhs.crds)||((this.crds!= null)&&this.crds.equals(rhs.crds))))&&((this.gtc == rhs.gtc)||((this.gtc!= null)&&this.gtc.equals(rhs.gtc))))&&((this.tmt == rhs.tmt)||((this.tmt!= null)&&this.tmt.equals(rhs.tmt))))&&((this.flot == rhs.flot)||((this.flot!= null)&&this.flot.equals(rhs.flot))))&&((this.nas == rhs.nas)||((this.nas!= null)&&this.nas.equals(rhs.nas))))&&((this.atmi == rhs.atmi)||((this.atmi!= null)&&this.atmi.equals(rhs.atmi))))&&((this.gto == rhs.gto)||((this.gto!= null)&&this.gto.equals(rhs.gto))))&&((this.cln == rhs.cln)||((this.cln!= null)&&this.cln.equals(rhs.cln))))&&((this.ixt == rhs.ixt)||((this.ixt!= null)&&this.ixt.equals(rhs.ixt))))&&((this.vra == rhs.vra)||((this.vra!= null)&&this.vra.equals(rhs.vra))))&&((this.tnb == rhs.tnb)||((this.tnb!= null)&&this.tnb.equals(rhs.tnb))))&&((this.nbc == rhs.nbc)||((this.nbc!= null)&&this.nbc.equals(rhs.nbc))))&&((this.powr == rhs.powr)||((this.powr!= null)&&this.powr.equals(rhs.powr))))&&((this.vrs == rhs.vrs)||((this.vrs!= null)&&this.vrs.equals(rhs.vrs))))&&((this.tnt == rhs.tnt)||((this.tnt!= null)&&this.tnt.equals(rhs.tnt))))&&((this.aid == rhs.aid)||((this.aid!= null)&&this.aid.equals(rhs.aid))))&&((this.pfr == rhs.pfr)||((this.pfr!= null)&&this.pfr.equals(rhs.pfr))))&&((this.myst == rhs.myst)||((this.myst!= null)&&this.myst.equals(rhs.myst))))&&((this.eved == rhs.eved)||((this.eved!= null)&&this.eved.equals(rhs.eved))))&&((this.gup == rhs.gup)||((this.gup!= null)&&this.gup.equals(rhs.gup))))&&((this.celr == rhs.celr)||((this.celr!= null)&&this.celr.equals(rhs.celr))))&&((this.cms == rhs.cms)||((this.cms!= null)&&this.cms.equals(rhs.cms))))&&((this.cmt == rhs.cmt)||((this.cmt!= null)&&this.cmt.equals(rhs.cmt))))&&((this.cpay == rhs.cpay)||((this.cpay!= null)&&this.cpay.equals(rhs.cpay))))&&((this.ait == rhs.ait)||((this.ait!= null)&&this.ait.equals(rhs.ait))))&&((this.vsl == rhs.vsl)||((this.vsl!= null)&&this.vsl.equals(rhs.vsl))))&&((this.ncc == rhs.ncc)||((this.ncc!= null)&&this.ncc.equals(rhs.ncc))))&&((this.aix == rhs.aix)||((this.aix!= null)&&this.aix.equals(rhs.aix))))&&((this.gve == rhs.gve)||((this.gve!= null)&&this.gve.equals(rhs.gve))))&&((this.cnd == rhs.cnd)||((this.cnd!= null)&&this.cnd.equals(rhs.cnd))))&&((this.nct == rhs.nct)||((this.nct!= null)&&this.nct.equals(rhs.nct))))&&((this.cred == rhs.cred)||((this.cred!= null)&&this.cred.equals(rhs.cred))))&&((this.idxm == rhs.idxm)||((this.idxm!= null)&&this.idxm.equals(rhs.idxm))))&&((this.cnn == rhs.cnn)||((this.cnn!= null)&&this.cnn.equals(rhs.cnn))))&&((this.ero == rhs.ero)||((this.ero!= null)&&this.ero.equals(rhs.ero))))&&((this.gvt == rhs.gvt)||((this.gvt!= null)&&this.gvt.equals(rhs.gvt))))&&((this.rlc == rhs.rlc)||((this.rlc!= null)&&this.rlc.equals(rhs.rlc))))&&((this.qntu == rhs.qntu)||((this.qntu!= null)&&this.qntu.equals(rhs.qntu))))&&((this.tomo == rhs.tomo)||((this.tomo!= null)&&this.tomo.equals(rhs.tomo))))&&((this.btcred == rhs.btcred)||((this.btcred!= null)&&this.btcred.equals(rhs.btcred))))&&((this.cnx == rhs.cnx)||((this.cnx!= null)&&this.cnx.equals(rhs.cnx))))&&((this.etbs == rhs.etbs)||((this.etbs!= null)&&this.etbs.equals(rhs.etbs))))&&((this.phi == rhs.phi)||((this.phi!= null)&&this.phi.equals(rhs.phi))))&&((this.cob == rhs.cob)||((this.cob!= null)&&this.cob.equals(rhs.cob))))&&((this.moac == rhs.moac)||((this.moac!= null)&&this.moac.equals(rhs.moac))))&&((this.sngls == rhs.sngls)||((this.sngls!= null)&&this.sngls.equals(rhs.sngls))))&&((this.agvc == rhs.agvc)||((this.agvc!= null)&&this.agvc.equals(rhs.agvc))))&&((this.rlx == rhs.rlx)||((this.rlx!= null)&&this.rlx.equals(rhs.rlx))))&&((this.dbet == rhs.dbet)||((this.dbet!= null)&&this.dbet.equals(rhs.dbet))))&&((this.ess == rhs.ess)||((this.ess!= null)&&this.ess.equals(rhs.ess))))&&((this.fuel == rhs.fuel)||((this.fuel!= null)&&this.fuel.equals(rhs.fuel))))&&((this.est == rhs.est)||((this.est!= null)&&this.est.equals(rhs.est))))&&((this.instar == rhs.instar)||((this.instar!= null)&&this.instar.equals(rhs.instar))))&&((this.cou == rhs.cou)||((this.cou!= null)&&this.cou.equals(rhs.cou))))&&((this.rebl == rhs.rebl)||((this.rebl!= null)&&this.rebl.equals(rhs.rebl))))&&((this.cot == rhs.cot)||((this.cot!= null)&&this.cot.equals(rhs.cot))))&&((this.cov == rhs.cov)||((this.cov!= null)&&this.cov.equals(rhs.cov))))&&((this.esz == rhs.esz)||((this.esz!= null)&&this.esz.equals(rhs.esz))))&&((this.nec == rhs.nec)||((this.nec!= null)&&this.nec.equals(rhs.nec))))&&((this.xyo == rhs.xyo)||((this.xyo!= null)&&this.xyo.equals(rhs.xyo))))&&((this.etc == rhs.etc)||((this.etc!= null)&&this.etc.equals(rhs.etc))))&&((this.eth == rhs.eth)||((this.eth!= null)&&this.eth.equals(rhs.eth))))&&((this.lala == rhs.lala)||((this.lala!= null)&&this.lala.equals(rhs.lala))))&&((this.topc == rhs.topc)||((this.topc!= null)&&this.topc.equals(rhs.topc))))&&((this.etg == rhs.etg)||((this.etg!= null)&&this.etg.equals(rhs.etg))))&&((this.etk == rhs.etk)||((this.etk!= null)&&this.etk.equals(rhs.etk))))&&((this.etn == rhs.etn)||((this.etn!= null)&&this.etn.equals(rhs.etn))))&&((this.pix == rhs.pix)||((this.pix!= null)&&this.pix.equals(rhs.pix))))&&((this.neu == rhs.neu)||((this.neu!= null)&&this.neu.equals(rhs.neu))))&&((this.xzc == rhs.xzc)||((this.xzc!= null)&&this.xzc.equals(rhs.xzc))))&&((this.cpt == rhs.cpt)||((this.cpt!= null)&&this.cpt.equals(rhs.cpt))))&&((this.real == rhs.real)||((this.real!= null)&&this.real.equals(rhs.real))))&&((this.alx == rhs.alx)||((this.alx!= null)&&this.alx.equals(rhs.alx))))&&((this.cpy == rhs.cpy)||((this.cpy!= null)&&this.cpy.equals(rhs.cpy))))&&((this.apis == rhs.apis)||((this.apis!= null)&&this.apis.equals(rhs.apis))))&&((this.amb == rhs.amb)||((this.amb!= null)&&this.amb.equals(rhs.amb))))&&((this.exmr == rhs.exmr)||((this.exmr!= null)&&this.exmr.equals(rhs.exmr))))&&((this.snov == rhs.snov)||((this.snov!= null)&&this.snov.equals(rhs.snov))))&&((this.rnt == rhs.rnt)||((this.rnt!= null)&&this.rnt.equals(rhs.rnt))))&&((this.x8x == rhs.x8x)||((this.x8x!= null)&&this.x8x.equals(rhs.x8x))))&&((this.snpc == rhs.snpc)||((this.snpc!= null)&&this.snpc.equals(rhs.snpc))))&&((this.cpch == rhs.cpch)||((this.cpch!= null)&&this.cpch.equals(rhs.cpch))))&&((this.amm == rhs.amm)||((this.amm!= null)&&this.amm.equals(rhs.amm))))&&((this.amo == rhs.amo)||((this.amo!= null)&&this.amo.equals(rhs.amo))))&&((this.amn == rhs.amn)||((this.amn!= null)&&this.amn.equals(rhs.amn))))&&((this.ngc == rhs.ngc)||((this.ngc!= null)&&this.ngc.equals(rhs.ngc))))&&((this.tsl == rhs.tsl)||((this.tsl!= null)&&this.tsl.equals(rhs.tsl))))&&((this.crb == rhs.crb)||((this.crb!= null)&&this.crb.equals(rhs.crb))))&&((this.evc == rhs.evc)||((this.evc!= null)&&this.evc.equals(rhs.evc))))&&((this.eve == rhs.eve)||((this.eve!= null)&&this.eve.equals(rhs.eve))))&&((this.cedex == rhs.cedex)||((this.cedex!= null)&&this.cedex.equals(rhs.cedex))))&&((this.pkt == rhs.pkt)||((this.pkt!= null)&&this.pkt.equals(rhs.pkt))))&&((this.rox == rhs.rox)||((this.rox!= null)&&this.rox.equals(rhs.rox))))&&((this.ethm == rhs.ethm)||((this.ethm!= null)&&this.ethm.equals(rhs.ethm))))&&((this.fluz == rhs.fluz)||((this.fluz!= null)&&this.fluz.equals(rhs.fluz))))&&((this.nper == rhs.nper)||((this.nper!= null)&&this.nper.equals(rhs.nper))))&&((this.lcs == rhs.lcs)||((this.lcs!= null)&&this.lcs.equals(rhs.lcs))))&&((this.c20 == rhs.c20)||((this.c20 != null)&&this.c20 .equals(rhs.c20))))&&((this.evr == rhs.evr)||((this.evr!= null)&&this.evr.equals(rhs.evr))))&&((this.cro == rhs.cro)||((this.cro!= null)&&this.cro.equals(rhs.cro))))&&((this.ttc == rhs.ttc)||((this.ttc!= null)&&this.ttc.equals(rhs.ttc))))&&((this.pla == rhs.pla)||((this.pla!= null)&&this.pla.equals(rhs.pla))))&&((this.ant == rhs.ant)||((this.ant!= null)&&this.ant.equals(rhs.ant))))&&((this.evx == rhs.evx)||((this.evx!= null)&&this.evx.equals(rhs.evx))))&&((this.ldc == rhs.ldc)||((this.ldc!= null)&&this.ldc.equals(rhs.ldc))))&&((this.aoa == rhs.aoa)||((this.aoa!= null)&&this.aoa.equals(rhs.aoa))))&&((this.weth == rhs.weth)||((this.weth!= null)&&this.weth.equals(rhs.weth))))&&((this.etgp == rhs.etgp)||((this.etgp!= null)&&this.etgp.equals(rhs.etgp))))&&((this.plr == rhs.plr)||((this.plr!= null)&&this.plr.equals(rhs.plr))))&&((this.ttv == rhs.ttv)||((this.ttv!= null)&&this.ttv.equals(rhs.ttv))))&&((this.lamb == rhs.lamb)||((this.lamb!= null)&&this.lamb.equals(rhs.lamb))))&&((this.plu == rhs.plu)||((this.plu!= null)&&this.plu.equals(rhs.plu))))&&((this.csm == rhs.csm)||((this.csm!= null)&&this.csm.equals(rhs.csm))))&&((this.exrn == rhs.exrn)||((this.exrn!= null)&&this.exrn.equals(rhs.exrn))))&&((this.csp == rhs.csp)||((this.csp!= null)&&this.csp.equals(rhs.csp))))&&((this.vibe == rhs.vibe)||((this.vibe!= null)&&this.vibe.equals(rhs.vibe))))&&((this.echt == rhs.echt)||((this.echt!= null)&&this.echt.equals(rhs.echt))))&&((this.pma == rhs.pma)||((this.pma!= null)&&this.pma.equals(rhs.pma))))&&((this.ship == rhs.ship)||((this.ship!= null)&&this.ship.equals(rhs.ship))))&&((this.exc == rhs.exc)||((this.exc!= null)&&this.exc.equals(rhs.exc))))&&((this.nio == rhs.nio)||((this.nio!= null)&&this.nio.equals(rhs.nio))))&&((this.iotx == rhs.iotx)||((this.iotx!= null)&&this.iotx.equals(rhs.iotx))))&&((this.dock == rhs.dock)||((this.dock!= null)&&this.dock.equals(rhs.dock))))&&((this.lev == rhs.lev)||((this.lev!= null)&&this.lev.equals(rhs.lev))))&&((this.rrc == rhs.rrc)||((this.rrc!= null)&&this.rrc.equals(rhs.rrc))))&&((this.exy == rhs.exy)||((this.exy!= null)&&this.exy.equals(rhs.exy))))&&((this.sntr == rhs.sntr)||((this.sntr!= null)&&this.sntr.equals(rhs.sntr))))&&((this.vzt == rhs.vzt)||((this.vzt!= null)&&this.vzt.equals(rhs.vzt))))&&((this.iost == rhs.iost)||((this.iost!= null)&&this.iost.equals(rhs.iost))))&&((this.pnt == rhs.pnt)||((this.pnt!= null)&&this.pnt.equals(rhs.pnt))))&&((this.wand == rhs.wand)||((this.wand!= null)&&this.wand.equals(rhs.wand))))&&((this.poe == rhs.poe)||((this.poe!= null)&&this.poe.equals(rhs.poe))))&&((this.appc == rhs.appc)||((this.appc!= null)&&this.appc.equals(rhs.appc))))&&((this.cvc == rhs.cvc)||((this.cvc!= null)&&this.cvc.equals(rhs.cvc))))&&((this.lgo == rhs.lgo)||((this.lgo!= null)&&this.lgo.equals(rhs.lgo))))&&((this.arn == rhs.arn)||((this.arn!= null)&&this.arn.equals(rhs.arn))))&&((this.cvt == rhs.cvt)||((this.cvt!= null)&&this.cvt.equals(rhs.cvt))))&&((this.art == rhs.art)||((this.art!= null)&&this.art.equals(rhs.art))))&&((this.rte == rhs.rte)||((this.rte!= null)&&this.rte.equals(rhs.rte))))&&((this.ary == rhs.ary)||((this.ary!= null)&&this.ary.equals(rhs.ary))))&&((this.ppp == rhs.ppp)||((this.ppp!= null)&&this.ppp.equals(rhs.ppp))))&&((this.kick == rhs.kick)||((this.kick!= null)&&this.kick.equals(rhs.kick))))&&((this.ppt == rhs.ppt)||((this.ppt!= null)&&this.ppt.equals(rhs.ppt))))&&((this.ankr == rhs.ankr)||((this.ankr!= null)&&this.ankr.equals(rhs.ankr))))&&((this.ast == rhs.ast)||((this.ast!= null)&&this.ast.equals(rhs.ast))))&&((this.foam == rhs.foam)||((this.foam!= null)&&this.foam.equals(rhs.foam))))&&((this.prix == rhs.prix)||((this.prix!= null)&&this.prix.equals(rhs.prix))))&&((this.doge == rhs.doge)||((this.doge!= null)&&this.doge.equals(rhs.doge))))&&((this.lif == rhs.lif)||((this.lif!= null)&&this.lif.equals(rhs.lif))))&&((this.latx == rhs.latx)||((this.latx!= null)&&this.latx.equals(rhs.latx))))&&((this.molk == rhs.molk)||((this.molk!= null)&&this.molk.equals(rhs.molk))))&&((this.nmr == rhs.nmr)||((this.nmr!= null)&&this.nmr.equals(rhs.nmr))))&&((this.atl == rhs.atl)||((this.atl!= null)&&this.atl.equals(rhs.atl))))&&((this.jet == rhs.jet)||((this.jet!= null)&&this.jet.equals(rhs.jet))))&&((this.tmtg == rhs.tmtg)||((this.tmtg!= null)&&this.tmtg.equals(rhs.tmtg))))&&((this.atm == rhs.atm)||((this.atm!= null)&&this.atm.equals(rhs.atm))))&&((this.cxo == rhs.cxo)||((this.cxo!= null)&&this.cxo.equals(rhs.cxo))))&&((this.nanj == rhs.nanj)||((this.nanj!= null)&&this.nanj.equals(rhs.nanj))))&&((this.crpt == rhs.crpt)||((this.crpt!= null)&&this.crpt.equals(rhs.crpt))))&&((this.ncash == rhs.ncash)||((this.ncash!= null)&&this.ncash.equals(rhs.ncash))))&&((this.pra == rhs.pra)||((this.pra!= null)&&this.pra.equals(rhs.pra))))&&((this.ats == rhs.ats)||((this.ats!= null)&&this.ats.equals(rhs.ats))))&&((this.prg == rhs.prg)||((this.prg!= null)&&this.prg.equals(rhs.prg))))&&((this.bstn == rhs.bstn)||((this.bstn!= null)&&this.bstn.equals(rhs.bstn))))&&((this.carat == rhs.carat)||((this.carat!= null)&&this.carat.equals(rhs.carat))))&&((this.pro == rhs.pro)||((this.pro!= null)&&this.pro.equals(rhs.pro))))&&((this.auc == rhs.auc)||((this.auc!= null)&&this.auc.equals(rhs.auc))))&&((this.rvt == rhs.rvt)||((this.rvt!= null)&&this.rvt.equals(rhs.rvt))))&&((this.vidt == rhs.vidt)||((this.vidt!= null)&&this.vidt.equals(rhs.vidt))))&&((this.alis == rhs.alis)||((this.alis!= null)&&this.alis.equals(rhs.alis))))&&((this.eris == rhs.eris)||((this.eris!= null)&&this.eris.equals(rhs.eris))))&&((this.bolt == rhs.bolt)||((this.bolt!= null)&&this.bolt.equals(rhs.bolt))))&&((this.hbt == rhs.hbt)||((this.hbt!= null)&&this.hbt.equals(rhs.hbt))))&&((this.ccrb == rhs.ccrb)||((this.ccrb!= null)&&this.ccrb.equals(rhs.ccrb))))&&((this.next == rhs.next)||((this.next!= null)&&this.next.equals(rhs.next))))&&((this.hbz == rhs.hbz)||((this.hbz!= null)&&this.hbz.equals(rhs.hbz))))&&((this.qbit == rhs.qbit)||((this.qbit!= null)&&this.qbit.equals(rhs.qbit))))&&((this.show == rhs.show)||((this.show!= null)&&this.show.equals(rhs.show))))&&((this.psm == rhs.psm)||((this.psm!= null)&&this.psm.equals(rhs.psm))))&&((this.pst == rhs.pst)||((this.pst!= null)&&this.pst.equals(rhs.pst))))&&((this.dfxt == rhs.dfxt)||((this.dfxt!= null)&&this.dfxt.equals(rhs.dfxt))))&&((this.avh == rhs.avh)||((this.avh!= null)&&this.avh.equals(rhs.avh))))&&((this.ecom == rhs.ecom)||((this.ecom!= null)&&this.ecom.equals(rhs.ecom))))&&((this.nox == rhs.nox)||((this.nox!= null)&&this.nox.equals(rhs.nox))))&&((this.yee == rhs.yee)||((this.yee!= null)&&this.yee.equals(rhs.yee))))&&((this.wab == rhs.wab)||((this.wab!= null)&&this.wab.equals(rhs.wab))))&&((this.ptoy == rhs.ptoy)||((this.ptoy!= null)&&this.ptoy.equals(rhs.ptoy))))&&((this.nexo == rhs.nexo)||((this.nexo!= null)&&this.nexo.equals(rhs.nexo))))&&((this.avt == rhs.avt)||((this.avt!= null)&&this.avt.equals(rhs.avt))))&&((this.wan == rhs.wan)||((this.wan!= null)&&this.wan.equals(rhs.wan))))&&((this.mbtx == rhs.mbtx)||((this.mbtx!= null)&&this.mbtx.equals(rhs.mbtx))))&&((this.pylnt == rhs.pylnt)||((this.pylnt!= null)&&this.pylnt.equals(rhs.pylnt))))&&((this.awc == rhs.awc)||((this.awc!= null)&&this.awc.equals(rhs.awc))))&&((this.wax == rhs.wax)||((this.wax!= null)&&this.wax.equals(rhs.wax))))&&((this.capp == rhs.capp)||((this.capp!= null)&&this.capp.equals(rhs.capp))))&&((this.equal == rhs.equal)||((this.equal!= null)&&this.equal.equals(rhs.equal))))&&((this._0xbtc == rhs._0xbtc)||((this._0xbtc!= null)&&this._0xbtc.equals(rhs._0xbtc))))&&((this.npx == rhs.npx)||((this.npx!= null)&&this.npx.equals(rhs.npx))))&&((this.swftc == rhs.swftc)||((this.swftc!= null)&&this.swftc.equals(rhs.swftc))))&&((this.stash == rhs.stash)||((this.stash!= null)&&this.stash.equals(rhs.stash))))&&((this.play == rhs.play)||((this.play!= null)&&this.play.equals(rhs.play))))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this.gens == rhs.gens)||((this.gens!= null)&&this.gens.equals(rhs.gens))))&&((this.her == rhs.her)||((this.her!= null)&&this.her.equals(rhs.her))))&&((this.trac == rhs.trac)||((this.trac!= null)&&this.trac.equals(rhs.trac))))&&((this.fat == rhs.fat)||((this.fat!= null)&&this.fat.equals(rhs.fat))))&&((this.enter == rhs.enter)||((this.enter!= null)&&this.enter.equals(rhs.enter))))&&((this._true == rhs._true)||((this._true!= null)&&this._true.equals(rhs._true))))&&((this.trak == rhs.trak)||((this.trak!= null)&&this.trak.equals(rhs.trak))))&&((this.lnc == rhs.lnc)||((this.lnc!= null)&&this.lnc.equals(rhs.lnc))))&&((this.mxai == rhs.mxai)||((this.mxai!= null)&&this.mxai.equals(rhs.mxai))))&&((this.nrg == rhs.nrg)||((this.nrg!= null)&&this.nrg.equals(rhs.nrg))))&&((this.lnd == rhs.lnd)||((this.lnd!= null)&&this.lnd.equals(rhs.lnd))))&&((this.gene == rhs.gene)||((this.gene!= null)&&this.gene.equals(rhs.gene))))&&((this.rmesh == rhs.rmesh)||((this.rmesh!= null)&&this.rmesh.equals(rhs.rmesh))))&&((this.tiox == rhs.tiox)||((this.tiox!= null)&&this.tiox.equals(rhs.tiox))))&&((this.nrp == rhs.nrp)||((this.nrp!= null)&&this.nrp.equals(rhs.nrp))))&&((this.ctxc == rhs.ctxc)||((this.ctxc!= null)&&this.ctxc.equals(rhs.ctxc))))&&((this.bqtx == rhs.bqtx)||((this.bqtx!= null)&&this.bqtx.equals(rhs.bqtx))))&&((this.card == rhs.card)||((this.card!= null)&&this.card.equals(rhs.card))))&&((this.qusd == rhs.qusd)||((this.qusd!= null)&&this.qusd.equals(rhs.qusd))))&&((this.riya == rhs.riya)||((this.riya!= null)&&this.riya.equals(rhs.riya))))&&((this.elite == rhs.elite)||((this.elite!= null)&&this.elite.equals(rhs.elite))))&&((this.hgt == rhs.hgt)||((this.hgt!= null)&&this.hgt.equals(rhs.hgt))))&&((this.web == rhs.web)||((this.web!= null)&&this.web.equals(rhs.web))))&&((this.trct == rhs.trct)||((this.trct!= null)&&this.trct.equals(rhs.trct))))&&((this.pxg == rhs.pxg)||((this.pxg!= null)&&this.pxg.equals(rhs.pxg))))&&((this.ntk == rhs.ntk)||((this.ntk!= null)&&this.ntk.equals(rhs.ntk))))&&((this.taas == rhs.taas)||((this.taas!= null)&&this.taas.equals(rhs.taas))))&&((this.lpt == rhs.lpt)||((this.lpt!= null)&&this.lpt.equals(rhs.lpt))))&&((this.flixx == rhs.flixx)||((this.flixx!= null)&&this.flixx.equals(rhs.flixx))))&&((this.chat == rhs.chat)||((this.chat!= null)&&this.chat.equals(rhs.chat))))&&((this.eosdac == rhs.eosdac)||((this.eosdac!= null)&&this.eosdac.equals(rhs.eosdac))))&&((this.grid == rhs.grid)||((this.grid!= null)&&this.grid.equals(rhs.grid))))&&((this.ubc == rhs.ubc)||((this.ubc!= null)&&this.ubc.equals(rhs.ubc))))&&((this.engt == rhs.engt)||((this.engt!= null)&&this.engt.equals(rhs.engt))))&&((this.plbt == rhs.plbt)||((this.plbt!= null)&&this.plbt.equals(rhs.plbt))))&&((this.fdx == rhs.fdx)||((this.fdx!= null)&&this.fdx.equals(rhs.fdx))))&&((this.fdz == rhs.fdz)||((this.fdz!= null)&&this.fdz.equals(rhs.fdz))))&&((this.fundz == rhs.fundz)||((this.fundz!= null)&&this.fundz.equals(rhs.fundz))))&&((this.pyn == rhs.pyn)||((this.pyn!= null)&&this.pyn.equals(rhs.pyn))))&&((this.ubt == rhs.ubt)||((this.ubt!= null)&&this.ubt.equals(rhs.ubt))))&&((this.dice == rhs.dice)||((this.dice!= null)&&this.dice.equals(rhs.dice))))&&((this.dag == rhs.dag)||((this.dag!= null)&&this.dag.equals(rhs.dag))))&&((this.dooh == rhs.dooh)||((this.dooh!= null)&&this.dooh.equals(rhs.dooh))))&&((this.dai == rhs.dai)||((this.dai!= null)&&this.dai.equals(rhs.dai))))&&((this.dan == rhs.dan)||((this.dan!= null)&&this.dan.equals(rhs.dan))))&&((this.hit == rhs.hit)||((this.hit!= null)&&this.hit.equals(rhs.hit))))&&((this.fet == rhs.fet)||((this.fet!= null)&&this.fet.equals(rhs.fet))))&&((this.navi == rhs.navi)||((this.navi!= null)&&this.navi.equals(rhs.navi))))&&((this.dat == rhs.dat)||((this.dat!= null)&&this.dat.equals(rhs.dat))))&&((this.yoyow == rhs.yoyow)||((this.yoyow!= null)&&this.yoyow.equals(rhs.yoyow))))&&((this.cryc == rhs.cryc)||((this.cryc!= null)&&this.cryc.equals(rhs.cryc))))&&((this.beat == rhs.beat)||((this.beat!= null)&&this.beat.equals(rhs.beat))))&&((this.dav == rhs.dav)||((this.dav!= null)&&this.dav.equals(rhs.dav))))&&((this.usdt == rhs.usdt)||((this.usdt!= null)&&this.usdt.equals(rhs.usdt))))&&((this.dax == rhs.dax)||((this.dax!= null)&&this.dax.equals(rhs.dax))))&&((this.ichx == rhs.ichx)||((this.ichx!= null)&&this.ichx.equals(rhs.ichx))))&&((this.usds == rhs.usds)||((this.usds!= null)&&this.usds.equals(rhs.usds))))&&((this.lrc == rhs.lrc)||((this.lrc!= null)&&this.lrc.equals(rhs.lrc))))&&((this.day == rhs.day)||((this.day!= null)&&this.day.equals(rhs.day))))&&((this.ecte == rhs.ecte)||((this.ecte!= null)&&this.ecte.equals(rhs.ecte))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.uct == rhs.uct)||((this.uct!= null)&&this.uct.equals(rhs.uct))))&&((this.elec == rhs.elec)||((this.elec!= null)&&this.elec.equals(rhs.elec))))&&((this.usdc == rhs.usdc)||((this.usdc!= null)&&this.usdc.equals(rhs.usdc))))&&((this.jnt == rhs.jnt)||((this.jnt!= null)&&this.jnt.equals(rhs.jnt))))&&((this.soar == rhs.soar)||((this.soar!= null)&&this.soar.equals(rhs.soar))))&&((this.trdt == rhs.trdt)||((this.trdt!= null)&&this.trdt.equals(rhs.trdt))))&&((this.hkn == rhs.hkn)||((this.hkn!= null)&&this.hkn.equals(rhs.hkn))))&&((this.lst == rhs.lst)||((this.lst!= null)&&this.lst.equals(rhs.lst))))&&((this.dcn == rhs.dcn)||((this.dcn!= null)&&this.dcn.equals(rhs.dcn))))&&((this.getx == rhs.getx)||((this.getx!= null)&&this.getx.equals(rhs.getx))))&&((this.nxc == rhs.nxc)||((this.nxc!= null)&&this.nxc.equals(rhs.nxc))))&&((this.ltc == rhs.ltc)||((this.ltc!= null)&&this.ltc.equals(rhs.ltc))))&&((this.gamb == rhs.gamb)||((this.gamb!= null)&&this.gamb.equals(rhs.gamb))))&&((this.sal == rhs.sal)||((this.sal!= null)&&this.sal.equals(rhs.sal))))&&((this.san == rhs.san)||((this.san!= null)&&this.san.equals(rhs.san))))&&((this.ddd == rhs.ddd)||((this.ddd!= null)&&this.ddd.equals(rhs.ddd))))&&((this.lto == rhs.lto)||((this.lto!= null)&&this.lto.equals(rhs.lto))))&&((this.sphtx == rhs.sphtx)||((this.sphtx!= null)&&this.sphtx.equals(rhs.sphtx))))&&((this.bzky == rhs.bzky)||((this.bzky!= null)&&this.bzky.equals(rhs.bzky))))&&((this.wiz == rhs.wiz)||((this.wiz!= null)&&this.wiz.equals(rhs.wiz))))&&((this.grmd == rhs.grmd)||((this.grmd!= null)&&this.grmd.equals(rhs.grmd))))&&((this.menlo == rhs.menlo)||((this.menlo!= null)&&this.menlo.equals(rhs.menlo))))&&((this.luc == rhs.luc)||((this.luc!= null)&&this.luc.equals(rhs.luc))))&&((this.hmc == rhs.hmc)||((this.hmc!= null)&&this.hmc.equals(rhs.hmc))))&&((this.deb == rhs.deb)||((this.deb!= null)&&this.deb.equals(rhs.deb))))&&((this.ufr == rhs.ufr)||((this.ufr!= null)&&this.ufr.equals(rhs.ufr))))&&((this.dec == rhs.dec)||((this.dec!= null)&&this.dec.equals(rhs.dec))))&&((this.lun == rhs.lun)||((this.lun!= null)&&this.lun.equals(rhs.lun))))&&((this.susd == rhs.susd)||((this.susd!= null)&&this.susd.equals(rhs.susd))))&&((this.hmq == rhs.hmq)||((this.hmq!= null)&&this.hmq.equals(rhs.hmq))))&&((this.npxs == rhs.npxs)||((this.npxs!= null)&&this.npxs.equals(rhs.npxs))))&&((this.ugc == rhs.ugc)||((this.ugc!= null)&&this.ugc.equals(rhs.ugc))))&&((this.btcm == rhs.btcm)||((this.btcm!= null)&&this.btcm.equals(rhs.btcm))))&&((this.scc == rhs.scc)||((this.scc!= null)&&this.scc.equals(rhs.scc))))&&((this.trio == rhs.trio)||((this.trio!= null)&&this.trio.equals(rhs.trio))))&&((this.bat == rhs.bat)||((this.bat!= null)&&this.bat.equals(rhs.bat))))&&((this.btcl == rhs.btcl)||((this.btcl!= null)&&this.btcl.equals(rhs.btcl))))&&((this.bax == rhs.bax)||((this.bax!= null)&&this.bax.equals(rhs.bax))))&&((this.stacs == rhs.stacs)||((this.stacs!= null)&&this.stacs.equals(rhs.stacs))))&&((this.cube == rhs.cube)||((this.cube!= null)&&this.cube.equals(rhs.cube))))&&((this.scl == rhs.scl)||((this.scl!= null)&&this.scl.equals(rhs.scl))))&&((this.bcap == rhs.bcap)||((this.bcap!= null)&&this.bcap.equals(rhs.bcap))))&&((this.medx == rhs.medx)||((this.medx!= null)&&this.medx.equals(rhs.medx))))&&((this.bbc == rhs.bbc)||((this.bbc!= null)&&this.bbc.equals(rhs.bbc))))&&((this.ae == rhs.ae)||((this.ae!= null)&&this.ae.equals(rhs.ae))))&&((this.pass == rhs.pass)||((this.pass!= null)&&this.pass.equals(rhs.pass))))&&((this.bbo == rhs.bbo)||((this.bbo!= null)&&this.bbo.equals(rhs.bbo))))&&((this.bznt == rhs.bznt)||((this.bznt!= null)&&this.bznt.equals(rhs.bznt))))&&((this.ubex == rhs.ubex)||((this.ubex!= null)&&this.ubex.equals(rhs.ubex))))&&((this.elix == rhs.elix)||((this.elix!= null)&&this.elix.equals(rhs.elix))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.jse == rhs.jse)||((this.jse!= null)&&this.jse.equals(rhs.jse))))&&((this.dgd == rhs.dgd)||((this.dgd!= null)&&this.dgd.equals(rhs.dgd))))&&((this.bch == rhs.bch)||((this.bch!= null)&&this.bch.equals(rhs.bch))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.bq == rhs.bq)||((this.bq!= null)&&this.bq.equals(rhs.bq))))&&((this.vite == rhs.vite)||((this.vite!= null)&&this.vite.equals(rhs.vite))))&&((this.dgx == rhs.dgx)||((this.dgx!= null)&&this.dgx.equals(rhs.dgx))))&&((this.matic == rhs.matic)||((this.matic!= null)&&this.matic.equals(rhs.matic))))&&((this.bz == rhs.bz)||((this.bz!= null)&&this.bz.equals(rhs.bz))))&&((this.hpb == rhs.hpb)||((this.hpb!= null)&&this.hpb.equals(rhs.hpb))))&&((this.bdg == rhs.bdg)||((this.bdg!= null)&&this.bdg.equals(rhs.bdg))))&&((this.cl == rhs.cl)||((this.cl!= null)&&this.cl.equals(rhs.cl))))&&((this.abcc == rhs.abcc)||((this.abcc!= null)&&this.abcc.equals(rhs.abcc))))&&((this.hpt == rhs.hpt)||((this.hpt!= null)&&this.hpt.equals(rhs.hpt))))&&((this.cv == rhs.cv)||((this.cv!= null)&&this.cv.equals(rhs.cv))))&&((this.lym == rhs.lym)||((this.lym!= null)&&this.lym.equals(rhs.lym))))&&((this.bee == rhs.bee)||((this.bee!= null)&&this.bee.equals(rhs.bee))))&&((this.dig == rhs.dig)||((this.dig!= null)&&this.dig.equals(rhs.dig))))&&((this.hqt == rhs.hqt)||((this.hqt!= null)&&this.hqt.equals(rhs.hqt))))&&((this.dio == rhs.dio)||((this.dio!= null)&&this.dio.equals(rhs.dio))))&&((this.hqx == rhs.hqx)||((this.hqx!= null)&&this.hqx.equals(rhs.hqx))))&&((this.ukg == rhs.ukg)||((this.ukg!= null)&&this.ukg.equals(rhs.ukg))))&&((this.bez == rhs.bez)||((this.bez!= null)&&this.bez.equals(rhs.bez))))&&((this.udoo == rhs.udoo)||((this.udoo!= null)&&this.udoo.equals(rhs.udoo))))&&((this.sgn == rhs.sgn)||((this.sgn!= null)&&this.sgn.equals(rhs.sgn))))&&((this.fnd == rhs.fnd)||((this.fnd!= null)&&this.fnd.equals(rhs.fnd))))&&((this.baas == rhs.baas)||((this.baas!= null)&&this.baas.equals(rhs.baas))))&&((this.sgr == rhs.sgr)||((this.sgr!= null)&&this.sgr.equals(rhs.sgr))))&&((this.ieth == rhs.ieth)||((this.ieth!= null)&&this.ieth.equals(rhs.ieth))))&&((this.bcdn == rhs.bcdn)||((this.bcdn!= null)&&this.bcdn.equals(rhs.bcdn))))&&((this.ecash == rhs.ecash)||((this.ecash!= null)&&this.ecash.equals(rhs.ecash))))&&((this.qcx == rhs.qcx)||((this.qcx!= null)&&this.qcx.equals(rhs.qcx))))&&((this.brat == rhs.brat)||((this.brat!= null)&&this.brat.equals(rhs.brat))))&&((this.bft == rhs.bft)||((this.bft!= null)&&this.bft.equals(rhs.bft))))&&((this.she == rhs.she)||((this.she!= null)&&this.she.equals(rhs.she))))&&((this.wpp == rhs.wpp)||((this.wpp!= null)&&this.wpp.equals(rhs.wpp))))&&((this.wpr == rhs.wpr)||((this.wpr!= null)&&this.wpr.equals(rhs.wpr))))&&((this.hsc == rhs.hsc)||((this.hsc!= null)&&this.hsc.equals(rhs.hsc))))&&((this.shp == rhs.shp)||((this.shp!= null)&&this.shp.equals(rhs.shp))))&&((this.gard == rhs.gard)||((this.gard!= null)&&this.gard.equals(rhs.gard))))&&((this.bcdt == rhs.bcdt)||((this.bcdt!= null)&&this.bcdt.equals(rhs.bcdt))))&&((this.bgg == rhs.bgg)||((this.bgg!= null)&&this.bgg.equals(rhs.bgg))))&&((this.soma == rhs.soma)||((this.soma!= null)&&this.soma.equals(rhs.soma))))&&((this.fota == rhs.fota)||((this.fota!= null)&&this.fota.equals(rhs.fota))))&&((this.hst == rhs.hst)||((this.hst!= null)&&this.hst.equals(rhs.hst))))&&((this.ft == rhs.ft)||((this.ft!= null)&&this.ft.equals(rhs.ft))))&&((this.yup == rhs.yup)||((this.yup!= null)&&this.yup.equals(rhs.yup))))&&((this.bela == rhs.bela)||((this.bela!= null)&&this.bela.equals(rhs.bela))))&&((this.oax == rhs.oax)||((this.oax!= null)&&this.oax.equals(rhs.oax))))&&((this.spank == rhs.spank)||((this.spank!= null)&&this.spank.equals(rhs.spank))))&&((this.wrc == rhs.wrc)||((this.wrc!= null)&&this.wrc.equals(rhs.wrc))))&&((this.dlt == rhs.dlt)||((this.dlt!= null)&&this.dlt.equals(rhs.dlt))))&&((this.nbai == rhs.nbai)||((this.nbai!= null)&&this.nbai.equals(rhs.nbai))))&&((this.tgame == rhs.tgame)||((this.tgame!= null)&&this.tgame.equals(rhs.tgame))))&&((this.hb == rhs.hb)||((this.hb!= null)&&this.hb.equals(rhs.hb))))&&((this.lqdn == rhs.lqdn)||((this.lqdn!= null)&&this.lqdn.equals(rhs.lqdn))))&&((this.dml == rhs.dml)||((this.dml!= null)&&this.dml.equals(rhs.dml))))&&((this.hur == rhs.hur)||((this.hur!= null)&&this.hur.equals(rhs.hur))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.dmt == rhs.dmt)||((this.dmt!= null)&&this.dmt.equals(rhs.dmt))))&&((this.eltcoin == rhs.eltcoin)||((this.eltcoin!= null)&&this.eltcoin.equals(rhs.eltcoin))))&&((this.ht == rhs.ht)||((this.ht!= null)&&this.ht.equals(rhs.ht))))&&((this.bix == rhs.bix)||((this.bix!= null)&&this.bix.equals(rhs.bix))))&&((this.veri == rhs.veri)||((this.veri!= null)&&this.veri.equals(rhs.veri))))&&((this.mitx == rhs.mitx)||((this.mitx!= null)&&this.mitx.equals(rhs.mitx))))&&((this.xpat == rhs.xpat)||((this.xpat!= null)&&this.xpat.equals(rhs.xpat))))&&((this.skm == rhs.skm)||((this.skm!= null)&&this.skm.equals(rhs.skm))))&&((this.dna == rhs.dna)||((this.dna!= null)&&this.dna.equals(rhs.dna))))&&((this.lock == rhs.lock)||((this.lock!= null)&&this.lock.equals(rhs.lock))))&&((this.loci == rhs.loci)||((this.loci!= null)&&this.loci.equals(rhs.loci))))&&((this.ocn == rhs.ocn)||((this.ocn!= null)&&this.ocn.equals(rhs.ocn))))&&((this.zinc == rhs.zinc)||((this.zinc!= null)&&this.zinc.equals(rhs.zinc))))&&((this.ig == rhs.ig)||((this.ig!= null)&&this.ig.equals(rhs.ig))))&&((this.hvn == rhs.hvn)||((this.hvn!= null)&&this.hvn.equals(rhs.hvn))))&&((this.mith == rhs.mith)||((this.mith!= null)&&this.mith.equals(rhs.mith))))&&((this.bitx == rhs.bitx)||((this.bitx!= null)&&this.bitx.equals(rhs.bitx))))&&((this.j8t == rhs.j8t)||((this.j8t!= null)&&this.j8t.equals(rhs.j8t))))&&((this.wtc == rhs.wtc)||((this.wtc!= null)&&this.wtc.equals(rhs.wtc))))&&((this.metal == rhs.metal)||((this.metal!= null)&&this.metal.equals(rhs.metal))))&&((this.dnt == rhs.dnt)||((this.dnt!= null)&&this.dnt.equals(rhs.dnt))))&&((this.wtl == rhs.wtl)||((this.wtl!= null)&&this.wtl.equals(rhs.wtl))))&&((this.ode == rhs.ode)||((this.ode!= null)&&this.ode.equals(rhs.ode))))&&((this.wcoin == rhs.wcoin)||((this.wcoin!= null)&&this.wcoin.equals(rhs.wcoin))))&&((this.upp == rhs.upp)||((this.upp!= null)&&this.upp.equals(rhs.upp))))&&((this.csen == rhs.csen)||((this.csen!= null)&&this.csen.equals(rhs.csen))))&&((this.jc == rhs.jc)||((this.jc!= null)&&this.jc.equals(rhs.jc))))&&((this.slt == rhs.slt)||((this.slt!= null)&&this.slt.equals(rhs.slt))))&&((this.banca == rhs.banca)||((this.banca!= null)&&this.banca.equals(rhs.banca))))&&((this.fsn == rhs.fsn)||((this.fsn!= null)&&this.fsn.equals(rhs.fsn))))&&((this.orbs == rhs.orbs)||((this.orbs!= null)&&this.orbs.equals(rhs.orbs))))&&((this.uqc == rhs.uqc)||((this.uqc!= null)&&this.uqc.equals(rhs.uqc))))&&((this.skin == rhs.skin)||((this.skin!= null)&&this.skin.equals(rhs.skin))))&&((this.credo == rhs.credo)||((this.credo!= null)&&this.credo.equals(rhs.credo))))&&((this.dov == rhs.dov)||((this.dov!= null)&&this.dov.equals(rhs.dov))))&&((this.zipt == rhs.zipt)||((this.zipt!= null)&&this.zipt.equals(rhs.zipt))))&&((this.dow == rhs.dow)||((this.dow!= null)&&this.dow.equals(rhs.dow))))&&((this.bkx == rhs.bkx)||((this.bkx!= null)&&this.bkx.equals(rhs.bkx))))&&((this.btmx == rhs.btmx)||((this.btmx!= null)&&this.btmx.equals(rhs.btmx))))&&((this.chsb == rhs.chsb)||((this.chsb!= null)&&this.chsb.equals(rhs.chsb))))&&((this.smt == rhs.smt)||((this.smt!= null)&&this.smt.equals(rhs.smt))))&&((this.abyss == rhs.abyss)||((this.abyss!= null)&&this.abyss.equals(rhs.abyss))))&&((this.ftm == rhs.ftm)||((this.ftm!= null)&&this.ftm.equals(rhs.ftm))))&&((this.ftt == rhs.ftt)||((this.ftt!= null)&&this.ftt.equals(rhs.ftt))))&&((this.vest == rhs.vest)||((this.vest!= null)&&this.vest.equals(rhs.vest))))&&((this.snc == rhs.snc)||((this.snc!= null)&&this.snc.equals(rhs.snc))))&&((this.trst == rhs.trst)||((this.trst!= null)&&this.trst.equals(rhs.trst))))&&((this.blt == rhs.blt)||((this.blt!= null)&&this.blt.equals(rhs.blt))))&&((this.ftx == rhs.ftx)||((this.ftx!= null)&&this.ftx.equals(rhs.ftx))))&&((this.dpy == rhs.dpy)||((this.dpy!= null)&&this.dpy.equals(rhs.dpy))))&&((this.blz == rhs.blz)||((this.blz!= null)&&this.blz.equals(rhs.blz))))&&((this.snm == rhs.snm)||((this.snm!= null)&&this.snm.equals(rhs.snm))))&&((this.la == rhs.la)||((this.la!= null)&&this.la.equals(rhs.la))))&&((this.snt == rhs.snt)||((this.snt!= null)&&this.snt.equals(rhs.snt))))&&((this.bmc == rhs.bmc)||((this.bmc!= null)&&this.bmc.equals(rhs.bmc))))&&((this.mtkn == rhs.mtkn)||((this.mtkn!= null)&&this.mtkn.equals(rhs.mtkn))))&&((this.sns == rhs.sns)||((this.sns!= null)&&this.sns.equals(rhs.sns))))&&((this.bmh == rhs.bmh)||((this.bmh!= null)&&this.bmh.equals(rhs.bmh))))&&((this.snx == rhs.snx)||((this.snx!= null)&&this.snx.equals(rhs.snx))))&&((this.fun == rhs.fun)||((this.fun!= null)&&this.fun.equals(rhs.fun))))&&((this.xbase == rhs.xbase)||((this.xbase!= null)&&this.xbase.equals(rhs.xbase))))&&((this.hyt == rhs.hyt)||((this.hyt!= null)&&this.hyt.equals(rhs.hyt))))&&((this.sxdt == rhs.sxdt)||((this.sxdt!= null)&&this.sxdt.equals(rhs.sxdt))))&&((this.soc == rhs.soc)||((this.soc!= null)&&this.soc.equals(rhs.soc))))&&((this.use == rhs.use)||((this.use!= null)&&this.use.equals(rhs.use))))&&((this.qkc == rhs.qkc)||((this.qkc!= null)&&this.qkc.equals(rhs.qkc))))&&((this.xclr == rhs.xclr)||((this.xclr!= null)&&this.xclr.equals(rhs.xclr))))&&((this.bmx == rhs.bmx)||((this.bmx!= null)&&this.bmx.equals(rhs.bmx))))&&((this.voise == rhs.voise)||((this.voise!= null)&&this.voise.equals(rhs.voise))))&&((this.aidoc == rhs.aidoc)||((this.aidoc!= null)&&this.aidoc.equals(rhs.aidoc))))&&((this.drg == rhs.drg)||((this.drg!= null)&&this.drg.equals(rhs.drg))))&&((this.mco == rhs.mco)||((this.mco!= null)&&this.mco.equals(rhs.mco))))&&((this.noah == rhs.noah)||((this.noah!= null)&&this.noah.equals(rhs.noah))))&&((this.bnk == rhs.bnk)||((this.bnk!= null)&&this.bnk.equals(rhs.bnk))))&&((this.rntb == rhs.rntb)||((this.rntb!= null)&&this.rntb.equals(rhs.rntb))))&&((this.bnn == rhs.bnn)||((this.bnn!= null)&&this.bnn.equals(rhs.bnn))))&&((this.drt == rhs.drt)||((this.drt!= null)&&this.drt.equals(rhs.drt))))&&((this.spf == rhs.spf)||((this.spf!= null)&&this.spf.equals(rhs.spf))))&&((this.bnt == rhs.bnt)||((this.bnt!= null)&&this.bnt.equals(rhs.bnt))))&&((this.mda == rhs.mda)||((this.mda!= null)&&this.mda.equals(rhs.mda))))&&((this.utk == rhs.utk)||((this.utk!= null)&&this.utk.equals(rhs.utk))))&&((this.dacc == rhs.dacc)||((this.dacc!= null)&&this.dacc.equals(rhs.dacc))))&&((this.bob == rhs.bob)||((this.bob!= null)&&this.bob.equals(rhs.bob))))&&((this.utt == rhs.utt)||((this.utt!= null)&&this.utt.equals(rhs.utt))))&&((this.foxt == rhs.foxt)||((this.foxt!= null)&&this.foxt.equals(rhs.foxt))))&&((this.spt == rhs.spt)||((this.spt!= null)&&this.spt.equals(rhs.spt))))&&((this._1st == rhs._1st)||((this._1st!= null)&&this._1st.equals(rhs._1st))))&&((this.boe == rhs.boe)||((this.boe!= null)&&this.boe.equals(rhs.boe))))&&((this.spx == rhs.spx)||((this.spx!= null)&&this.spx.equals(rhs.spx))))&&((this.mds == rhs.mds)||((this.mds!= null)&&this.mds.equals(rhs.mds))))&&((this.nuls == rhs.nuls)||((this.nuls!= null)&&this.nuls.equals(rhs.nuls))))&&((this.mixi == rhs.mixi)||((this.mixi!= null)&&this.mixi.equals(rhs.mixi))))&&((this.bon == rhs.bon)||((this.bon!= null)&&this.bon.equals(rhs.bon))))&&((this.candy == rhs.candy)||((this.candy!= null)&&this.candy.equals(rhs.candy))))&&((this.bot == rhs.bot)||((this.bot!= null)&&this.bot.equals(rhs.bot))))&&((this.seal == rhs.seal)||((this.seal!= null)&&this.seal.equals(rhs.seal))))&&((this.box == rhs.box)||((this.box!= null)&&this.box.equals(rhs.box))))&&((this.mee == rhs.mee)||((this.mee!= null)&&this.mee.equals(rhs.mee))))&&((this.wys == rhs.wys)||((this.wys!= null)&&this.wys.equals(rhs.wys))))&&((this.oio == rhs.oio)||((this.oio!= null)&&this.oio.equals(rhs.oio))))&&((this.uuu == rhs.uuu)||((this.uuu!= null)&&this.uuu.equals(rhs.uuu))))&&((this.dth == rhs.dth)||((this.dth!= null)&&this.dth.equals(rhs.dth))))&&((this.kan == rhs.kan)||((this.kan!= null)&&this.kan.equals(rhs.kan))))&&((this.drgn == rhs.drgn)||((this.drgn!= null)&&this.drgn.equals(rhs.drgn))))&&((this.nobs == rhs.nobs)||((this.nobs!= null)&&this.nobs.equals(rhs.nobs))))&&((this.dtr == rhs.dtr)||((this.dtr!= null)&&this.dtr.equals(rhs.dtr))))&&((this.fxt == rhs.fxt)||((this.fxt!= null)&&this.fxt.equals(rhs.fxt))))&&((this.bether == rhs.bether)||((this.bether!= null)&&this.bether.equals(rhs.bether))))&&((this.boltt == rhs.boltt)||((this.boltt!= null)&&this.boltt.equals(rhs.boltt))))&&((this.bpt == rhs.bpt)||((this.bpt!= null)&&this.bpt.equals(rhs.bpt))))&&((this.dtx == rhs.dtx)||((this.dtx!= null)&&this.dtx.equals(rhs.dtx))))&&((this.bpx == rhs.bpx)||((this.bpx!= null)&&this.bpx.equals(rhs.bpx))))&&((this.dadi == rhs.dadi)||((this.dadi!= null)&&this.dadi.equals(rhs.dadi))))&&((this.kbc == rhs.kbc)||((this.kbc!= null)&&this.kbc.equals(rhs.kbc))))&&((this.srn == rhs.srn)||((this.srn!= null)&&this.srn.equals(rhs.srn))))&&((this.mfg == rhs.mfg)||((this.mfg!= null)&&this.mfg.equals(rhs.mfg))))&&((this.pareto == rhs.pareto)||((this.pareto!= null)&&this.pareto.equals(rhs.pareto))))&&((this.earth == rhs.earth)||((this.earth!= null)&&this.earth.equals(rhs.earth))))&&((this.mft == rhs.mft)||((this.mft!= null)&&this.mft.equals(rhs.mft))))&&((this.fyp == rhs.fyp)||((this.fyp!= null)&&this.fyp.equals(rhs.fyp))))&&((this.ipsx == rhs.ipsx)||((this.ipsx!= null)&&this.ipsx.equals(rhs.ipsx))))&&((this.asto == rhs.asto)||((this.asto!= null)&&this.asto.equals(rhs.asto))))&&((this.cofi == rhs.cofi)||((this.cofi!= null)&&this.cofi.equals(rhs.cofi))))&&((this.dagt == rhs.dagt)||((this.dagt!= null)&&this.dagt.equals(rhs.dagt))))&&((this.okb == rhs.okb)||((this.okb!= null)&&this.okb.equals(rhs.okb))))&&((this.mgo == rhs.mgo)||((this.mgo!= null)&&this.mgo.equals(rhs.mgo))))&&((this.brd == rhs.brd)||((this.brd!= null)&&this.brd.equals(rhs.brd))))&&((this.kcs == rhs.kcs)||((this.kcs!= null)&&this.kcs.equals(rhs.kcs))))&&((this.csno == rhs.csno)||((this.csno!= null)&&this.csno.equals(rhs.csno))))&&((this.btrn == rhs.btrn)||((this.btrn!= null)&&this.btrn.equals(rhs.btrn))))&&((this._1wo == rhs._1wo)||((this._1wo!= null)&&this._1wo.equals(rhs._1wo))))&&((this.metm == rhs.metm)||((this.metm!= null)&&this.metm.equals(rhs.metm))))&&((this.stc == rhs.stc)||((this.stc!= null)&&this.stc.equals(rhs.stc))))&&((this.zap == rhs.zap)||((this.zap!= null)&&this.zap.equals(rhs.zap))))&&((this.dent == rhs.dent)||((this.dent!= null)&&this.dent.equals(rhs.dent))))&&((this.ole == rhs.ole)||((this.ole!= null)&&this.ole.equals(rhs.ole))))&&((this.bcpt == rhs.bcpt)||((this.bcpt!= null)&&this.bcpt.equals(rhs.bcpt))))&&((this.mtrc == rhs.mtrc)||((this.mtrc!= null)&&this.mtrc.equals(rhs.mtrc))))&&((this.stk == rhs.stk)||((this.stk!= null)&&this.stk.equals(rhs.stk))))&&((this.betr == rhs.betr)||((this.betr!= null)&&this.betr.equals(rhs.betr))))&&((this.horse == rhs.horse)||((this.horse!= null)&&this.horse.equals(rhs.horse))))&&((this.stq == rhs.stq)||((this.stq!= null)&&this.stq.equals(rhs.stq))))&&((this.stu == rhs.stu)||((this.stu!= null)&&this.stu.equals(rhs.stu))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))))&&((this.olt == rhs.olt)||((this.olt!= null)&&this.olt.equals(rhs.olt))))&&((this.stx == rhs.stx)||((this.stx!= null)&&this.stx.equals(rhs.stx))))&&((this.sub == rhs.sub)||((this.sub!= null)&&this.sub.equals(rhs.sub))))&&((this.bsv == rhs.bsv)||((this.bsv!= null)&&this.bsv.equals(rhs.bsv))))&&((this.mic == rhs.mic)||((this.mic!= null)&&this.mic.equals(rhs.mic))))&&((this.omg == rhs.omg)||((this.omg!= null)&&this.omg.equals(rhs.omg))))&&((this.wbtc == rhs.wbtc)||((this.wbtc!= null)&&this.wbtc.equals(rhs.wbtc))))&&((this.btc == rhs.btc)||((this.btc!= null)&&this.btc.equals(rhs.btc))))&&((this.sur == rhs.sur)||((this.sur!= null)&&this.sur.equals(rhs.sur))))&&((this.b2b == rhs.b2b)||((this.b2b!= null)&&this.b2b.equals(rhs.b2b))))&&((this.btm == rhs.btm)||((this.btm!= null)&&this.btm.equals(rhs.btm))))&&((this.frec == rhs.frec)||((this.frec!= null)&&this.frec.equals(rhs.frec))))&&((this.omx == rhs.omx)||((this.omx!= null)&&this.omx.equals(rhs.omx))))&&((this.bto == rhs.bto)||((this.bto!= null)&&this.bto.equals(rhs.bto))))&&((this.free == rhs.free)||((this.free!= null)&&this.free.equals(rhs.free))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.ss == rhs.ss)||((this.ss!= null)&&this.ss.equals(rhs.ss))))&&((this.svd == rhs.svd)||((this.svd!= null)&&this.svd.equals(rhs.svd))))&&((this.dxt == rhs.dxt)||((this.dxt!= null)&&this.dxt.equals(rhs.dxt))))&&((this.btu == rhs.btu)||((this.btu!= null)&&this.btu.equals(rhs.btu))))&&((this.storm == rhs.storm)||((this.storm!= null)&&this.storm.equals(rhs.storm))))&&((this.star == rhs.star)||((this.star!= null)&&this.star.equals(rhs.star))))&&((this.zcn == rhs.zcn)||((this.zcn!= null)&&this.zcn.equals(rhs.zcn))))&&((this.zco == rhs.zco)||((this.zco!= null)&&this.zco.equals(rhs.zco))))&&((this.dgtx == rhs.dgtx)||((this.dgtx!= null)&&this.dgtx.equals(rhs.dgtx))))&&((this.ong == rhs.ong)||((this.ong!= null)&&this.ong.equals(rhs.ong))))&&((this.onl == rhs.onl)||((this.onl!= null)&&this.onl.equals(rhs.onl))))&&((this.storj == rhs.storj)||((this.storj!= null)&&this.storj.equals(rhs.storj))))&&((this.mrph == rhs.mrph)||((this.mrph!= null)&&this.mrph.equals(rhs.mrph))))&&((this.bud == rhs.bud)||((this.bud!= null)&&this.bud.equals(rhs.bud))))&&((this.hedg == rhs.hedg)||((this.hedg!= null)&&this.hedg.equals(rhs.hedg))))&&((this.face == rhs.face)||((this.face!= null)&&this.face.equals(rhs.face))))&&((this.ugas == rhs.ugas)||((this.ugas!= null)&&this.ugas.equals(rhs.ugas))))&&((this.zeon == rhs.zeon)||((this.zeon!= null)&&this.zeon.equals(rhs.zeon))))&&((this.mana == rhs.mana)||((this.mana!= null)&&this.mana.equals(rhs.mana))))&&((this.cmct == rhs.cmct)||((this.cmct!= null)&&this.cmct.equals(rhs.cmct))))&&((this.stac == rhs.stac)||((this.stac!= null)&&this.stac.equals(rhs.stac))))&&((this.ruff == rhs.ruff)||((this.ruff!= null)&&this.ruff.equals(rhs.ruff))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.swc == rhs.swc)||((this.swc!= null)&&this.swc.equals(rhs.swc))))&&((this.berry == rhs.berry)||((this.berry!= null)&&this.berry.equals(rhs.berry))))&&((this.joint == rhs.joint)||((this.joint!= null)&&this.joint.equals(rhs.joint))))&&((this.orme == rhs.orme)||((this.orme!= null)&&this.orme.equals(rhs.orme))))&&((this.qsp == rhs.qsp)||((this.qsp!= null)&&this.qsp.equals(rhs.qsp))))&&((this.swt == rhs.swt)||((this.swt!= null)&&this.swt.equals(rhs.swt))))&&((this.loom == rhs.loom)||((this.loom!= null)&&this.loom.equals(rhs.loom))))&&((this.icn == rhs.icn)||((this.icn!= null)&&this.icn.equals(rhs.icn))))&&((this.mkr == rhs.mkr)||((this.mkr!= null)&&this.mkr.equals(rhs.mkr))))&&((this.amlt == rhs.amlt)||((this.amlt!= null)&&this.amlt.equals(rhs.amlt))))&&((this.zec == rhs.zec)||((this.zec!= null)&&this.zec.equals(rhs.zec))))&&((this.up == rhs.up)||((this.up!= null)&&this.up.equals(rhs.up))))&&((this.invc == rhs.invc)||((this.invc!= null)&&this.invc.equals(rhs.invc))))&&((this.idh == rhs.idh)||((this.idh!= null)&&this.idh.equals(rhs.idh))))&&((this.mln == rhs.mln)||((this.mln!= null)&&this.mln.equals(rhs.mln))))&&((this.opt == rhs.opt)||((this.opt!= null)&&this.opt.equals(rhs.opt))))&&((this.solve == rhs.solve)||((this.solve!= null)&&this.solve.equals(rhs.solve))))&&((this.idt == rhs.idt)||((this.idt!= null)&&this.idt.equals(rhs.idt))))&&((this.tfuel == rhs.tfuel)||((this.tfuel!= null)&&this.tfuel.equals(rhs.tfuel))))&&((this.xbb == rhs.xbb)||((this.xbb!= null)&&this.xbb.equals(rhs.xbb))))&&((this.cennz == rhs.cennz)||((this.cennz!= null)&&this.cennz.equals(rhs.cennz))))&&((this.skrb == rhs.skrb)||((this.skrb!= null)&&this.skrb.equals(rhs.skrb))))&&((this.bwt == rhs.bwt)||((this.bwt!= null)&&this.bwt.equals(rhs.bwt))))&&((this.coin == rhs.coin)||((this.coin!= null)&&this.coin.equals(rhs.coin))))&&((this.rhoc == rhs.rhoc)||((this.rhoc!= null)&&this.rhoc.equals(rhs.rhoc))))&&((this.drop == rhs.drop)||((this.drop!= null)&&this.drop.equals(rhs.drop))))&&((this.xbl == rhs.xbl)||((this.xbl!= null)&&this.xbl.equals(rhs.xbl))))&&((this.qun == rhs.qun)||((this.qun!= null)&&this.qun.equals(rhs.qun))))&&((this.life == rhs.life)||((this.life!= null)&&this.life.equals(rhs.life))))&&((this.xbx == rhs.xbx)||((this.xbx!= null)&&this.xbx.equals(rhs.xbx))))&&((this.inxt == rhs.inxt)||((this.inxt!= null)&&this.inxt.equals(rhs.inxt))))&&((this.kin == rhs.kin)||((this.kin!= null)&&this.kin.equals(rhs.kin))))&&((this.noku == rhs.noku)||((this.noku!= null)&&this.noku.equals(rhs.noku))))&&((this.xcd == rhs.xcd)||((this.xcd!= null)&&this.xcd.equals(rhs.xcd))))&&((this.wt == rhs.wt)||((this.wt!= null)&&this.wt.equals(rhs.wt))))&&((this.eurs == rhs.eurs)||((this.eurs!= null)&&this.eurs.equals(rhs.eurs))))&&((this.mnc == rhs.mnc)||((this.mnc!= null)&&this.mnc.equals(rhs.mnc))))&&((this.mne == rhs.mne)||((this.mne!= null)&&this.mne.equals(rhs.mne))))&&((this.ori == rhs.ori)||((this.ori!= null)&&this.ori.equals(rhs.ori))))&&((this.dtrc == rhs.dtrc)||((this.dtrc!= null)&&this.dtrc.equals(rhs.dtrc))))&&((this.ors == rhs.ors)||((this.ors!= null)&&this.ors.equals(rhs.ors))))&&((this.ift == rhs.ift)||((this.ift!= null)&&this.ift.equals(rhs.ift))))&&((this.osa == rhs.osa)||((this.osa!= null)&&this.osa.equals(rhs.osa))))&&((this.hydro == rhs.hydro)||((this.hydro!= null)&&this.hydro.equals(rhs.hydro))))&&((this.mof == rhs.mof)||((this.mof!= null)&&this.mof.equals(rhs.mof))))&&((this.coni == rhs.coni)||((this.coni!= null)&&this.coni.equals(rhs.coni))))&&((this.ost == rhs.ost)||((this.ost!= null)&&this.ost.equals(rhs.ost))))&&((this.mot == rhs.mot)||((this.mot!= null)&&this.mot.equals(rhs.mot))))&&((this._int == rhs._int)||((this._int!= null)&&this._int.equals(rhs._int))))&&((this.zil == rhs.zil)||((this.zil!= null)&&this.zil.equals(rhs.zil))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.ihf == rhs.ihf)||((this.ihf!= null)&&this.ihf.equals(rhs.ihf))))&&((this.xet == rhs.xet)||((this.xet!= null)&&this.xet.equals(rhs.xet))))&&((this.xes == rhs.xes)||((this.xes!= null)&&this.xes.equals(rhs.xes))))&&((this.quant == rhs.quant)||((this.quant!= null)&&this.quant.equals(rhs.quant))))&&((this.srch == rhs.srch)||((this.srch!= null)&&this.srch.equals(rhs.srch))))&&((this.iht == rhs.iht)||((this.iht!= null)&&this.iht.equals(rhs.iht))))&&((this.zt == rhs.zt)||((this.zt!= null)&&this.zt.equals(rhs.zt))))&&((this.drpu == rhs.drpu)||((this.drpu!= null)&&this.drpu.equals(rhs.drpu))))&&((this.daoc == rhs.daoc)||((this.daoc!= null)&&this.daoc.equals(rhs.daoc))))&&((this.idex == rhs.idex)||((this.idex!= null)&&this.idex.equals(rhs.idex))))&&((this.gem == rhs.gem)||((this.gem!= null)&&this.gem.equals(rhs.gem))))&&((this.robet == rhs.robet)||((this.robet!= null)&&this.robet.equals(rhs.robet))))&&((this.rock == rhs.rock)||((this.rock!= null)&&this.rock.equals(rhs.rock))))&&((this.knc == rhs.knc)||((this.knc!= null)&&this.knc.equals(rhs.knc))))&&((this.ebc == rhs.ebc)||((this.ebc!= null)&&this.ebc.equals(rhs.ebc))))&&((this.mrk == rhs.mrk)||((this.mrk!= null)&&this.mrk.equals(rhs.mrk))))&&((this.shping == rhs.shping)||((this.shping!= null)&&this.shping.equals(rhs.shping))))&&((this.daps == rhs.daps)||((this.daps!= null)&&this.daps.equals(rhs.daps))))&&((this.mwat == rhs.mwat)||((this.mwat!= null)&&this.mwat.equals(rhs.mwat))))&&((this.zla == rhs.zla)||((this.zla!= null)&&this.zla.equals(rhs.zla))))&&((this.wings == rhs.wings)||((this.wings!= null)&&this.wings.equals(rhs.wings))))&&((this.xaur == rhs.xaur)||((this.xaur!= null)&&this.xaur.equals(rhs.xaur))))&&((this.sntvt == rhs.sntvt)||((this.sntvt!= null)&&this.sntvt.equals(rhs.sntvt))))&&((this.thrt == rhs.thrt)||((this.thrt!= null)&&this.thrt.equals(rhs.thrt))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.seele == rhs.seele)||((this.seele!= null)&&this.seele.equals(rhs.seele))))&&((this.poll == rhs.poll)||((this.poll!= null)&&this.poll.equals(rhs.poll))))&&((this.gusd == rhs.gusd)||((this.gusd!= null)&&this.gusd.equals(rhs.gusd))))&&((this.vee == rhs.vee)||((this.vee!= null)&&this.vee.equals(rhs.vee))))&&((this.zmn == rhs.zmn)||((this.zmn!= null)&&this.zmn.equals(rhs.zmn))))&&((this.mtc == rhs.mtc)||((this.mtc!= null)&&this.mtc.equals(rhs.mtc))))&&((this.mth == rhs.mth)||((this.mth!= null)&&this.mth.equals(rhs.mth))))&&((this.vet == rhs.vet)||((this.vet!= null)&&this.vet.equals(rhs.vet))))&&((this.like == rhs.like)||((this.like!= null)&&this.like.equals(rhs.like))))&&((this.blnm == rhs.blnm)||((this.blnm!= null)&&this.blnm.equals(rhs.blnm))))&&((this.edg == rhs.edg)||((this.edg!= null)&&this.edg.equals(rhs.edg))))&&((this.m2o == rhs.m2o)||((this.m2o!= null)&&this.m2o.equals(rhs.m2o))))&&((this.sent == rhs.sent)||((this.sent!= null)&&this.sent.equals(rhs.sent))))&&((this.edn == rhs.edn)||((this.edn!= null)&&this.edn.equals(rhs.edn))))&&((this.aergo == rhs.aergo)||((this.aergo!= null)&&this.aergo.equals(rhs.aergo))))&&((this.bloc == rhs.bloc)||((this.bloc!= null)&&this.bloc.equals(rhs.bloc))))&&((this.mtx == rhs.mtx)||((this.mtx!= null)&&this.mtx.equals(rhs.mtx))))&&((this.edo == rhs.edo)||((this.edo!= null)&&this.edo.equals(rhs.edo))))&&((this.senc == rhs.senc)||((this.senc!= null)&&this.senc.equals(rhs.senc))))&&((this.edu == rhs.edu)||((this.edu!= null)&&this.edu.equals(rhs.edu))))&&((this.dash == rhs.dash)||((this.dash!= null)&&this.dash.equals(rhs.dash))))&&((this.lina == rhs.lina)||((this.lina!= null)&&this.lina.equals(rhs.lina))))&&((this.srcoin == rhs.srcoin)||((this.srcoin!= null)&&this.srcoin.equals(rhs.srcoin))))&&((this.cag == rhs.cag)||((this.cag!= null)&&this.cag.equals(rhs.cag))))&&((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link))))&&((this.hero == rhs.hero)||((this.hero!= null)&&this.hero.equals(rhs.hero))))&&((this.tbx == rhs.tbx)||((this.tbx!= null)&&this.tbx.equals(rhs.tbx))))&&((this.bubo == rhs.bubo)||((this.bubo!= null)&&this.bubo.equals(rhs.bubo))))&&((this.erc20 == rhs.erc20)||((this.erc20 != null)&&this.erc20 .equals(rhs.erc20))))&&((this.can == rhs.can)||((this.can!= null)&&this.can.equals(rhs.can))))&&((this.imt == rhs.imt)||((this.imt!= null)&&this.imt.equals(rhs.imt))))&&((this.car == rhs.car)||((this.car!= null)&&this.car.equals(rhs.car))))&&((this.tch == rhs.tch)||((this.tch!= null)&&this.tch.equals(rhs.tch))))&&((this.bouts == rhs.bouts)||((this.bouts!= null)&&this.bouts.equals(rhs.bouts))))&&((this.ind == rhs.ind)||((this.ind!= null)&&this.ind.equals(rhs.ind))))&&((this.mvl == rhs.mvl)||((this.mvl!= null)&&this.mvl.equals(rhs.mvl))))&&((this.ebtc == rhs.ebtc)||((this.ebtc!= null)&&this.ebtc.equals(rhs.ebtc))))&&((this.ing == rhs.ing)||((this.ing!= null)&&this.ing.equals(rhs.ing))))&&((this.krl == rhs.krl)||((this.krl!= null)&&this.krl.equals(rhs.krl))))&&((this.tct == rhs.tct)||((this.tct!= null)&&this.tct.equals(rhs.tct))))&&((this.cbc == rhs.cbc)||((this.cbc!= null)&&this.cbc.equals(rhs.cbc))))&&((this.cosm == rhs.cosm)||((this.cosm!= null)&&this.cosm.equals(rhs.cosm))))&&((this.mntp == rhs.mntp)||((this.mntp!= null)&&this.mntp.equals(rhs.mntp))))&&((this.datx == rhs.datx)||((this.datx!= null)&&this.datx.equals(rhs.datx))))&&((this.ins == rhs.ins)||((this.ins!= null)&&this.ins.equals(rhs.ins))))&&((this.inx == rhs.inx)||((this.inx!= null)&&this.inx.equals(rhs.inx))))&&((this.sxut == rhs.sxut)||((this.sxut!= null)&&this.sxut.equals(rhs.sxut))))&&((this.cbt == rhs.cbt)||((this.cbt!= null)&&this.cbt.equals(rhs.cbt))))&&((this.swarm == rhs.swarm)||((this.swarm!= null)&&this.swarm.equals(rhs.swarm))))&&((this.ledu == rhs.ledu)||((this.ledu!= null)&&this.ledu.equals(rhs.ledu))))&&((this.poly == rhs.poly)||((this.poly!= null)&&this.poly.equals(rhs.poly))))&&((this.zpr == rhs.zpr)||((this.zpr!= null)&&this.zpr.equals(rhs.zpr))))&&((this.bnty == rhs.bnty)||((this.bnty!= null)&&this.bnty.equals(rhs.bnty))));
    }

}
